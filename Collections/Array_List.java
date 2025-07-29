package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Array_List {

    public static void main(String[] args)
    {
        List<Integer> Values = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Values.add(1);
        Values.add(2);
        Values.add(3);
        Values.add(4);


        System.out.println("Now we are iterrating the elements in the values");

        Iterator<Integer> iteratorValues = Values.iterator();

        while(iteratorValues.hasNext())
        {
            int val = iteratorValues.next();
            System.out.println(val);
            if(val == 3)
            {
                iteratorValues.remove();
            }
        }

        System.out.println("Iterating through for loop");

        for(int values : Values)
        {
            System.out.println(values);
        }

        System.out.println("Printing the elements through forEach loop");
        Values.forEach((Integer val) -> System.out.println("Values of elements: " + val));
    }
    
}
