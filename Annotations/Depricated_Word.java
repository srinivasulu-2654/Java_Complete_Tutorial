package Annotations;

public class Depricated_Word {
    
    @Deprecated
    public void dummyMethod()
    {
        System.out.println("Old method logic here");
    } 

    public void newMthod()
    {
        System.out.println("New method");
    }


    public static void main(String[] args)
    {
        Depricated_Word obj = new Depricated_Word();

        obj.dummyMethod();
        obj.newMthod();
    }
}
