package test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws Exception{
        boolean b = true;
        while(b){
        System.out.println("请输入您要查询的年份:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Calendar calendar =Calendar.getInstance();
        calendar.set(year,2,1);
        calendar.add(Calendar.DATE,-1);
        int i1 = calendar.get(Calendar.DATE);
        System.out.println(i1);
        System.out.println("请问是否继续：（按“0”退出）");
        int a = scanner.nextInt();
        if (a==0){
            break;
        }

        }


        Date date = new Date();
        System.out.println(date);
        System.out.println("---------------");
        date.getTime();
        System.out.println(date);
        System.out.println("---------------");
        //将日期转化为String  format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
        System.out.println("---------------");
        //将String转化为日期   parse
        String da ="2048-1-3";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1=simpleDateFormat1.parse(da);
        System.out.println(date1);
        System.out.println("---------------");
        Calendar calendar1 = Calendar.getInstance();//多态的使用
        System.out.println(calendar1);
        int i = calendar1.get(Calendar.DATE);
        System.out.println(i);

    }
}
