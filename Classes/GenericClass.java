package Classes;

// public class Generic {
    
// }

/*  
    here we came to this concept for not 

    explore about the non-generic sub class  
 */

public class GenericClass {
    
    public <T> void setValue(T busObject) 
    {
        
    }

    public static void main(String[] args) {
        GenericClass obj = new GenericClass();
        obj.setValue(new Bus());
    }
}


 