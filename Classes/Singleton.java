package Classes;

public class Singleton {
    
}

/* 
   This class objective is  to create only 1 and 1 object 

   Here are the ways to create the singleon class

     | #   | Singleton Type / Method                      | Key Feature                                                    |
| --- | -------------------------------------------- | -------------------------------------------------------------- |
| 1️⃣ | **Eager Initialization**                     | Instance created at class loading                              |
| 2️⃣ | **Lazy Initialization**                      | Instance created when needed (lazy)                            |
| 3️⃣ | **Synchronized Method**                      | Thread-safe, slower                                            |
| 4️⃣ | **Double-Checked Locking**                   | Thread-safe + fast                                             |
| 5️⃣ | **Bill Pugh Singleton** (Static Inner Class) | Lazy-loaded + thread-safe without synchronization              |
| 6️⃣ | **Enum Singleton**                           | Simplest and best (prevents reflection + serialization issues) |
| 7️⃣ | **Using Java Reflection Safeguard**          | Handling reflection to stop breaking singleton                 |
| 8️⃣ | **Serialization Safe Singleton**             | Handling `readResolve()` to return same instance               |


   🔴 Problem: Why is Singleton needed?
Imagine you have a class like:

DatabaseConnectionManager

Logger

ConfigurationManager

CacheManager

PrinterSpooler

You don’t want to create 5 different objects for these. Why?

❌ Multiple objects waste memory, create inconsistency, or break things (e.g., 2 DB connections trying to do same job) 

// Explore above very in depth

-> So here the point came up wtih this because if we don't use the obbject created then the memory will be wasted so we came up with other 
   concept called lazy method   -- > explore in chatgpt


   ********Lazy intialization *************


🌱 What is Lazy Initialization?
Lazy Initialization means:

The Singleton object is not created until it's actually needed (i.e., when getInstance() is called).

Lazy Initialization = Lazy loading the object when needed only.

It's good for performance and memory but needs careful handling in multi-threaded environments.

 Problem:
You break the Singleton rule (only one object allowed)

Now the app has two different objects behaving like one — this leads to bugs, inconsistent data, corrupted state, and hard-to-find errors 😵


-> To overcome this next is there called **Synchronized Method**   

synchronized is a keyword used to prevent multiple threads from executing a block of code or method at the same time.

“Only one thread can enter here at a time. Others must wait.” 🔒

   How synchronized works:
When a method is marked synchronized:

Only one thread can execute it at a time.

If another thread tries to call it, it will wait until the first thread finishes.


✅ When should you use synchronized in Singleton?
Use it when:

Your app has multiple threads

You want lazy initialization

You want a simple way to make it thread-safe

Disadvantages:

-> very slow 

to over come this it is came liek this  **Double-Checked Locking**    

-> so in this there will be very important term called "volatile" check this once

-> mava in this what is core cache l1 cache memory these and all dont know maava explain me -> here it is very important to know 

-> still there are some explore that also 

 

 */
