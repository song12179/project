package test.myQueueDemo;

public class MyQueue {
    int[] elements;
    public MyQueue(){
        elements = new int[0];
    }
    //入队列
    public void add(int element){
        int[] array = new int[elements.length+1];
        for (int i =0;i<elements.length;i++){
            array[i] = elements[i];
        }
        array[elements.length] = element;
        elements = array;

    }
    //出队列
    public int delete(){
        int elemnet = elements[0];
        int[] array =new int[elements.length-1];
        for(int i =0;i<elements.length-1;i++){
            array[i] = elements[i+1];
        }
        elements = array;

        return elemnet;

    }
}
