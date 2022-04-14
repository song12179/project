package threadtest;

public class ProductorAndCoustomer {
    public static void main(String[] args) {
    Clerk clerk = new Clerk();
    Coustomer1 coustomer1 = new Coustomer1(clerk);
    Productor productor  = new Productor(clerk);
    Thread c = new Thread(coustomer1);
    Thread p = new Thread(productor);
    c.setName("消费者");
    p.setName("生产者");
    c.start();
    p.start();
    }
}
class Clerk{
private int number = 0;

    public synchronized void proin() {
        if (number<20){
            number++;
            notify();
            System.out.println("生产者开始生产第"+number+"个产品");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void proout() {
        if(number > 0){
            System.out.println("消费者开始消费第："+number+"个产品");
            number--;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Productor implements Runnable{
    private Clerk clerk;
    public Productor(Clerk c) {
        this.clerk = c;
    }
    @Override
    public void run() {
        System.out.println("生产者开始生产产品！");
        while(true){
            clerk.proin();
        }
    }
}
class Coustomer1 implements Runnable{
    private Clerk clerk;
    public Coustomer1(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while(true){clerk.proout();}
    }
}
