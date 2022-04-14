package test.Sort;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] array ={1,2,6,3,8,9,7,11,4};
        System.out.println("排序前 "+ Arrays.toString(array));
        bubble(array);
        System.out.println("排序后 "+ Arrays.toString(array));

    }
    public static void bubble(int[] array){
        //控制比较轮数
        for (int a =0;a<array.length-1;a++){
            //控制比较次数
            for(int i =0;i<array.length-1-a;i++) {
                int aa = 0;
                if (array[i] >= array[i + 1]) {
                    aa = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aa;

                }
            }
            }

        }
    }

