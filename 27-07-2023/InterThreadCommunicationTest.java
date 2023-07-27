public class InterThreadCommunicationTest {
    public static void main(String[] args) {
        FoodItem1 food = new FoodItem1("Pizza");
        Producer prod = new Producer(food);
        Consumer cons = new Consumer(food);

        cons.start();
        prod.start();

    }
}
class Producer extends Thread {
    FoodItem1 ref;

    public Producer(FoodItem1 ref) {
        this.ref = ref;
    }

    void produce() {
        ref.served(); //3
    }
    public void run() { //1
        produce(); //2
    }
}
class Consumer extends Thread {
    FoodItem1 ref;

    public Consumer(FoodItem1 ref) {
        this.ref = ref;
    }

     void consume() {
        ref.eat(); //3
    }
    public void run() { //1
        consume(); //2
    }
}

class FoodItem1
{
    String foodItemName;

    boolean isProduced;

    public FoodItem1(String foodItemName) {
        this.foodItemName = foodItemName;
    }
    synchronized  void eat() {// Consumer
        if(isProduced==false) {
            System.out.println("Eater : Waiting for "+foodItemName+" to be produced....");
            try {
                wait(); // super class Object's method
            	//Thread.sleep(1);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Eater : Consuming...."+foodItemName);
    }
    
    //wait and notify can only be called on synchronized methods
    
    synchronized void served() { //Producer
        if(isProduced==false) {
            System.out.println("Producer : Producing..." + foodItemName);
            isProduced = true;
            notify(); //notifies the waiting thread...
        }
    }
}
