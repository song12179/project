package zuiduanlujing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lujing {
    int i = 0;
    public static void main(String[] args) {
        Dijkstra dijkstra1 = new Dijkstra();
        ArrayList arrayList= new ArrayList<Dijkstra>();
        arrayList.add(dijkstra1);
        Floyd floyd1 = new Floyd();
        ArrayList arrayList1 = new ArrayList<Floyd>();
        arrayList1.add(floyd1);
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------城市之间路线最短距离查询--------");
            System.out.println("     1.某一城市到其他各个城市的最短路径");
            System.out.println("     2.任意两个城市之间的最短路径");
            System.out.println("     3.退出");
            System.out.println("请输入你的选择：");
            System.out.println("-------------------------------------");

            //用Scanner实现键盘录入
            Scanner ino = new Scanner(System.in);//标准式输入
            String scn = ino.nextLine();//获取一行字符串


            //用switch语句完成操作的选择
            switch (scn) {
                case "1":
                    System.out.println("请输入要查找的城市:");
                    Scanner ba = new Scanner(System.in);//标准式输入
                    String i = ba.nextLine();//获取一行字符串
                    System.out.println("城市X到其他各个城市的最短路径为：");
                    dijkstra1.dijkstra(0);
                    break;
                case "2":
                    System.out.println("任意两个城市之间距离的查询");
                    System.out.println("查询结果为：");



                    break;
                case "3":
                    System.out.println("谢谢使用！");
                    System.exit(0);//虚拟机退出（整个程序退出）
            }

        }

    }

}
