package test.myStackDemo;

import java.util.Arrays;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack =new MyStack();
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);

        System.out.println(Arrays.toString(myStack.elements));
        System.out.println("栈顶元素为：" + myStack.pop());//执行了一次删除操作，数组长度减一
        myStack.peek();
        System.out.println("栈顶元素为：" + myStack.peek());
    }
}
