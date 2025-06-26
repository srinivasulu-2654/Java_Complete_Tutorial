package Classes;

public class SuperAndSub {
    
}

/*
     in java in the absence of any other explicit superclass, every class is implicitly a subclass of Object class -> object is the parent of all the classes

     child object can be store in parent class reference

     💡 Statement:
A child object can be stored in a parent class reference.

This is called Upcasting in Java — and it’s possible because of Inheritance and Polymorphism.

for the above statement check the below code v.v.v.v.v.v.v imp


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();  // ✅ child stored in parent reference

        obj.sound();  // Output: Dog barks (runtime polymorphism)

        // obj.wagTail(); ❌ Not allowed, since reference is Animal
    }
}


🔍 What is happening?
You created a Dog object, but stored it in Animal reference.

At runtime, Java calls the overridden method in Dog class → this is Runtime Polymorphism.

But using the Animal reference, you can only access methods that are present in the Animal class

     | Method           | Description                             |
| ---------------- | --------------------------------------- |
| `toString()`     | Returns string representation of object |
| `equals(Object)` | Compares two objects                    |
| `hashCode()`     | Returns hash code for the object        |
| `getClass()`     | Returns runtime class of object         |
| `clone()`        | Creates and returns a copy              |
| `finalize()`     | Called before garbage collection        |

 */
