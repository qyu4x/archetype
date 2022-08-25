package com.qyu4x.qq.hackerrank;

class ResultStairCase {
    public void stairCase(int n) {

        for (int i = 0; i < n; i++) {
            int p = n-i-1;

            for (int j = 0; j < n; j++) {
               if (j >= p) {
                   System.out.print("#");
               } else {
                   System.out.print(" ");
               }
            }

            System.out.println("");
        }
    }
}
public class StairCase {
    public static void main(String[] args) {
        ResultStairCase stairCase = new ResultStairCase();
        stairCase.stairCase(4);
    }
}
