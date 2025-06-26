package Interfaces_Java;

public class NeedsOfInterface {
    
}


/*
    Why we need interface :

    1. Abstraction:

    Why we need interface? ****

     1. Abstraction:

    Using interface we can achieve full abstraction means, we can define WHAT class must do, but not How it will do

“Using interface, we can achieve full abstraction — we can define WHAT class must do, but not HOW it will do.”
✅ is 100% correct and important.


   2. Polymorphism

   "Interfaces in Java support runtime polymorphism by allowing us to use the interface as a reference type for any of its implementing classes. This helps achieve loose coupling and makes our system scalable and maintainable."

   here with normal polymorphism also can write then why interfaces exlore this?

   | Use Case                            | Class                 | Interface                             |
| ----------------------------------- | --------------------- | ------------------------------------- |
| Common parent with shared code      | ✅ Yes                 | 🚫 No                                 |
| Want to implement multiple types    | ❌ No (only one class) | ✅ Yes (can implement many interfaces) |
| Just define contract                | 🚫 Not clean          | ✅ Perfect                             |
| Real-time use (Spring, Collections) | Sometimes             | ✅ Very common                         |


  
-------------------------------------------------------------
2. Polymorphism using Interface in Java
-------------------------------------------------------------

➡ Interface can be used as a Data Type.
➡ We cannot create an object of an interface, 
   but we can create a reference of it.

➡ That reference can point to any class that implements the interface.
➡ At runtime, Java decides which method to invoke 
   based on the actual object type (this is runtime polymorphism).


// -------------------- Interface -------------------------

public interface Bird {
    void fly();  // Method declaration only (no body)
}

// ------------------- Implementing Class 1 ----------------

public class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("Eagle Fly Implementation");
    }
}

// ------------------- Implementing Class 2 ----------------

public class Hen implements Bird {
    @Override
    public void fly() {
        System.out.println("Hen Fly Implementation");
    }
}

// ----------------------- Main Class -----------------------

public class Main {
    public static void main(String[] args) {

        // Interface reference pointing to implementing class objects
        Bird birdObject1 = new Eagle();  // Polymorphism
        Bird birdObject2 = new Hen();    // Polymorphism

        // Runtime Polymorphism - Actual method called depends on the object
        birdObject1.fly();  // Output: Eagle Fly Implementation
        birdObject2.fly();  // Output: Hen Fly Implementation
    }
}

/*
-------------------------------------------------------------
✅ Key Points:

- Interface acts as a common parent type.
- We can't do: Bird b = new Bird(); ❌

Interface has no method body, so Java doesn’t know what to execute.

It’s just a rule book — not an actual usable object.


- But we can do: Bird b = new Eagle(); ✅

➡ This is called Runtime Polymorphism (or Dynamic Method Dispatch)
➡ It's a powerful feature to write flexible and loosely coupled code.
-------------------------------------------------------------
*/



 