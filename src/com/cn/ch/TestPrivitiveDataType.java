package com.cn.ch;

import java.math.BigDecimal;

/**
 * @author chentiewen
 * @date 2019/12/8 - 21:39
 */
public class TestPrivitiveDataType {
    public static void main(String[] args) {
        int a = 13;
        int b = 014;
        int c = 0x12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double d = 3.14;
        BigDecimal e = BigDecimal.valueOf(0.99999999999999);
        double f = e.doubleValue();
        System.out.println(f);
        if (f > 0) {
            System.out.println("相等！");
        } else {
            System.out.println("不相等！");
        }


    }
}
