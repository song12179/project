package test.Sort;

import java.util.Arrays;
//插入排序
public class InserSort {
    public static void main(String[] args) {
        int[] array ={2,3,5,6,4,9,11,36,411,8};
        System.out.println("排序前 "+ Arrays.toString(array));
        insertsort(array);
        System.out.println("排序后 "+ Arrays.toString(array));
    }
    public static void insertsort(int[] arr){
        int j =0;
        //遍历所有的数字
        for(int i =1;i<arr.length;i++){
            //如果当前数字比前一个小
            if(arr[i]<arr[i-1]){
                // 用temp把当前数字存起来
                int temp = arr[i];
                for(j =i-1;j>=0 && arr[j]>temp;j--){
                    //把前一个数字赋给后一个数字
                    arr[j+1] = arr[j];
                }
                //把临时变量赋给不满足条件的换一个数字
                arr[j+1] = arr[j];
            }
        }
}
}
