package threadtest;

import org.w3c.dom.ls.LSOutput;
/*两个账户往一个账号存钱，一次存100，直到账户达到3000元
*
* */
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    public static void main(String[] args) {
    Account account = new Account();
    Thread thread =new Thread(account);
    Thread thread1 = new Thread(account);
    thread.start();
    thread1.start();
    }
}
class Account implements Runnable{
    int moneyall = 0;
    int moneyin = 100;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try{
                lock.lock();
                if (moneyall<3000){
                    Thread.sleep(100);
                    moneyall+=moneyin;
                    System.out.println(Thread.currentThread().getName()+"存入 "+moneyin+"账户共有："+moneyall);
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