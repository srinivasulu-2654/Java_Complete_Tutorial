package Interfaces_Java;

public class Interface {
    
}


/* 

Definition : Interface is something which helps to the system to interact with each other, without one system has to know the details of the other

or simple terms it is used to achieve the abstraction


✅ Real Life Analogy (simple):
Let’s say you are watching TV using a Remote 📺🕹️

You press Power → TV turns on.

You press Volume Up → Volume increases.

But do you know:

How the signal is sent from remote to TV?

What happens inside TV when button is pressed?

❌ No need.


-> here public and Default are allowed but (private and protected not allowed)

-> "An interface can extend one or more parent interfaces (comma-separated), but it cannot extend a class." Example:

-> public interface NonFlyingBirds extends Bird, LivingThings{}

interface Bird {
    void layEggs();
}

interface LivingThings {
    void breathe();
}

public interface NonFlyingBirds extends Bird, LivingThings {
    void walk();
}


class Penguin implements NonFlyingBirds {
    public void layEggs() {
        System.out.println("Laying eggs");
    }

    public void breathe() {
        System.out.println("Breathing");
    }

    public void walk() {
        System.out.println("Walking");
    }
}



| Concept                        | Explanation                                    |
| ------------------------------ | ---------------------------------------------- |
| Interface can extend           | ✅ one or more **interfaces** (comma-separated) |
| Interface cannot extend        | ❌ a **class**                                  |
| Interface can extend how many? | ✅ As many interfaces as you want               |
| Class can implement            | ✅ one or more interfaces                       |
| Interface methods              | Must be implemented by the class               |



Why we need interface? ****

1. Abstraction:

Using interface we can achieve full abstraction means, we can define WHAT class must do, but not How it will do


| Reason                            | Meaning                                                                    |
| --------------------------------- | -------------------------------------------------------------------------- |
| ✅ Tells the compiler              | "Hey compiler, this method is overriding something from parent/interface." |
| ✅ Helps you avoid typing mistakes | If method name/signature is wrong, compiler gives error!                   |
| ✅ Improves readability            | Other devs can quickly see it’s an overridden method                       |



“Using interface, we can achieve full abstraction — we can define WHAT class must do, but not HOW it will do.”
✅ is 100% correct and important.


✅ What is an Interface?
Interface is a pure abstract type in Java.
It only contains method declarations (no logic), and classes must implement those methods.



| Feature           | **Abstract Class**                               | **Interface**                                                  |
| ----------------- | ------------------------------------------------ | -------------------------------------------------------------- |
| Object creation   | ❌ Not allowed                                    | ❌ Not allowed                                                  |
| Method with body  | ✅ Yes (non-abstract methods allowed)             | ❌ Not allowed (until Java 8)<br>✅ from Java 8 (default/static) |
| Abstract method   | ✅ Yes                                            | ✅ Yes                                                          |
| Constructors      | ✅ Can have constructor (but not usable directly) | ❌ No constructor allowed                                       |
| Variables         | Any type                                         | `public static final` only (constants)                         |
| Inheritance       | Class can extend only one abstract class         | Class can implement multiple interfaces                        |
| Access modifiers  | Can have private, protected, etc.                | Everything is `public` by default                              |
| Abstraction level | ✅ **Partial Abstraction**                        | ✅ **Full Abstraction**                                         |
| Use Case          | Code sharing (reuse + rules)                     | Rules/Contract only                                            |




✅ What is an Interface in Java?
An interface in Java is a contract.
It tells: “Any class that implements me must write these methods.”

It only contains:

Method declarations (no body)

Constants (static final variables)

Syntax of this:

interface Vehicle {
    void start();    // method without body
    void stop();
}


| Use Case                                     | Why Interface?                                                 |
| -------------------------------------------- | -------------------------------------------------------------- |
| **Multiple Classes should follow same rule** | So they all write same method (like `start()` in `Vehicle`)    |
| **Loose coupling**                           | You can switch implementations easily                          |
| **Support polymorphism**                     | Interface lets you use one reference type for multiple classes |


| Concept                                  | Explanation                                                       |
| ---------------------------------------- | ----------------------------------------------------------------- |
| Methods in interface                     | Only declarations (from Java 8+, can have default/static methods) |
| Variables                                | Always `public static final` (constants)                          |
| Can interface extend another interface?  | ✅ Yes                                                             |
| Can class implement multiple interfaces? | ✅ Yes (supports multiple inheritance for behavior)                |
| Can interface implement class?           | ❌ No                                                              |
| Can interface have constructor?          | ❌ No                                                              |



🚫 What Interfaces Cannot Do:
You cannot create objects of an interface directly:

Animal a = new Animal(); ❌  // Error!


| Feature             | Interface                          |
| ------------------- | ---------------------------------- |
| Object creation     | ❌ Not allowed                      |
| Constructors        | ❌ Not allowed                      |
| Variables           | `public static final` only         |
| Methods             | Only declarations (until Java 8)   |
| Implements keyword  | `class A implements InterfaceName` |
| Multiple interfaces | ✅ Yes                              |



🤔 Your Doubt:
"We already have:

Method Overloading → Polymorphism

Inheritance → Reuse behavior from parent

Then why do we even need Interface ra mava?"

✅ Real Answer in Simple Words:
➤ Inheritance → Reuse implementation (actual code)
But Java doesn't support multiple inheritance of classes ❌

So this is not allowed:   ***** Explore ***** this 

➤ Interface → Reuse only the structure/contract
You’re telling: “Any class that implements me must have these methods, but I don’t care how.”


interface A { void show(); }
interface B { void print(); }

class C implements A, B {
    public void show() {}
    public void print() {}
}


🤖 Why interface is still needed even if we have inheritance & overloading?


| Feature         | What it gives                      | Limitations                | Interface Role                                 |
| --------------- | ---------------------------------- | -------------------------- | ---------------------------------------------- |
| **Overloading** | Same method name, different params | Compile time only          | Not related to inheritance                     |
| **Inheritance** | Reuse behavior from one class      | Only one class allowed     | Can’t inherit from multiple classes            |
| **Interface**   | Reuse structure (method rules)     | No code, only method names | Used to plug in behavior from **many sources** |



📌 Summary:
🔁 Overloading → Same method name, compile-time decision (nothing to do with interfaces)

🧬 Inheritance → Inherit logic from one parent

🎭 Interface → Add behaviors from many sources (multiple inheritance of behavior)

🔐 Interfaces are needed when:

You want multiple inheritance

You want to enforce structure without sharing implementation

You want to decouple logic (used heavily in real projects & Spring Boot)


✅ Key Points About Abstraction:

| Feature                               | Abstract Class                                |
| ------------------------------------- | --------------------------------------------- |
| Can have abstract methods             | ✅ Yes                                         |
| Can have normal methods               | ✅ Yes                                         |
| Can’t create object of abstract class | ✅ True                                        |
| Used to achieve                       | **Partial Abstraction** (some methods hidden) |






 */