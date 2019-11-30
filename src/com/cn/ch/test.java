package com.cn.ch;

import java.util.Arrays;

/**
 * @author chentiewen
 * @date 2019/11/30 - 19:58
 */
public class test {

    public static void main(String[] args) {
        int[] values = {64, 3, 245, 34, 7, 13, 679, 24, 576, 32};
//        int temp = 0;
        Arrays.sort(values);

        /*冒泡排序*/
//        for (int i = 0; i < values.length - 1; i++) {
//            int k = 1;
//            boolean flag = true;
//            for (int j = 0; j < values.length - 1 - i; j++) {
//                if (values[j] > values[j + 1]) {
//                    temp = values[j + 1];
//                    values[j + 1] = values[j];
//                    values[j] = temp;
//                    flag = false;
//                }
//            }
//        }

        System.out.println(Arrays.toString(values));
        test t = new test();
       int minnd = t.myMether(values, 9);
        System.out.println("最后位置是"+minnd);

    }

    /*二分法*/
    public int myMether(int[] values, int arr) {
        int low = 0;
        int high = values.length - 1;
        int minnd = (low + high) / 2;
        while (low<=high) {
            minnd = (low+high)/2;

            if (arr<values[minnd]) {
                high = minnd-1;
            }
            if (arr>values[minnd]) {
                low = minnd+1;
            }
            if (arr==values[minnd]) {
                return minnd;
            }
        }
        return -1;
    }


}
