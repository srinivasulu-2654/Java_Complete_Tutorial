// public class Person {
//     Person() {
//         System.out.println("This is person class with no arguments");
//     }

// }


// Will check arguments constructor chaining super()

public class Person {

    Person(String name) {
        System.out.println("Person: " + name);
    }
}


/*
    🔥 So the flow is:
Manager() constructor is called.

Inside it, Java automatically calls super() → Person() constructor is executed.

Person() prints: This is person class with no arguments.

Then Manager() prints: This is manager class with no arguments.

✅ Important Notes:
You didn't write super() → but Java inserted it automatically.

If the parent class has a parameterized constructor, then you must explicitly call super(args) — Java won't insert it in that case.
 */


