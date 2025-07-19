package Classes;

public class Concrete {
    
}

/* 
   -> These are those classes that we can create the an instance using NEW keyword
   -> All the methods should be completely implementation
   -> It can also be your child class from interface or extend abstract class
   -> a class modifier is either public or default (no modifier) => Private classes are allowed only if they are nested inside another class. 


    | Type                      | Concrete?                      | Can create object? | Has method body?  |
| ------------------------- | ------------------------------ | ------------------ | ----------------- |
| `class A {}`              | ✅ Yes                          | ✅ Yes              | ✅ Yes             |
| `abstract class A {}`     | ❌ No                           | ❌ No               | ✅/❌               |
| `interface A {}`          | ❌ No                           | ❌ No               | ❌ (before Java 8) |
| `class B implements A {}` | ✅ Yes (if methods implemented) | ✅ Yes              | ✅ Yes             |

---> so here explain this about fully because it will help in interface 


 */
