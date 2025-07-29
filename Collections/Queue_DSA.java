package Collections;

import java.util.PriorityQueue;

public class Queue_DSA {
    
    public static void main(String[] args)
    {
        PriorityQueue <Integer> minpq = new PriorityQueue<>();
        //if we use comparator then it is a max heap 

        minpq.add(10);
        minpq.add(5);
        minpq.add(2);
        minpq.add(20);

        minpq.forEach((Integer val) -> System.out.println(val));

        while (!minpq.isEmpty()) {
            
            int val = minpq.remove();

            System.out.println("Removed element from the min heap: " + val);
        }


    }
}




/*
 Collections.reverseOrder() -> first sort all the things from small->big and then reverse like big->small
 Collections.reverse()  -> just will reverse that's it
 */