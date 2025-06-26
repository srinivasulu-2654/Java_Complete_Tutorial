/*  Types of Methods:


1) System Defined Method :

Methods which are already defined and ready to use in java like Math.sqrt()

2) User Defined Methods:

Methods which programmer created based upon the program necessity

3) Overloaded Method :

More than one method with same name is created in same class

4) Overridden Method :

Subclass has the same method as the parent class

Learn about how to invoke the 2 things -> how to invoke the overloaded method

Get to know about the static and dynamic binding

| Type            | Happens at   | Also called   |
| --------------- | ------------ | ------------- |
| Static Binding  | Compile time | Early Binding |
| Dynamic Binding | Runtime      | Late Binding  |


5) Static Method :

here static methods are associated with class here directly call by class itself no need to create the object


| Feature                | Static Method                | Non-Static Method (Instance)       |
| ---------------------- | ---------------------------- | ---------------------------------- |
| Belongs to             | Class                        | Object                             |
| Called by              | `ClassName.method()`         | `object.method()`                  |
| Can use instance vars? | ❌ No                         | ✅ Yes                              |
| Common use             | Utility methods, main method | Business logic tied to object data |

// Non - static variable also known as instance variable

// if we want to access stockPrice variable inside the getPriceOfPen() then make the stockPrice varible stacti or else do like this

/*
Calculation obj = new Calculation();
int value = obj.stockPrice;

Static methods can not access non - static instance variables and methods

🔥 Why?
Because static methods belong to the class, not to any object.
But non-static variables/methods belong to objects, so you must first create an object to access them.

static method can not be overridden


Here are the static and dynamic binding

| Type                | Also Known As | Happens When? | Example            |
| ------------------- | ------------- | ------------- | ------------------ |
| **Static Binding**  | Early Binding | Compile-time  | Method Overloading |
| **Dynamic Binding** | Late Binding  | Runtime       | Method Overriding  |

When to declare Method static :

-> Methods which do not modify the state of the object can be declared static

-> Utility Method which do not use any instance variable and compute only on arguments

Example : factory design pattern // explore this about in the chatgpt

Uses of static method that means where we have to use and where not use:(vvvvv Imp)

⚠️ Remember: Static methods CANNOT access non-static variables directly.
But non-static methods can access both static & non-static.

🔷 What is an Instance Variable?
An instance variable is a variable declared inside a class, but outside any method or constructor.

✅ It belongs to:
Each object (instance) of the class.

So, every object has its own copy of instance variables.

❗ Important:
Instance variables can’t be accessed in static methods directly because static methods don’t belong to any object.


| Instance Variable      | Static Variable             |
| ---------------------- | --------------------------- |
| Belongs to object      | Belongs to class            |
| Each object has a copy | Only one copy shared by all |
| Accessed via object    | Can be accessed via class   |
| Stored in heap         | Stored in method area       |


🚫 Why static methods can’t access instance variables?
Because instance variables exist only after object is created. But static methods are called even before object is created, so they don’t know which object’s variable to access.

*/

