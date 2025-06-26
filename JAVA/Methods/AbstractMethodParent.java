package Methods;

public abstract class AbstractMethodParent {
    
    public abstract int print(); // here only declaration should be done that's it remaining all should be done in child class
}



/*  
    
abstract class Vehicle {
    abstract void startEngine();  // every vehicle must start, but how? depends on the vehicle
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Starting car engine...");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Starting bike engine...");
    }
}
  
 */

/*  
     It is defined only in abstract class
    Only method declaration is done
    It's implementation is done in child classes

    Method Declaration Usually seen in interfaces or abstract classes.

     
    | Term               | What It Means                    | Example                                        |
| ------------------ | -------------------------------- | ---------------------------------------------- |
| Method Declaration | Only the method header (no body) | `public void show();`                          |
| Method Definition  | Header + Body (actual logic)     | `public void show() { System.out.println(); }` |
| Method Signature   | Name + parameter types           | `show(int x, String y)`                        |
| Method Call        | When method is used/invoked      | `obj.show();`                                  |




 */
