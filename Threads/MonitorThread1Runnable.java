package Threads;

public class MonitorThread1Runnable implements Runnable {

   Monitor_LockExample obj;

   MonitorThread1Runnable(Monitor_LockExample obj) {
       this.obj = obj;
   }

    @Override
    public void run()
    {
        obj.task1();
    }
}
