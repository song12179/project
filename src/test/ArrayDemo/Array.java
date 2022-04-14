package test.ArrayDemo;

import java.util.Arrays;

public class Array {
    private int[] elements;
    public Array(){
        elements =new int[0];
    }
    //获取数组的长度
    public int size(){
        return elements.length;
    }
    //在数组的末尾添加一个元素
    public void add(int element){
        int[] array = new int[elements.length+1];
        for (int i = 0;i < elements.length;i++){
            array[i] = elements[i];
        }
        array[elements.length]=element;
        elements = array;
    }
    //显示数组的元素
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
    //删除指定位置的元素
    public void delete(int index){
        if(index < 0 || index >elements.length ){
            throw new RuntimeException("数组越界了！");
        }
        int[] array = new int[elements.length-1];
        for (int i =0;i<elements.length-1;i++){
            if (i < index-1) {
                array[i] = elements[i];
            }else{
            array[i] = elements[i+1];
        }
            elements =array;
        }
    }
    //创造一个长度为x的数组
    public void make(int len){
        int[] array = new int[len];
        elements =array;
    }
    //插入一个元素到指定位置
    public void insert(int index,int elemt){
        if(index<0 || index>elements.length){
            throw new RuntimeException("数组越界了！");
        }
        int[] array = new int[elements.length+1];
        for(int i =0;i<elements.length+1;i++){
            if(i<index-1){
                array[i] = elements[i];
            }
            else if(i == (index-1)){
                array[i] = elemt;
            }
            else{
                array[i] = elements[i-1];
            }
        }
        elements = array;
    }
    //替换特定位置的元素
    public void replace(int index,int elemt){
        if(index<0 || index>elements.length){
            throw new RuntimeException("数组下标越界了！");
        }
        int[] array =new int[elements.length];
        for(int i =0;i<elements.length;i++){
             if(i == index-1){
                array[i] = elemt;
            }
            else {
                array[i] = elements[i];
            }
        }
        elements =array;
    }
}
