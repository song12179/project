package threadtest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class PoolThread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor s = (ThreadPoolExecutor) service;

        service.execute(new Number1());
        service.shutdown();
    }
}
class Number1 implements Runnable{
  int n = 0;
    @Override
    public void run() {
        while (true) {
            if (n < 10) {
                System.out.println(Thread.currentThread().getName()+(n += n));
                n++;
            }else{
                break;
            }
        }
    }
}