package Interfaces_Java;

public class DiamondProblem {
    
}


/*
   
    In java Multiple inheritance is only possible through interface only

    
    public class Main {

    public static void main(String[] args) {

        // 🔹 Diamond Problem with Classes ❌ (Uncomment to see error)
    
        CrocodileWithClass obj1 = new CrocodileWithClass();
        System.out.println(obj1.canBreathe());
        

        // 🔹 Diamond Problem Solved with Interfaces ✅
        Crocodile obj2 = new Crocodile();
        System.out.println("Crocodile breathes: " + obj2.canBreathe());

        // 🔹 Interface Methods Demo
        Parrot bird = new Parrot();
        bird.fly();
        bird.hasBeak();

        // 🔹 Interface Fields (Constants)
        System.out.println("Max height a bird can fly: " + Bird.MAX_HEIGHT_IN_FEET + " feet");
    }
}


// ❌ Diamond Problem using Classes — not allowed in Java


class WaterAnimalClass {
    public boolean canBreathe() {
        return true;
    }
}

class LandAnimalClass {
    public boolean canBreathe() {
        return true;
    }
}

// ❌ Java does not support multiple inheritance with classes
class CrocodileWithClass extends LandAnimalClass, WaterAnimalClass {
}



// ✅ Interfaces — Diamond Problem Solved

interface LandAnimal {
    boolean canBreathe();  // implicitly public abstract
}

interface WaterAnimal {
    boolean canBreathe();
}

class Crocodile implements LandAnimal, WaterAnimal {
    @Override
    public boolean canBreathe() {
        return true;
    }
}


// ✅ Methods in Interfaces

interface Bird {

    // All methods are public abstract by default
    void fly();         // same as: public abstract void fly();
    public void hasBeak();  // explicitly public
}

class Parrot implements Bird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hasBeak() {
        System.out.println("Parrot has a sharp beak");
    }
}


// ✅ Fields in Interface (Constants)
interface BirdConstants {

    // All fields are public static final by default
    int MAX_HEIGHT_IN_FEET = 2000;

    // same as:
    // public static final int MAX_HEIGHT_IN_FEET = 2000;
}


   
 */