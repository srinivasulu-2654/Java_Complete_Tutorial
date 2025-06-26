package Methods;

import HumanResource.Orders;

public class ProtectedMember extends Orders {
    
    public void getProtectedAccess() 
    {
        getInvoice();
    }
}

// From here we can learn can be accessbile in sub classess from differernt packages