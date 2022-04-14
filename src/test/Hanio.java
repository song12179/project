package test;

public class Hanio {
    public static void main(String[] args) {
        hanio(2,'A','B','C');
    }
    //n(盘子的数量) from(开始的位置)  in(中间的位置) to(目的位置)
    public static void hanio(int n,char from,char in,char to){
     if(n==1){
         System.out.println("第1个盘子从"+from+"移动到"+to);
     }
     else{
         //移动上面所有的盘子到中间位置
         hanio(n-1,from,to,in);
         //移动下面的盘子
         System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
         //把上面的所有盘子从中间移到目标位置
         hanio(n-1,in,from,to);
     }
    }
}
