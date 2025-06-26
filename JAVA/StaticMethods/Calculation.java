package StaticMethods;

public class Calculation {

    int stockPrice = 10;
    static int carPrice = 40;

    public static int getPriceOfPen() {
        

        carPrice = 50;
        // stockPrice   getting error because it is a non - static variable 

        Calculation obj = new Calculation();
        int val = obj.stockPrice;

        // return val + carPrice;
        
        System.out.println("This is the calculation");

         return val + carPrice;

    }
    
}


// Non - static variable also known as instance variable

// if we want to access stockPrice variable inside the getPriceOfPen() then make the stockPrice varible stacti or else do like this

/*
Calculation obj = new Calculation();
int value = obj.stockPrice;

Static methods can not access non - static instance variables and methods

🔥 Why?
Because static methods belong to the class, not to any object.
But non-static variables/methods belong to objects, so you must first create an object to access them.

static method can not be overridden


Here are the static and dynamic binding

| Type                | Also Known As | Happens When? | Example            |
| ------------------- | ------------- | ------------- | ------------------ |
| **Static Binding**  | Early Binding | Compile-time  | Method Overloading |
| **Dynamic Binding** | Late Binding  | Runtime       | Method Overriding  |


 */