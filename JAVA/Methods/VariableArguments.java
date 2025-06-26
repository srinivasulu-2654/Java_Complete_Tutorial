package Methods;

public class VariableArguments {

    static int res = 0;

    public static int sum(int ...variable)
    {
        for(int num:variable)
        {
            res += num;
        }

        return res;
    }


    public static void main(String[] args) 
    {
        System.out.println(sum());
         System.out.println(sum(5));
          System.out.println(sum(1,2,3,4));
    }
    
}

/*
   🔶 What Are Variable Arguments (Varargs)?
Varargs allow you to pass a variable number of arguments to a method.
This makes your code flexible and clean — no need to overload the method multiple times!

Syntax :
 
methodName(type... variableName)


The ... means this parameter can take zero or more values.

| Rule                                                      | Description |
| --------------------------------------------------------- | ----------- |
| ✅ Only **one varargs parameter** is allowed per method    |             |
| ✅ Must be the **last parameter** in the method signature  |             |
| ❌ You cannot put anything **after** the varargs parameter |             |



 */
