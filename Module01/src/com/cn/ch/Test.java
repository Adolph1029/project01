package com.cn.ch;


import java.util.Scanner;

/**
 * Demo Class
 *
 * @author  chentiewen
 * @date  2019/05/11
 *
 */
public class Test {


    public static void main(String[] args) {
        int i = 0;
        for ( i = 0; i < 5 ; i++) {
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int count = 0;
            String nf = null;

            int[] arr1 = {31,60,91,121,152,182,213,244,274,305,335,366};
            if(month == 1) {
                count = day;
            }
            boolean bl = (year % 4 ==0 && year % 100 !=0) || year % 400 == 0;
            if (bl) {
                if (month >1 && month <13) {
                    count = arr1[month - 2] + day;
                    nf = "今年是闰年";
                }
            }else {
                count = arr1[month - 2] + day - 1;
                nf = "今年不是闰年";
            }
            System.out.println("是本年的第"+ count + "天,"+nf);
        }

    }
}
