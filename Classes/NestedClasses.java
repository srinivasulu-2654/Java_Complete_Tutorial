package Classes;

public class NestedClasses {
    
}


/*
    v.v.v.v..v.v.v. Imp

    Nested classes has 2 types :
        1.static nested class
        2. non - static nested class or also known as inner class
    Inner class further divied into 3 types:
        1. member inner class
        2. local inner class
        3. anonymous inner class

   -> check whether when we have to use this nested class

   -> when to use -> If you know that, a class(A) will be used by only one another class(B)
, then instead of created new file(A.java) for it, we can create nested class inside B class itself

 -> Also help us to group logically related classes in one file

 -> Scope is same as it's outer class


 🔹 Why and When to Use Nested Classes?
🟩 1. Encapsulation
When a class is only used by one other class, it's better to nest it. Keeps code clean.

🟩 2. Logical Grouping
Helps group related classes together — useful in organizing code.

🟩 3. Improved Readability
Code becomes more modular, and easier to understand.

🟩 4. Accessing Outer Class Members
Inner classes can easily access private members of the outer class.

// v.v.v.v.v.v Imp -> if we dont intitalize any access specifier then it will be dafualt and the package will be private 

🔶 Statement:
If we don’t initialize any access specifier, then it will be default, and the class/member will be “package-private”.


Non-static nested class:

-> it have access to all the instance variable and method of outer class
-> It's object can be intiated on after intiating the object of the outer class

1.member inner class can be private protected public default
explore other 2  local inner class ,anonymous inner class

=> so heere explore about the inheritance in nested classes 



Nested Class
│
├── 1. Static Nested Class
└── 2. Non-Static Nested Class (Inner Class)
       │
       ├── a. Member Inner Class
       ├── b. Local Inner Class
       └── c. Anonymous Inner Class


| Type                  | Defined Inside        | Requires Outer Object | Can Access Outer Members | Use Case                           |
| --------------------- | --------------------- | --------------------- | ------------------------ | ---------------------------------- |
| Static Nested Class   | Outer class           | ❌                     | Only static              | Utility/helper class               |
| Member Inner Class    | Outer class           | ✅                     | All                      | Closely tied to outer class        |
| Local Inner Class     | Method/block          | ✅ (inside method)     | Final/Effectively final  | Temporary inner logic              |
| Anonymous Inner Class | While object creation | ✅                     | Final/Effectively final  | One-time override (Runnable, etc.) |




*/