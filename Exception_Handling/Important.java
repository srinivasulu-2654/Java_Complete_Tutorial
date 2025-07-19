package Exception_Handling;

public class Important {
    
}

/*
  “Exception handling in Java allows us to handle runtime errors gracefully using try, catch, finally, throw, and throws keywords to maintain normal program flow.”
 
  What is the exact meaning of exception handling na ->  It is an event that occurs during the execution of the program
  -> It will distrupt the normal flow of the program

  -> here explore about the terms stack trace and Type, message

  -> v.v.v.v.v Imp what is the diff b/w error and exception

  -> explore the exception hierarchy

  -> there will be object as main on top
  -> Throwable
  -> under throwable error will be there  -> even Error also unchecked only
  -> like without knowing running recursion infinite times also comes under this

  
🔷 ✅ Exception Handling in Java – Quick Revision Notes

1. What is Exception Handling?
   ➔ Mechanism to handle runtime errors (exceptions) gracefully
   ➔ Prevents program from terminating unexpectedly

2. What is an Exception?
   ➔ An object representing an error condition during execution

3. Why Exception Handling?
   ➔ To maintain normal flow
   ➔ To display meaningful error messages
   ➔ To avoid abrupt termination

4. Keywords used:
   - try: wraps risky code
   - catch: handles exception
   - finally: always executes (optional)
   - throw: explicitly throws an exception
   - throws: declares an exception

5. Basic Syntax:

try {
    // risky code
} catch(ExceptionType e) {
    // handling code
} finally {
    // always executed code
}

6. Example:

try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
} finally {
    System.out.println("Finally block executed.");
}

7. Types of Exceptions:
   - Checked Exception ➔ checked at compile time (IOException, SQLException)
   - Unchecked Exception ➔ checked at runtime (ArithmeticException, NullPointerException)

8. throw vs throws:
   - throw: to throw an exception explicitly
   - throws: to declare an exception in method signature

Example:

void checkAge(int age) throws ArithmeticException {
    if(age < 18) {
        throw new ArithmeticException("Not eligible");
    }
}

9. Multiple catch blocks:

try {
    // code
} catch (ArithmeticException e) {
    // handle ArithmeticException
} catch (ArrayIndexOutOfBoundsException e) {
    // handle ArrayIndexOutOfBoundsException
}

10. Custom Exception Example:

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

11. finally block:
    - Always executed whether exception occurs or not
    - Used to close resources like files, DB connections

🔑 Final Summary:
“Exception handling provides a way to handle runtime errors gracefully using try, catch, finally, throw, and throws keywords.”

*/

   
