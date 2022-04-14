package threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallThread {
    public static void main(String[] args) {
        Number number = new Number();
        FutureTask futureTask = new FutureTask(number);
        new Thread(futureTask).start();
        try {
            Object num = futureTask.get();
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
class Number implements Callable{
    Integer n = 0;
    Integer result = 0;
    @Override
    public Object call() throws Exception {
        while (true){
            if (n < 10){
                System.out.println(Thread.currentThread().getName()+":"+n);
                result += n;
                n++;
            }else{
                break;
            }
        }
        return result;
    }
}