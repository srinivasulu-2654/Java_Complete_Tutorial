package Memory_Management;

public class Memory {
    
}

/*
   2 types of memory :
     -> stack
     ->heap
    Both stack and heap are created by JVM and stored in RAM

    Stack Memory :

    all the temporary variables stored in the stack for example int a = 10
    
    here for each and every method there is seperated blocks in memory for example public getAdd() -> this method has seperate block in memory so inside that method whatevere there there will be stored in that particular block of memory

    -> Primitive datatypes stored in the stack

    -> whenever we created an obj it will stored in the heap and it's reference will be stored in the stack

       -> Here there are types  -> check these references in the pdf file of shreyansh jain
       Strong reference
       Weak reference
         Soft reference -> to delete this in heap this will completely depends upon Garbage Collector if there is no space it will delete or else wont delete


    -> Each thread has its own stack memory

    -> varaibles within the scope is only visible and as soon as any variable goes out of the scope  it get deleted from the stack in LIFO order

    -> when stack memory goes full it will comes the error as "java.lang.Outofmemory"

    Heap Memory:

    -> So here when obj created in heap it's reference will be stored in stack only when we end up with the methods stack will be clealry deleted 
       but in the heap memory it won't be deleted the objects that we were created so then "garbage collector"  came into the picture 

    -> JVM has full control over to run the system.gc() to run the garbage collector 


    -> here for example if we can create like this
     Person obj1 = new Person();
     then obj1  reference to the object will be stored in stack and object is created in the heap
     if we do like this obj1 = null then reference will be removed and also object will be envoked by the garbage collector(GC) in heap
     Person obj2 = new Person()
     obj1 = obj2; then obj1 also reference to Person obj2

     Here very very interseting topic about the Heap memory check the pdf :
     after sometime in heap GC envokes then GC will do 2 things
       -> Mark and Sweap Algo

    -> here no reference objects will be deleted and other willl be shifting to the survivor of s0 or s1 along with increasing the age (age will be increase)



 */


