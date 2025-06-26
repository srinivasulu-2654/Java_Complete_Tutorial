package HumanResource;

public class Orders {
    
    protected void getInvoice() {
        System.out.println("Heere is the invoice");
    }

    public void printVoice(){
        getInvoice();
    }
}


// Protected can be access in the same package but other class or else can access other sub-classes in different package
