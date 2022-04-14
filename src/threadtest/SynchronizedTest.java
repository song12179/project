package threadtest;

public class SynchronizedTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread = new Thread(window);
        Thread thread1 = new Thread(window);
        thread.start();
        thread1.start();
    }
}
class Window implements Runnable{
private Integer target = 100;
    @Override
    public void run() {
        synchronized(this){
        while(target>0){
            notify();
            System.out.println(Thread.currentThread().getName()+" "+ target);
            target--;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}