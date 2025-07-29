package ProducerAndConsumer2;

public class SharedResource {
    
    boolean itemAvailble = false;

    public synchronized void addItem()
    {
        itemAvailble = true;
        System.out.println("Item added by : " + Thread.currentThread().getName() + "invoking all threads which are waiting");
        notifyAll();
        
    }

    public synchronized void consumeItem()
    {
        System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());

        while(!itemAvailble) {
            try{
                System.out.println("Thread " + Thread.currentThread().getName());
                wait();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailble = false;
    }
}