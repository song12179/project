package test.Sort;

import java.util.Arrays;
//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={3,5,8,6,4,11,63,1};
        System.out.println("排序前 "+ Arrays.toString(arr));
        quicksort(arr,0,arr.length-1);
        System.out.println("排序后 "+ Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int low = start;
            int high = end;
            int stard  = arr[start];
            while(low<high){
                while (low <high && arr[high]>=stard){
                    high--;
                }
                arr[low]=arr[high];
                while(low<high && arr[low]<=stard){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard; //arr[high]= stard;这个也可以
            quicksort(arr,start,low);
            quicksort(arr,low+1,end);
        }

        }

}
