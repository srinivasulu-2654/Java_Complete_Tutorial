package Methods;

/* 
    
Method is used to perform certain task

It's a collection of instrcutions that perform some specific task

It can be used to bring the code readability and re-usability



 */

// public class Hello {

//     public int sum(int val1, int val2) {
//         int total = val1 + val2;
//         System.out.println("The total of the sum is: " + total);
//         return total;
//     }

//     public int getPriceOfPen() {
//         int capPrice = 2;
//         int penPrice = 5;
//         int totalPenPrice = capPrice + penPrice;
//         return totalPenPrice;
//     }

//     public static void main(String[] args) 
//     {
//         Hello obj = new Hello();
//         obj.sum(10, 20);
//         int price = obj.getPriceOfPen();
//          System.out.println("Both the values got printed: " + price);
//     }

// }


public class Hello {

    public int sum(int val1, int val2) {
        int total = val1 + val2;
        System.out.println("The total of the sum is: " + total);
        return total;
    }

    public int getPriceOfPen() {
        int capPrice = 2;
        int penPrice = 5;
        int totalPenPrice = sum(capPrice,penPrice);
        return totalPenPrice;
    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.sum(10, 20);
        int price = obj.getPriceOfPen();
        System.out.println("Both the values got printed: " + price);
    }
}
