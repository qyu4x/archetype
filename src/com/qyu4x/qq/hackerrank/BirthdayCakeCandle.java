package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ResultBirthdayCakeCandle {

    public int birthdayCakeCandle(List<Integer> candles) {
        for (int i = 1; i < candles.size(); i++) {
            int k = candles.get(i);
            int j = i-1;

            while (j >= 0 && candles.get(j) > k) {
                Collections.swap(candles, j+1, j);
                j = j-1;
            }
            Collections.swap(candles, j+1, candles.indexOf(k));
        }


        int r = 0;
        for (int i = candles.size()-1; i >= 0; i--) {
            int m = candles.get(candles.size()-1);

            if (candles.get(0).equals(m)) {
                r = candles.size();
            } else if (candles.get(i).equals(m)) {
                r++;
            }
        }
        return r;
    }
}

public class BirthdayCakeCandle {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(2);


        ResultBirthdayCakeCandle result = new ResultBirthdayCakeCandle();
        var a = result.birthdayCakeCandle(list);
        System.out.println(a);

    }
}
