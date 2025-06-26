/* public class Para {
    String name;

    Para(String empName) {
        name = empName;
    }

    public static void main(String[] args) 
    {
        Para obj = new Para("Sreenu");
        System.out.println(obj);
    }
} */

// whenever we manullay add the constructor then there won't be creation of default constructor


// Constructor overloading 

/* public class Para {

     String name;
     int age;

     Para(String empName) 
     {
        name = empName;
     }

     Para(String name, int age)
     {
        this.name = name;
        this.age = age;
     }
} */

// Constructor cannot be overrided if it override then child class the naming problem will occur

// Private constructor


public class Para {

     String name;
     int age;

     private Para() {

     }

     public static Para getInstance() {
        return new Para();
     }

     public static void main(String[] args) {
        Para obj = Para.getInstance();
     }
}

/*
    Mava 🤝, this is another v.v.v. important concept — let me explain why we use a private constructor in Java with real examples.

🔐 Why private constructor in Java?
A private constructor means:

You can’t create objects from outside the class using new ClassName().

Only code inside the same class can call the constructor.

| Case                 | Use private constructor? | Why?                                   |
| -------------------- | ------------------------ | -------------------------------------- |
| Singleton class      | ✅ Yes                    | To allow only 1 object                 |
| Utility/helper class | ✅ Yes                    | To prevent unnecessary object creation |
| Normal class         | ❌ No                     | You want multiple objects              |



 */


// explore this private constructor part in chatgpt in depth