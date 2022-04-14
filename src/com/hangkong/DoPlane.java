package com.hangkong;
import java.util.ArrayList;
import java.util.Scanner;

public class DoPlane {
    //定义主界面
    public static void main(String[] args) {
        //创建集合对象，用于储存航空信息
        ArrayList<Plane> array = new ArrayList<Plane>();
        //用循环完成再次回到主界面,重复整个操作,但无法退出
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎来到航空管理系统--------");
            System.out.println("         1.添加航空信息"            );
            System.out.println("         2.删除航空信息");
            System.out.println("         3.修改航空信息");
            System.out.println("         4.查看所有航空信息");
            System.out.println("         5.查找航班信息(根据航班号)");
            System.out.println("         6.退出");
            System.out.println("请输入你的选择：");
            System.out.println("---------------------------------");

            //用Scanner实现键盘录入
            Scanner in = new Scanner(System.in);//标准式输入
            String line = in.nextLine();//获取一行字符串

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    System.out.println("添加航空信息");
                    addPlane(array);//调用添加航班方法,储存数据
                    break;
                case "2":
                    System.out.println("删除航空信息");
                    deletePlane(array);
                    break;
                case "3":
                    System.out.println("修改航空信息");
                    updatePlane(array);
                    break;
                case "4":
                    System.out.println("查看所有航空信息");
                    findAllPlane(array);
                    break;
                case "5":
                    System.out.println("查找航班信息");
                    find(array);
                    break;
                case "6":
                    System.out.println("谢谢使用！");
                    System.exit(0);//虚拟机退出（整个程序退出）
            }
        }
    }



    //自定义一个方法，用于添加航空信息
    public static void addPlane(ArrayList<Plane> array) {
        //键盘录入航班对象所需要的数据,显示提示信息，提示要输入何种信息
        Scanner in = new Scanner(System.in);
        System.out.println("请输入航班号：");
        String hbno = in.nextLine();
        System.out.println("请输入航班名字：");
        String name = in.nextLine();
        System.out.println("请输入航班出发地：");
        String cfd = in.nextLine();
        System.out.println("请输入航班目的地：");
        String mdd = in.nextLine();
        System.out.println("请输入航班运行时间：(分钟)");
        Integer time = Integer.valueOf(in.nextLine());
        System.out.println("请输入航班价格：(元)");
        Integer price = Integer.valueOf(in.nextLine());

        //创建航班对象，把键盘录入的数据赋值给航班对象的成员变量
        Plane plane = new Plane();
        plane.setHbno(hbno);
        plane.setHbname(name);
        plane.setCfd(cfd);
        plane.setMdd(mdd);
        plane.setTime(time);
        plane.setPrice(price);

        //将航班添加到集合中
        array.add(plane);

        //给出提示添加成功
        System.out.println("添加航班成功！");

    }

    //自定义一个方法，查看航班信息
    public static void findAllPlane(ArrayList<Plane> array) {
        if (array.size() == 0) {//如果数组长度为零，说明数组无数据
            System.out.println("无信息，请添加信息后查询！");
            return;//为了让程序不再往下执行
        }
        //显示表头信息
        System.out.println("航班号\t\t航班名\t\t出发地\t\t目的地\t\t航行时间\t\t价格");//为了美观隔一个字符表，但不够要多几个
        //将集合中数据取出按照格式显示航班信息
        for (int i = 0; i < array.size(); i++) {
            Plane plane = array.get(i);//由于数据都存进去了，航班对象里是没有数据的，所以用数组进行赋值
            System.out.println(plane.getHbno() + "\t\t" + plane.getHbname() + "\t\t" + plane.getCfd() + "\t\t" + plane.getMdd() + "\t\t" + plane.getTime() +"\t\t" +
                    ""+ plane.getPrice());
        }

    }

    //自定义一个方法，删除航班信息
    public static void deletePlane(ArrayList<Plane>array){
        //用键盘录入删除的航班号，提示信息
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要删除的航班号：");
        String hbno = in.nextLine();//接受键盘录入的数据

        //遍历集合循环匹配航班号将对应航班从集合里删除
        for(int i=0;i<array.size();i++){
            Plane s = array.get(i);//循环会一个一个数据匹配直到与我们输入的航班号相同然后删除，相当于扫描
            if(s.getHbno().equals(hbno)){
                array.remove(i);
                break;//找到后就停止匹配
            }
        }
        //给出删除成功提示信息
        System.out.println("删除成功！");


    }

    //自定义一个方法，查找航班信息
    public static void find(ArrayList<Plane>array){
        //用键盘录入删除的航班号，提示信息
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的航班号：");
        String hbno = in.nextLine();//接受键盘录入的数据

        //遍历集合循环匹配航班号将对应航班从集合里删除
        for(int i=0;i<array.size();i++){
            Plane s = array.get(i);//循环会一个一个数据匹配直到与我们输入的航班号号相同，相当于扫描
            if(s.getHbno().equals(hbno)){
                Plane plane = array.get(i);
                System.out.println(plane.getHbno() + "\t\t" + plane.getHbname() + "\t\t" + plane.getCfd() + "\t\t" + plane.getMdd() + "\t\t" + plane.getTime() +"\t\t" +
                        ""+ plane.getPrice());
                System.out.println("查找成功");
                break;//找到后就停止匹配
            }
            System.out.println("查找失败!");
        }

    }

    //自定义一个方法，修改航班信息
    public static void updatePlane(ArrayList<Plane>array){
        //用键盘录入修改的航班号
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要修改的航班号：");
        String sid = in.nextLine();//接受键盘录入的数据

        //键盘录入要修改的航班信息
        System.out.println("请输入新的航班号：");
        String hbno = in.nextLine();//输入待修改的新数据
        System.out.println("请输入新的航班名：");
        String name = in.nextLine();
        System.out.println("请输入新的航班出发地：");
        String cfd = in.nextLine();
        System.out.println("请输入新的航班目的地：");
        String mdd = in.nextLine();
        System.out.println("请输入新的航班价格：");
        Integer price = Integer.valueOf(in.nextLine());
        System.out.println("请输入新的航班航行时间：");
        Integer time = Integer.valueOf(in.nextLine());


        Plane plane = new Plane();
        plane.setHbno(hbno);
        plane.setHbname(name);
        plane.setCfd(cfd);
        plane.setMdd(mdd);
        plane.setPrice(price);
        plane.setTime(time);

        for(int i=0;i<array.size();i++){
            Plane plane1 = array.get(i);//循环会一个一个数据匹配直到与我们输入的航班号相同然后修改，相当于扫描
            if(plane.getHbno().equals(hbno)){
                array.set(i,plane);//删除指定位置插入指定元素
                break;//找到后就停止匹配
            }
        }
        //给出删除成功提示信息
        System.out.println("修改成功！");

    }
}
