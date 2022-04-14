package day02;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int l = 0; l < 10000; l++) {
            System.out.println(l);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("--------------------------------");
        try {
            time("2020-1-1 12:30","2020-1-2 12:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void time(String enterTime, String exitTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        long timeinter = sdf.parse(enterTime).getTime();
        long timeexit = sdf.parse(exitTime).getTime();
        long time = timeexit-timeinter;
        int min = (int) (time/1000/60);
        System.out.println(min);
    }

}
