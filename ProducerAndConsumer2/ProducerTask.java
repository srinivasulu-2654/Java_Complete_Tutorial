package ProducerAndConsumer2;

public class ProducerTask implements Runnable{
    
    SharedResource sharedResource;

    ProducerTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    public void run() {
        System.out.println("Producer Thread: " + Thread.currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch(Exception e) {
            e.printStackTrace();
        }

        sharedResource.addItem();
    }
}
