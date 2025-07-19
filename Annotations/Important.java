package Annotations;

public class Important {
    
}

/*
-----------------------------------------------------------------------------
 1. It is kind of adding META DATA to the Java code.
-----------------------------------------------------------------------------

Annotations are used to add extra information (metadata) to code.
Example:

@Override
public void run() {
    // method code
}

Here, @Override tells the compiler this method overrides a parent method.
It doesn't change logic, it just provides metadata.


// -----------------------------------------------------------------------------
// 2. Means, its usage is OPTIONAL.
/ -----------------------------------------------------------------------------

Annotations are optional. Your program runs without them, but they improve clarity and safety.

Example:
public void myMethod() { }

This works fine. Adding:
@Override
public void myMethod() { }

Now, if myMethod does NOT override a parent method, compiler gives error. So it's optional but useful.


// -----------------------------------------------------------------------------
// 3. We can use this metadata information at runtime and can add certain logic.
// -----------------------------------------------------------------------------

Frameworks use annotations at runtime to perform tasks.

Example (Spring Boot):

@RestController
public class MyController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Mava!";
    }
}

Spring Boot reads these annotations at runtime to create API endpoints.


// -----------------------------------------------------------------------------
// 4. How to Read Metadata information? Using Reflection.
// -----------------------------------------------------------------------------

Java Reflection API can read annotations at runtime.

Example:

Method method = MyClass.class.getMethod("myMethod");
if(method.isAnnotationPresent(Deprecated.class)) {
    System.out.println("This method is deprecated.");
}


// -----------------------------------------------------------------------------
// 5. Annotations can be applied anywhere like Classes, Methods, Interfaces, fields, parameters.
// -----------------------------------------------------------------------------

Examples:

// Class
@Entity
public class User { }

// Method
@Test
public void testAddition() { }

// Field
@Autowired
private UserRepository userRepo;

// Parameter
public void greet(@RequestParam String name) { }

// Interface
@FunctionalInterface
public interface MyFuncInterface { }


-> explore the shrayansh jain ppt 

Types of annotations:

1) Pre defined Annotations
   i) Used on Annotations
   ii)Used on java Code

   
2) Custom Annotations

 */
