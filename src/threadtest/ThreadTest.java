package threadtest;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread.start();
//        myThread2.start();

    }
}
class MyThread1 extends Thread{
    private static Integer integer =100;
    @Override
    public void run() {
        synchronized (MyThread1.class){
//        for (int i = 0; i < 100; i++) {
//            if (i%2==0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            while(integer>0){
                System.out.println(Thread.currentThread().getName()+"  "+integer);
                integer--;
            }
        }
        }
//    }
//    }
}
//class MyThread2 extends Thread {
//    @Override
//    public void run() {
//        synchronized (MyThread2.class) {
////            for (int i = 0; i < 100; i++) {
////                if (i % 2 != 0) {
//
////                    System.out.println(Thread.currentThread().getName() + "  " + i);
////                }
////            }
//        }
//    }
//}