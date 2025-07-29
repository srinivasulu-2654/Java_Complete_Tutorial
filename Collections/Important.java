package Collections;

public class Important {
    
}


// ******* What is java Collections Framework**************

/* 🔷 What is a Concrete Class in Java?
✔️ Definition:
A concrete class is a normal class in Java that provides implementation for all its methods.

Unlike abstract classes or interfaces, it is complete and can be instantiated (we can create objects). 


🔷 Why is it called "Concrete"?
“Concrete” means solid / complete / non-abstract.

In OOPS terminology:

Concrete class ➔ Full implementation.

Abstract class / Interface ➔ Just blueprint, no complete implementation.


Concrete Class = Fully implemented class + can create objects
Abstract Class = Partial implementation + cannot create object directly
Interface = Only abstract methods (before Java 8) + no implementation + cannot create object directly



*/

/*
  ->Collections is nothing but a group of objects
  -> present in java.util package
  -> FrameWork provide us the architecture to manage  these "group of objects" i.e add, update, delete, search etc

   Why do we need JCF(Java Collections Framework)?

   -> prior to JCF we have Array, Vector, Hash tables
   -> “But problem with that is, there is no common interface, so it's difficult to remember the methods for each.”

Before JCF: Different data structures, different method names, no common standard ➔ difficult to learn and use.
After JCF: Standardised method names and interfaces ➔ easy to learn, flexible, and interchangeable.


   // ✅ 🔷🔑 Java Collections Framework Hierarchy Explanation

🔷 Colour Meaning in Diagram:

✔️ Light Blue boxes ➔ Represent **Interfaces**.
✔️ Purple boxes ➔ Represent **Concrete Classes**.

--------------------------------------------
🔷 What is an Interface here?

- Interface ➔ A blueprint that defines **methods** but does **not** provide their implementation.
  Example: List, Set, Queue.
- It tells **what operations are supported** but **not how they are performed**.

--------------------------------------------
🔷 What is a Concrete Class here?

- Concrete Class ➔ A class that **implements an interface** and provides **full functionality**.
  Example: ArrayList, LinkedList, HashSet, PriorityQueue.
- It tells **how the operations are implemented internally**.

--------------------------------------------
🔷 Example to relate easily:

| Interface (Light Blue) | Concrete Class (Purple) |
|-------------------------|--------------------------|
| List ➔ defines methods like add, remove, get. | ArrayList ➔ implements List and stores data in a dynamic array. |
| Set ➔ defines unique data storage methods. | HashSet ➔ implements Set using hash table. |

--------------------------------------------
🔷 Key Takeaways for this diagram:

1. Hierarchy Flow:
   - Top ➔ Iterable interface.
   - Next ➔ Collection interface extends Iterable.
   - Then ➔ List, Set, Queue interfaces extend Collection.

2. Concrete classes implement interfaces:
   - ArrayList, LinkedList, Vector implement List.
   - HashSet, LinkedHashSet, TreeSet implement Set.
   - PriorityQueue, ArrayDeque implement Queue or Deque.

--------------------------------------------
🔷 Why is this important?

- In interviews:
  "What is the difference between List and ArrayList?"
   ➔ List is an interface, ArrayList is its concrete implementation.

- Helps in design decisions, declarations, and selecting the correct data structures in coding and backend projects.

--------------------------------------------
💡 Tip:

- While coding, declare using interface type for flexibility:
  Example:
  List<Integer> list = new ArrayList<>();


*/


   
 
