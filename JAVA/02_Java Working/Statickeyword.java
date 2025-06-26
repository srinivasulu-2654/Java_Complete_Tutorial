/* so here a class contains 

variables, methods, constructor, nested classes

java program -> byte code -> JVM calls the main method to start the program


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}


so here we have to observe 1 thing know the particular meaning of static

public static void main(String[] args)

The main method is marked as static.

This means you don't need to create an object of the class (Main) to run the main method.

The JVM can directly call main() using the class name: Main.main()

Why is main() Static?
Because when you run a program, no object is created yet. So the JVM needs a way to start the program without creating an object.

Hence, Java defines main() as:

public static void main(String[] args)

🧠 JVM calls this method directly using the class name (e.g., Main.main()), not with an object like new Main().

*/

//  Example to Understand static
// Without static (❌ Won’t work as main method):

// public class  Statickeyword{

//     void show() {
//         System.out.println("Non-static method");
//     }

//     public static void main(String[] args) {
//         Statickeyword obj = new Statickeyword(); // create object
//         obj.show(); // call non-static method
//     }
// }

// Example with Static

public class Statickeyword {
 
    static void show() {
        System.out.println("Hello World");
    }

    public static void main(String args[]) {
        // Statickeyword obj = new Statickeyword(); // no need to create obj because we are using the static keyword
        show();
        
    }
    
}



