package HumanResource;

public class Invoice {

    public void getOrder()
    {
        Orders obj = new Orders();
        obj.getInvoice();
    }
}

// that means here protected can access within the same package but in different classes