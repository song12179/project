package test.ArrayDemo;

import java.awt.datatransfer.SystemFlavorMap;
import java.lang.reflect.Array;
import java.util.Arrays;
//数组的使用
public class myArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0;i < arr.length;i++){
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));//数组的查看
        //数组中在末尾增加一个元素7
        int dist = 7;
        int[] arr1 = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
            }
        arr1[arr1.length-1]=dist;
        arr = arr1;
        System.out.println(Arrays.toString(arr));//数组的查看

        //删除数组中第二个元素
        int a = 2;
        int [] arr2 =new int[arr.length-2];
        for(int i = 0;i < arr.length-2;i++){
            if (i<a){
                arr2[i] = arr[i];
            }
            else {
                arr2[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
        }


    }




