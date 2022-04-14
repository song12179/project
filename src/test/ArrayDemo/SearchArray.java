package test.ArrayDemo;

import java.util.Scanner;

public class SearchArray {
    int[] array ={1,2,3,4,5,6,7,8,9};


    public static void main(String[] args) {
        SearchArray searchArray =new SearchArray();
     while(true){
         System.out.println("--------数组的查找方法--------");
         System.out.println("     1.线性查找");
         System.out.println("     2.二分法查找");
         System.out.println("     3.退出");
         System.out.println("请输入你的选择：");
         System.out.println("-------------------------------------");
     Scanner scanner =new Scanner(System.in);
     int ca = scanner.nextInt();
     switch (ca){
         case 1:
             System.out.println("请输入你要查找的数：");
             int s = scanner.nextInt();
             searchArray.search(s);
             break;
         case 2:
             System.out.println("请输入你要查找的数：");
             int c =scanner.nextInt();
             searchArray.search2(c);
             break;
         case 3:
             System.out.println("谢谢使用!");
             System.exit(0);
     }

    }
    }
    //线性查找
    public void search(int element){
        int aa = 0;
        for(int i = 0; i < array.length;i++){
            if (array[i] == element){
                System.out.println("查找元素的位置在第"+(i+1)+"位");
                aa = 1;
  }
         }
        if(aa == 0){
            System.out.println("查找的元素不在数组内!");

        }

    }
    //二分法查找
    public void search2(int elemnt){
        int end = array.length-1;
        int begin = 0;
        int mid = (begin+end)/2;
        int index = -1;


        while(true){
            if(begin>end){

                break;
            }
            if(array[mid] == elemnt){
                index = mid;
                break;
            }
            else{
                if(elemnt>array[mid]){
                    begin = mid + 1;
                }
                else{
                    end = mid-1;
                }
                mid = (begin+end)/2;
            }

        }
        if(index != -1){
        System.out.println("查找的元素在第"+(index+1)+"位!");
        }else{
            System.out.println("查找的元素不在数组内!");
        }

    }
}
