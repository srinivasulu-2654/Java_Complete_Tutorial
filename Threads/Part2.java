package Threads;

class LearningMultiThreading extends Thread {
    public void run()
    {
        System.out.println("Code Executed by thread: " + Thread.currentThread().getName());
    }
}

public class Part2 {
    
    public static void main(String[] args) {
           
        System.out.println("Going main inside: " + Thread.currentThread().getName());

        LearningMultiThreading myThread = new LearningMultiThreading();
        myThread.start();
        System.out.println("Finish main Method: " + Thread.currentThread().getName());
    }
}


// ******** MONITOR LOCKS********* -> V.V.V.V..V. IMP************

/*
  So here explore the monitor lock ;

    Let's say there are 2 threads that should share the same object like this 

    public class className {
       
    synchronised void method1() 
    {
       // ssome code
     }

    }

    public static void main(String[] args)
    {
       className obj = new className();
       obj.method1();

    }

    => Here if Thread1 is using method1() anothere thread2 is blocked because we are using synchronised if we are using thread 2 then it monitor lock will relase another thread will use this 

     -> each object has monitor lock
   
    // ******** MONITOR LOCKS ********* -> V.V.V.V.V. IMP ************
//
// ✅ What is Monitor Lock?
// - Every Java object has an **intrinsic monitor lock**.
// - Used to achieve synchronization to prevent concurrent access problems.
//
// ✅ How synchronized works?
// - When a thread calls a **synchronized method**:
//   ➔ It must acquire that object’s monitor lock.
// - While one thread holds the lock,
//   ➔ Other threads trying to call synchronized methods on same object are **blocked (waiting)**.
//
// ✅ Example flow:
// - Thread1 acquires obj's monitor lock and executes synchronized method1().
// - If Thread2 tries to call method1() on same obj at the same time:
//   ➔ Thread2 is blocked until Thread1 releases the lock.
//
// ✅ When is monitor lock released?
// - Automatically released when synchronized method/block completes execution.
//
// ✅ Real-life analogy:
// - Monitor lock = ATM room key.
// - Only one person (thread) can enter and use ATM at a time.
// - Others wait outside until key (lock) is released.
//
// ✅ Why monitor lock is important?
// - Ensures **thread safety** when multiple threads access shared data.
// - Prevents **race conditions** and data inconsistency.
//
// ✅ Final one-line takeaway:
// - “Synchronized methods use object’s monitor lock to ensure only one thread executes them at a time, providing thread safety.”


 */



// ***********Explanation code for 1st code ✅ 🔷 Explanation for Code 1 (Implements Runnable)*****************


// ✅ Code 1 Explanation:
//
// LearningMultiThreading implements Runnable
// ➔ Defines the TASK to perform (run() method).
//
// LearningMultiThreading runnableObj = new LearningMultiThreading();
// ➔ Creates the TASK object.
//
// Thread r = new Thread(runnableObj);
// ➔ Creates a WORKER (Thread object) and assigns the TASK to it.
//
// r.start();
// ➔ Starts the WORKER (Thread r) which executes the TASK's run() method in a NEW THREAD.
//
// 🔴 Key Points:
// - Runnable = what to do (task).
// - Thread = who does it (worker).
// - Preferred approach in real projects as it allows extending other classes and follows clean design.


// ********* Explanation for code 2 ✅ 🔷 Explanation for Code 2 (Extends Thread)***********

// ✅ Code 2 Explanation:
//
// LearningMultiThreading extends Thread
// ➔ Class itself becomes the WORKER (Thread) and defines its TASK (run() method).
//
// LearningMultiThreading myThread = new LearningMultiThreading();
// ➔ Creates a Thread object (also has task inside).
//
// myThread.start();
// ➔ Starts this Thread object (worker), which calls its own run() method in a NEW THREAD.
//
// 🔴 Key Points:
// - Combines worker + task in same class.
// - Cannot extend any other class (due to single inheritance).
// - Simpler for quick examples but not preferred for real-world applications.



// ******************Final Difference************

// ✅ Runnable vs Thread Summary:
//
// Runnable:
// - Defines TASK only.
// - Thread object created separately to execute task.
// - More flexible, preferred design.
//
// Thread:
// - Class itself is both WORKER and TASK.
// - Less flexible, not preferred in large applications.
