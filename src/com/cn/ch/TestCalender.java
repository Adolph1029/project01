package com.cn.ch;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历
 *
 * @author chentiewen
 * @date 2019/12/8 - 22:00
 */
public class TestCalender {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入打印时间；格式（yyyy-mm-dd）");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(str);
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int maxDate = c.getActualMaximum(Calendar.DATE);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        c.set(Calendar.DAY_OF_MONTH, 1);
        for (int j = 1; j < c.get(Calendar.DAY_OF_WEEK); j++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= maxDate; i++) {
            if (day == c.get(Calendar.DAY_OF_MONTH)) {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
            } else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }
            if (c.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.println();//如果等于周六换行
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }

}
