package Collections;

import java.util.*;
import java.util.ArrayList;

public class Streams {

    public static void main(String[] args)
    {
        List<Integer> salaryList = new ArrayList<>();
        
        salaryList.add(1000);
        salaryList.add(1200);
        salaryList.add(4000);
        salaryList.add(9000);
        salaryList.add(8000);

        long output = salaryList.stream().filter((Integer sal) -> sal > 3000).count();
        // Stream<Integer> StreamFromIntgerList = salaryList.stream();

        System.out.println(output);


        // List<List<String>> sentenceList = 

  

    }
    
}




/*
 ✔️ Streams are introduced in Java 8
✔️ They provide a new way to process collections of data
✔️ You can perform operations like filtering, mapping, sorting, reducing in a clean and functional style.

🔷 2. Why long and not int?
✅ Because the number of elements can be very large.

Suppose you are working with a stream of a very large collection (example: millions or billions of records).

int has a maximum value of 2,147,483,647 (~2 billion).

But long supports a much larger range up to 9,223,372,036,854,775,807.

  -> explore more about the "Sequence of Stream Operaions"

  -> parallel stream uses Fork - join pool technique

  ✅ What is Fork/Join?
A framework in Java (introduced in Java 7) to split a large task into smaller sub-tasks, solve them in parallel, and combine the results to get the final output efficiently.

-> explore more about the above
 */