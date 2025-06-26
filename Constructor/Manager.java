// public class Manager extends Person{
//     Manager() {
//         // super()  here there will be hidden super no need to call seperately because it's already implicitly calls but for arguments is there then we have to call compulsory super()
//         System.out.println("This is manager class with no arguments");
//     }

//     public static void main(String[] args) {
//         Manager obj = new Manager();
//     }
// }


public class Manager extends Person{

    Manager() {
         super("Sreenu"); // if we wont write here super() then it will give error for sure for parameters constructor
         // here if parent constructor wont have anything about parameteres then no need to declare the super() won't care how many arguments is there in child constructor
        System.out.println("Manager constructor");
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
    }
}

