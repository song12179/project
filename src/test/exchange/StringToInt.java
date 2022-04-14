package test.exchange;

import test.ArrayDemo.Array;

import java.util.Arrays;

/*
* 将字符串“91 27 46 38 50” 转化为int类型的“237 38 46 50 91”
* 定义一个字符串
* 把字符串中的数字存储到一个int类型的数组中
*     得到的字符串中每个数字数据？public String[] split(String regex)
*     定义一个int的数组，把String数组中的每一个元素存储到int数组中 parseInt(String s )
* 对数组进行排序
* 把排序后的int数组中的元素进行拼接得到一个字符串，拼接采用StringBUilder来实现
*
* */
public class StringToInt {
    public static void main(String[] args) {
        String s1 = "91 27 46 38 50";
        String[] arr1 = s1.split(" ");

        int arr3[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=Integer.parseInt(arr1[i]);
        }
        Arrays.sort(arr3);

        StringBuffer s = new StringBuffer();
        for(int i=0;i<arr3.length;i++){
            if(i==arr3.length-1){
                s.append(arr3[i]);
            }else{
                s.append(arr3[i]).append(" ");
            }

        }
        String ss = s.toString();
        System.out.println(ss);
    }
}
