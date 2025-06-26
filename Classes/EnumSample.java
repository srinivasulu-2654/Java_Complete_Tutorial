
package Classes;

// public enum EnumSample {
    
//      MONDAY, 
//      TUESDAY, 
//      WEDNESDAY, 
//      THURSDAY, 
//      FRIDAY, 
//      SATURDAY, 
//      SUNDAY;
// }

// so the above is we can write like this and main in another file or else we can wwrite both in single file also



public class EnumSample {

    enum Color {
       RED,
       BLUE,
       GREEN,
       ORANGE;
    }

    public static void main(String[] args) {

         for(Color c : Color.values())
         {
            System.out.println(c);
         }

         for(Color c : Color.values())
         {
            System.out.println(c.ordinal());
         }

         Color enumVaraible = Color.valueOf("GREEN");
         System.out.println(enumVaraible.name());
    }
}




// IF WE run this by default it will create the "private constructor" in enum class that means in EnumSample.class


// enum is a keyword in Java which is used to create a special class type that represents a group of constants.

// Explore clealry about the enum custome values again




/*  






🔴 What does "enum cannot be initiated" mean?
It means you cannot create an object of an enum using new keyword like you do for normal classes.


❌ Example that will throw an error:

enum Color {
    RED, GREEN, BLUE;
}

public class Main {
    public static void main(String[] args) {
        Color c = new Color();  // ❌ ERROR! Cannot instantiate enum
    }
}
🔴 Why error comes?
Because:

All enum constructors are private by default.

Java does not allow you to manually create enum objects.

The enum constants (RED, GREEN, BLUE) are automatically created by Java when the enum is loaded.

✅ Correct way to use enums:

Color c = Color.RED;  // ✅ Valid usage
You are not creating, you are just using the existing constant that Java already created internally.

Read completely shreyansh jain documents



In Java, an enum (short for enumeration) is a special data type used to define a fixed set of constant values.

Enums are type-safe, meaning you can’t assign anything other than the defined constants. Internally, all enum constants are treated as public static final objects, and Java ensures that only one instance is created for each constant (like singleton objects).

Enums cannot be instantiated using new because their constructors are private by default, and objects are automatically created by the JVM when the enum is loaded.

Enums in Java can:

Have variables, constructors, and methods

Implement interfaces

Contain abstract methods (all constants must implement them)

Cannot extend any class, because they implicitly extend java.lang.Enum

Cannot be extended by other classes, as they are final by design






    
   ENUM:

   -> It has a collection of CONSTANTS (variables which values can not be changed)
   -> “Enums in Java provide a type-safe way to define a group of constants, and they can also hold fields, constructors, and methods, making them much more powerful than just constants.”

   enum means "a fixed set of values" — like options in a dropdown.

Imagine you are building an app where users can select their role — it should be one of:

ADMIN

USER

GUEST
 
| Feature         | C Enum                        | Java Enum                              |
| --------------- | ----------------------------- | -------------------------------------- |
| Underlying Type | Integer                       | Full Class                             |
| Type-safe       | ❌ No (you can assign any int) | ✅ Yes                                  |
| Methods         | ❌ Not allowed                 | ✅ You can add methods                  |
| Object-like     | ❌ Just constants              | ✅ Like class objects                   |
| Can extend      | ❌ No                          | ✅ Enum can have constructors & methods |




Explore these below very well


| Method      | Return Type | Purpose              | Example                  | Output               |
| ----------- | ----------- | -------------------- | ------------------------ | -------------------- |
| `values()`  | `Color[]`   | List all constants   | `Color.values()`         | `[RED, GREEN, BLUE]` |
| `ordinal()` | `int`       | Index of constant    | `Color.RED.ordinal()`    | `0`                  |
| `valueOf()` | `Color`     | String to constant   | `Color.valueOf("GREEN")` | `GREEN`              |
| `name()`    | `String`    | Get name of constant | `Color.RED.name()`       | `"RED"`              |



ENUM with abstract Methods:

-> normally abstarct method will only decalre in the parent class but in child class it should be written with defintion
-> But here in ENUM abstarct method only declare but definition should be done override in enum constants

ENUM with interface:

interface PaymentMethod {
    void pay(double amount);
}

enum Method implements PaymentMethod {
    CARD {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using card.");
        }
    },
    UPI {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI.");
        }
    }
}


// Explore the final class also




 */