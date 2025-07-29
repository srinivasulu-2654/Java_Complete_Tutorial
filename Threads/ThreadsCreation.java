package Threads;

// ✅ Task class that implements Runnable
class LearningMultiThreading implements Runnable {

    // This method defines the task to perform
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}

public class ThreadsCreation {

    public static void main(String[] args) {

        System.out.println("Going inside main method: " + Thread.currentThread().getName());

        // ✅ 1. Create a Runnable object (defines the task)
        LearningMultiThreading runnableObj = new LearningMultiThreading();

        // ✅ 2. Create a Thread object and pass Runnable to it (assign worker + work)
        Thread r = new Thread(runnableObj);

        // ✅ 3. Start the thread (creates a new thread that runs runnableObj's run() method)
        r.start();

        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}





/*

runnableObj is the work order (task instructions in run() method).

r (Thread) is the worker who will perform that task when started.

 🔷 📝 Explanation Summary (paste these comments in your notes):
Runnable = What to do (task)

Thread = Who does it (worker)

start() = Creates new thread + runs run() in that thread

run() called directly = Normal method call in main thread (no new thread created)
 
# 🧵 Java Multi-Threading: Complete Overview

## ✅ **What is a Thread?**

- A **Thread** is a **unit of execution** within a process.
- It allows **concurrent execution** of two or more parts of a program for maximum utilization of CPU.

---

## 🔷 **Why do we need Threads?**

### 🔴 **Without threads (Single-threaded program):**

- Tasks execute **sequentially** (one after another).
- Example:
  ```java
  downloadFile(); // takes 10 sec
  updateDatabase();
  sendEmail();



  | **Code**                                                             | **Real meaning**                                                           |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `LearningMultiThreading runnableObj = new LearningMultiThreading();` | Define **what task to perform** (task: print thread name)                  |
| `Thread r = new Thread(runnableObj);`                                | Create a **worker (Thread r)** and give it the task to do                  |
| `r.start();`                                                         | Start the **worker** – it runs the **task’s run() method** in a new thread |



  Explore the question -> vv.v.v.v..v. Imp => what is the purpose of threads?


  🔁 Transitions Summary:

  | Action                       | From          | To            |
| ---------------------------- | ------------- | ------------- |
| `start()`                    | New           | Runnable      |
| CPU assigned                 | Runnable      | Running       |
| `run()` completes            | Running       | Terminated    |
| `sleep()` / `join()`         | Running       | Timed Waiting |
| `wait()`                     | Running       | Waiting       |
| `synchronized` but lock busy | Running       | Blocked       |
| `notify()`                   | Waiting       | Runnable      |
| I/O/Lock ready               | Blocked       | Runnable      |
| Timeout ends                 | Timed Waiting | Runnable      |


   
 */