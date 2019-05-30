package com.cn.ch;


import java.util.ArrayList;
import java.util.Date;

/**
 * Demo Class
 *
 * @author  chentiewen
 * @date  2019/05/11
 *
 */
public class Test {


    public static void main(String[] args) {
        //我不知道改写什么注释
        ArrayList list1 = new ArrayList();

        list1.add(0,"123");
        list1.add(1,"456");
        //for循环简写模板：fori;
        String[] arr = new String[]{"tom","lilei","marry","jack","jane"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("普通for循环"+arr[i]);
        }
        for (String s : arr) {
            System.out.println("增强for循环"+s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("另一种的循环"+s);
        }

    }



    public void mether(){
        Date d1 = new Date();
        Throwable throwable1 = new Throwable();
        mether();
    }

    public int mether1(){
        ArrayList<Integer> list1= new ArrayList<Integer>();

        mether();
        return 1;
    }
}
