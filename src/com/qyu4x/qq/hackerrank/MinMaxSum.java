package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ResultMinMaxSum {

    public void miniMaxSum(List<Integer> arr) {

        List<Long> list = new ArrayList<>();
        for (int i = 0 ; i < arr.size();i++) {
            long t = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (j != i) {
                    t += arr.get(j);
                }
            }
            list.add(i, t);
        }

        for (int i = 1; i < list.size(); i++) {
            long t = list.get(i);
            int r = i-1;

            while (r >= 0 && list.get(r) > t) {
                Collections.swap(list,r+1, r);
                r = r-1;
            }

            Collections.swap(list,r+1, list.indexOf(t));
        }

        System.out.println(list.get(0) + " " + list.get(list.size()-1));
    }
}
public class MinMaxSum {
    public static void main(String[] args) {
        ResultMinMaxSum result = new ResultMinMaxSum();
        List<Integer> list = new ArrayList<>();
        // 256741038 623958417 467905213 714532089 938071625
        list.add(256741038);
        list.add(623958417);
        list.add(467905213);
        list.add(714532089);
        list.add(938071625);

        /**
         * The numbers are 1 , 2 , 3 , 4 , 5 and . Calculate the following sums using four of the five integers:
         *
         * Sum everything except 1, the sum is 2 + 3 + 4 + 5 =14.
         * Sum everything except 2, the sum is 1 + 3 + 4 + 5 =13.
         * Sum everything except 3, the sum is 1 + 2 + 4 + 5 =12.
         * Sum everything except 4, the sum is 1 + 2 + 3 + 5 =11.
         * Sum everything except 5, the sum is 1 + 2 + 3 + 4 =10.
         *
         * output 10 14
         */

        result.miniMaxSum(list);
    }
}
