// 1st error we are not handling anything error
// here method1() itself got error

/* package Exception_Handling;

public class CompileTime {

    public static void method1() {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args)
    {
        method1();
    }
    
} */

//2nd errror
// now see method1() got error because it didn't handled
/* package Exception_Handling;

public class CompileTime {

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args)
    {
        method1();
    }
    
} */


// 3rd error

/* package Exception_Handling;

public class CompileTime {

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException
    {
        method1();
    }
    
} */

// 4 th error

/* package Exception_Handling;

public class CompileTime {

    public static void method1()  {
       try{
          throw new ClassNotFoundException();

       }

       catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args) 
    {
        method1();
    }
    
} */

// error 5

package Exception_Handling;

public class CompileTime {

    public static void method1()  {
       try{
          throw new ClassNotFoundException();

       }

       catch (ClassNotFoundException e) {
        //    e.printStackTrace();
       }

       finally {
        System.out.print("Finally the finally block exceuted");
       }
    }

    public static void main(String[] args) 
    {
        method1();
    }
    
} 




// Here mainly explore clearly about the difff b/w throws and throw

// ✔️ throw – actively throws an exception object
// ✔️ throws – declares that method might throw exception(s)



// 1. ClassNotFoundException

/*

public void methodName() throws ExceptionType {
    // code that might throw ExceptionType
}


🔷 ✅ Java Note – ClassNotFoundException

1. What is ClassNotFoundException?
   ➔ A checked exception.
   ➔ Thrown when Java tries to load a class at runtime using its name as a string, but the class is not found in the classpath.

2. Where does it occur?
   - Using Class.forName("classname")
   - Dynamic class loading (JDBC drivers, reflection)

3. Basic Example:

try {
    Class.forName("ABC"); // class "ABC" not present
} catch (ClassNotFoundException e) {
    System.out.println("ClassNotFoundException occurred!");
    e.printStackTrace();
}

✔️ Output:
ClassNotFoundException occurred!
java.lang.ClassNotFoundException: ABC

4. Real-world Example (JDBC):

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded successfully!");
} catch (ClassNotFoundException e) {
    System.out.println("MySQL Driver class not found!");
}

✔️ Thrown if MySQL JDBC jar not added to project classpath.

5. Key Points:
   - ClassNotFoundException is a checked exception (must be handled or declared).
   - It occurs when class loader cannot find the class at runtime.
   - Different from NoClassDefFoundError.

6. catch (ClassNotFoundException e):
   - 'ClassNotFoundException' ➔ type of exception being caught.
   - 'e' ➔ variable name holding the exception object.
   - Can be used to print details (e.getMessage(), e.printStackTrace()).

7. Final takeaway:
“ClassNotFoundException occurs when Java is told to load a class by name at runtime but it is not available in the project or libraries.”

 **** Try catch have 5 keywords which is very important *******
 -> try , catch, final, throws,throw
 -> here after try block you can use either catch block or else use finally block or u can use both catch after finally
 -> here it is vey important that => catch block is used to catch all the exception which can be thrown in the try block
 -> if we mention like this na catch(Exception e) {} -> it can catch all the exceptions because the Exception is parent for all the exceptions
 -> Even we can handle mutiple exceptions in one block itself

 -> Like this we can use Try/catch/finally Or try/finally/catch

******valid****

 try {
    // code that may throw exception
}
catch (ExceptionType e) {
    // code to handle exception
}
finally {
    // cleanup code that always runs
}


*****Invalid*******

try {
   // code
}
finally {
   // cleanup
}
catch (ExceptionType e) {
   // handling
}

-> For example of there is no catch block in main also then we can declare like throws classNotFoundException then JVM can take care about the Catch block exception

// Declaring throws in main passes exception to JVM.
// JVM prints stack trace and terminates program.



*/

