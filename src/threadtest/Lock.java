package threadtest;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    public static void main(String[] args) {
    Windows window =new Windows();
    Thread thread = new Thread(window);
    Thread thread1 = new Thread(window);
    thread.start();
    thread1.start();
    }
}
class Windows implements Runnable{
    int tracket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try{
                lock.lock();

                if(tracket > 0){
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+" "+tracket);
                    tracket--;

                }else{
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally{
                lock.unlock();
            }

        }
    }
}
