public class ConstructorChaining {

    String name;
    int age;

    
    ConstructorChaining() {
         this(10);
         System.out.println("No argu constructor called");
    }

    ConstructorChaining(int age){
         this("Sreenu",21);
         System.out.println("single argu constructor called");
    }

    ConstructorChaining(String name,int age) {
        this.name = name;
        this.age=age;
        System.out.println("More arguments called");

    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}


/*
   This constructor has been has 2 parts 
      ->this
      -> super

v.v.v.v.v.v Imp to know about these 

🔥 What is Constructor Chaining in Java?
Constructor chaining means:

One constructor calls another constructor in the same class using this().

This avoids code duplication and keeps your constructors organized and reusable.

      ⚠️ Rules You Must Remember
this() or super() must be the first statement in the constructor.

You can’t use both this() and super() in the same constructor.

If you don’t write super(), Java automatically calls the default constructor of the parent class.

🔥 Real-life analogy
Think like this:

You are born (constructor is called), but your father's constructor must be called first because without him, you wouldn’t exist. That’s super().

And if you call yourself in a different way with nickname or full name, that’s like calling another constructor inside the same class — that's this
().


🧠 Interview Questions You May Face
What is constructor chaining? How is it useful?

Can we use this() and super() together?

What happens if the parent class doesn't have a default constructor?

Can we create constructor chains with 3 or more constructors?

What’s the difference between this() and super()?




 */
