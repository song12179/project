package test.myQueueDemo;

import java.util.Arrays;
import java.util.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue =new MyQueue();
        myQueue.add(6);
        myQueue.add(9);
        myQueue.add(78);
        System.out.println(Arrays.toString(myQueue.elements));
        System.out.println(myQueue.delete());
        System.out.println(Arrays.toString(myQueue.elements));

    }
}
