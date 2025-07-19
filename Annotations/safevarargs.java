package Annotations;

public class safevarargs {
    
}


/*
   
“@SafeVarargs is used to suppress compiler warnings about potential heap pollution in generic varargs methods. It can only be used on static, final methods, or constructors to ensure type safety.”

explore this clearly

   explore these very in depth because its very important 
   
   -> varargs (...)

   “In Java, ... is used to define varargs (variable arguments) which allows a method to accept any number of arguments as an array.”

   “In varargs, the three dots ... is just syntax. You can pass any number of values, including zero.”

   public class VarargsTest {
    static void showNames(String... names) {
        for(String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        showNames(); // ✅ zero values
        showNames("Mava"); // ✅ one value
        showNames("Mava", "Java", "Spring"); // ✅ three values
        showNames("A", "B", "C", "D", "E"); // ✅ five values
    }
}



// 

public class VarargsExample {

    static void displayNames(String... names) {
        for (String n : names) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        displayNames("Mava", "Sreenu", "Java");
        displayNames(); // no arguments
    }
}



 */