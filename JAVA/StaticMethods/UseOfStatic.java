package StaticMethods;

public class UseOfStatic {

    static int carPrice = 40;
    
    public static int sum(int a,int b)
    {
        int result = a + b;    // here no need to change the method or data variables inside the method then you can use the static method
        return result;
    }

    public int sum2(int a,int b)
    {
        int res = a + b;
        carPrice = carPrice + res;

        return carPrice;
    }
}

// Here very important if the method is using any instance variable then don't create Static Method
// Create a method static if it is only working on arguments


/*
    🔷 What is this saying?
1️⃣ If your method uses instance variables (i.e., object data), it should NOT be static.
2️⃣ If your method only needs input arguments and doesn’t depend on any object data, then you can (and should) make it static.

     🔍 Example to Understand
✅ Case 1: Non-Static Method using Instance Variable

public class Pen {
    int price = 10; // instance variable

    // ❌ Don't make this static, because it uses 'price'
    public int getFinalPrice(int tax) {
        return price + tax;
    }
}

getFinalPrice() is working with the object’s own price, so it’s non-static.


✅ Case 2: Static Method working only on arguments

public class Calculator {
    
    // ✅ Only uses arguments a and b, not any instance variable
    public static int add(int a, int b) {
        return a + b;
    }
}


add() works purely on arguments → so no need to create an object, hence it's made static.

Calculator.add(10, 20);  // ✅ No object needed





 */

/*
    
⚠️ Remember: Static methods CANNOT access non-static variables directly.
But non-static methods can access both static & non-static.


Don't create a method static if it is using any instance variables


🔷 What is an Instance Variable?
An instance variable is a variable declared inside a class, but outside any method or constructor.


 */