package threadtest;

import java.util.concurrent.locks.ReentrantLock;

public class AccountTest {
    public static void main(String[] args) {
    Account1 account1 = new Account1(0);
    Coustomer coustomer = new Coustomer(account1);
    Coustomer coustomer1 = new Coustomer(account1);
    coustomer.start();
    coustomer1.start();
    }
}
class Account1{
    private double blance;
    public Account1(double blance){
        this.blance = blance;
    }
    public synchronized void inAccount(double amt){
        blance+=amt;
        System.out.println(Thread.currentThread().getName()+"余额为："+blance);
    }
}
class Coustomer extends Thread{
    private Account1 account;
    public Coustomer(Account1 account){
        this.account = account;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.inAccount(100.0);
        }
    }
}
