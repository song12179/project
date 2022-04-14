package test.Sort;

import java.util.Arrays;

//希尔排序
public class ShellSort {
    public static void main(String[] args) {
        int[] array ={1,3,4,2,55,34,7,9};
        System.out.println("排序前 "+ Arrays.toString(array));
        shellsort(array);
        System.out.println("排序后 "+ Arrays.toString(array));
    }
    public static void shellsort(int[] arr){
        //遍历所有的步长
        for (int s =arr.length/2;s>0;s/=2){
            //遍历所有的元素
            for (int i=s;i<arr.length;i++){
                //遍历本组中所有的元素
                for (int j=i-s;j>=0;j-=s){
                    //如果当前元素大于加上步长的那个元素
                    if(arr[j]>arr[j+s]){
                        int temp = arr[j];
                        arr[j] = arr[j+s];
                        arr[j+s] =temp;
                    }
                }
            }
        }
    }
}
