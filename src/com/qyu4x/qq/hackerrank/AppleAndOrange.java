package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.List;

class ResultAppleAndOrange{

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int resultApple = 0;
        int resultOrange = 0;
        for(int i = 0; i < apples.size(); i++) {
            int sumApple = apples.get(i) + a;
            if (sumApple >= s && sumApple <= t) {
                resultApple++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            int sumOrange = oranges.get(i) + b;
            if (sumOrange >= s && sumOrange <= t) {
                resultOrange++;
            }
        }

        System.out.println(resultApple);
        System.out.println(resultOrange);
    }

}
public class AppleAndOrange {
    public static void main(String[] args) {

    }
}
