package Exception_Handling;

public class RunTime {
    

}


// 1.******************ClassCastException************************
// 2. Arithmetic Exception
// 3. IndexOutOfBoundException
// 4. NullPointerException
// 5. IllegalArgumentException


/*
🔷 ✅ Java Note – Integer to String Casting and Conversion

1. Problem:
   Object val = 0;
   System.out.println((String) val);

2. Why is this wrong?
   ➔ val is Object holding an Integer (auto-boxed from 0).
   ➔ You are trying to cast Integer to String directly.
   ➔ This causes ClassCastException at runtime.

3. Error:
   java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

4. Can Integer be directly cast to String?
   ❌ No. Integer is not a subclass of String, so casting fails.

5. Correct ways to convert Integer to String:
   ✔️ Using String.valueOf():
      Object val = 0;
      System.out.println(String.valueOf(val)); // prints "0"

   ✔️ Using toString():
      Integer num = 0;
      System.out.println(num.toString()); // prints "0"

6. Why does String.valueOf(val) work?
   ➔ Calls val.toString() internally.
   ➔ Returns "null" if val is null to avoid NullPointerException.

🔑 Final takeaway:
“Cannot type-cast Integer to String directly. Always convert using String.valueOf() or toString().”

*/
