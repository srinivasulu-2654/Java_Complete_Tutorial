package Interfaces_Java;

public class NestedInterfaces {
    
}





 /*
─────────────────────────────
🌟 Nested Interface in Java
─────────────────────────────

✔️ **Definition:**
   - An interface declared within another interface or a class.

✔️ **Usage:**
   - To group logically related interfaces together.

─────────────────────────────
🔷 Rules:
─────────────────────────────

1️⃣ If a nested interface is declared **within an interface**:
   - It must be **public** by default.
   - It can be implemented **separately** without implementing the outer interface.

2️⃣ If a nested interface is declared **within a class**:
   - It can have any access modifier (`public`, `private`, `protected`, or default).

3️⃣ Implementing the outer interface does NOT require implementing the nested interface and vice versa.

─────────────────────────────
🔷 Example: Nested interface within an interface
─────────────────────────────


public interface Bird {

    public void canFly();

    public interface NonFlyingBird {
        public void canRun();
    }
}

/*
─────────────────────────────
🔷 Implementation Examples:
─────────────────────────────


// Implementing outer interface only
public class Eagle implements Bird {

    @Override
    public void canFly() {
        System.out.println("Eagle can fly");
    }
}

// Implementing nested interface only
public class Ostrich implements Bird.NonFlyingBird {

    @Override
    public void canRun() {
        System.out.println("Ostrich can run");
    }
}

// Implementing both outer and nested interfaces
public class Penguin implements Bird, Bird.NonFlyingBird {

    @Override
    public void canFly() {
        System.out.println("Penguin can't fly but implements Bird");
    }

    @Override
    public void canRun() {
        System.out.println("Penguin can run");
    }
}

/*
─────────────────────────────
🔷 Main method to test:
─────────────────────────────


public class Main {
    public static void main(String[] args) {
        Bird.NonFlyingBird obj = new Eagle(); // This will give error if Eagle does not implement NonFlyingBird
        obj.canRun();
    }
}

/*
─────────────────────────────
🔷 Nested interface within a class
─────────────────────────────


public class BirdClass {

    protected interface NonFlyingBird {
        public void canRun();
    }
}

public class Eagle implements BirdClass.NonFlyingBird {

    @Override
    public void canRun() {
        System.out.println("Eagle can run");
    }
}

/*
─────────────────────────────
✅ Summary Points:
─────────────────────────────

🔹 Nested interfaces help in logical grouping.
🔹 Interface inside interface ➔ public by default.
🔹 Interface inside class ➔ can have any access modifier.
🔹 Implementing outer interface doesn’t require implementing nested interface and vice versa.

─────────────────────────────


-> So here still there some concepts just explore those concepts clealry

*/



