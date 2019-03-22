package mtime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Date date = new Date();
        String format = "YYYY-MM-dd HH:mm:ss";
        SimpleDateFormat dformat = new SimpleDateFormat(format);
        System.out.println(dformat.format(date));

        Long timestamp = System.currentTimeMillis();
        String timeText = dformat.format(timestamp);
        System.out.println(timestamp);
        System.out.println(timeText);
    }
}