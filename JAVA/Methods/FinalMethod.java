package Methods;

public class FinalMethod {
    
    public final void profession()
    {
        System.out.println("This is the base class");
    }
}

/* class ChildClass extends FinalMethod {


  
      public void profession() {
         System.out.println("This is child class");
      }
} */

// Only one public class is allowed per .java file, and the file name must match the name of that public class.  -> Explore this in chatgpt 
// if both child and parent class will be in single file then there should be only 1 public infront of the class


/*
   A final method is a method that cannot be overridden by any subclass.
    
   🔒 Why Use final on Methods?
To prevent a subclass from changing the behavior of a method.

-> Final method can not be overridden in java 

-> Why? Final Method means it's implementation can not be changed. If child class can not change its implementation then no use of overridden

-> If you can't any changes in child class then what is the use of override so it's already exists in parent class so that's why final method cannot be override



 */


