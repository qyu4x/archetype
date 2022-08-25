package com.qyu4x.qq.hackerrank;

import java.util.List;

class ResultPlusMinus {

    public void plusMinus(List<Integer> arr) {
        float l = arr.size();
        float p = 0, m = 0, z = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                m++;
            } else if (arr.get(i) > 0) {
                p++;
            } else {
                z++;
            }
        }

        System.out.println(p/l);
        System.out.println(m/l);
        System.out.println(z/l);
    }
}
public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> list = List.of(-4, 3, -9, 0, 4, 1);
        ResultPlusMinus result = new ResultPlusMinus();
        result.plusMinus(list);

        /**
         * get the ratio plus minus and zero value
         *
         * expected
         * negative = 2
         * positive = 3
         * zero = 0
         *
         * length of list = 6
         *
         * 2/6 = 0.33333334
         * 3/6 = 0.5
         * 1/6 = 16666667
         */


    }
}
