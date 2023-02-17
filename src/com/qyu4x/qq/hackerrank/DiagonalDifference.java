package com.qyu4x.qq.hackerrank;
import java.util.List;

class Result {
    public int diagonalDifference(List<List<Integer>> arr) {
        int a = 0, b = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j <= i; j++) {
                a += arr.get(i).get(j);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size()-i-1; j >= arr.size()-i-1; j--) {
                b += arr.get(i).get(j);
            }
        }

        int c =  a - b;
        return c < 0 ? c * -1: c;
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                List.of(1, 2, 4),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        Result result = new Result();
        var a = result.diagonalDifference(list);
        System.out.println(a);

        /**
         * 1
         *      5
         *          9
         */

        /**
         *          4
         *      5
         *  7
         */

        // sum 1 + 5 + 9 = 15
        // sum 4 + 5 + 7 = 16

        // expected result = |15-16| = 1
    }
}
