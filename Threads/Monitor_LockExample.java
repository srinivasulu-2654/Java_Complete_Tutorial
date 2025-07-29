package Threads;

public class Monitor_LockExample {
    
    public synchronized void task1()
    {
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
        }
        catch(Exception e)
        {

        }
    }

    public void task2() 
    {
        System.out.println("task2, but before synchronized");

        synchronized(this) {
            System.out.println("task2 inside synchronized");
        }
    }

    public void task3()
    {
        System.out.println("task3");
    }

    public static void main(String[] args)
    {
        Monitor_LockExample obj = new Monitor_LockExample();

        MonitorThread1Runnable runnableObj = new MonitorThread1Runnable(obj);
        Thread t1 = new Thread(runnableObj);

        
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        t1.start();
        t2.start();
        t3.start();
    }
}

/* 
  v.v.v.v.v ImP***********
  
 * 🔐 Let's understand thread locking:
 * ✅ task1() is a synchronized method, which means:
 * It acquires monitor lock on the object obj.
 * 
 * Until this lock is released (after 10 seconds sleep), no other thread can
 * enter any synchronized block or method on the same object.
 * 
 * ✅ task2() has:
 * Normal print task2, but before synchronized → executes immediately (no lock).
 * 
 * Then it enters synchronized(this) → needs lock on obj.
 * 
 * ✅ task3() is not synchronized:
 * So it doesn’t care about any lock. Executes immediately.
 */

/*

✅ Final Output Summary:

Inside task1                       ← t1 got lock and started
task3                              ← t3 doesn't need lock, so it prints
task2, but before synchronized     ← t2 prints this without needing lock
task2 inside synchronized          ← t2 prints this only after t1 releases the lock

 */



/*
 🔷 💡 Key Takeaways
✅ synchronized method (task1) + synchronized block (task2) both acquire same monitor lock of obj.
✅ Non-synchronized methods (task3) do not require any lock and execute immediately.
✅ Demonstrates how monitor lock ensures only one thread can enter synchronized code of the same object at a time.
 */
