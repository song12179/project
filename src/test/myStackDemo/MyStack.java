package test.myStackDemo;

public class MyStack {
    int[] elements;
    public MyStack(){
        elements =new int[0];
    }
    //往栈顶加入元素
    public void push(int element){
        int[] stack = new int[elements.length+1];
        for (int i =0;i<elements.length;i++){
            stack[i] = elements[i];
        }
        stack[stack.length-1] = element;
        elements = stack;
    }
    //取出栈顶元素
    public int pop(){
        int element = elements[elements.length-1];
        if (elements.length == 0){
            throw new RuntimeException("栈为空！");
        }
        int[] stack = new int[elements.length-1];
        for (int i= 0;i<elements.length-1;i++){
            stack[i] = elements[i];
        }
        elements =stack;
        return element;
    }
    //查看栈顶元素
    public int peek(){
        return elements[elements.length-1];
    }
}
