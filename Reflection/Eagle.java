package Reflection;
import java.lang.reflect.*;



public class Eagle {
    
    public String breed;
    private boolean swim;

    public void fly()
    {
        System.out.println("Can fly");

    }

    private void eat()
    {
        System.out.println("Can eat the bird");
    }


    public static void main(String[] args)
    {
        Class eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}


