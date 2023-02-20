package com.qyu4x.qq.codewars;

class ResultSequare {
    public boolean isSquare(int n) {
        boolean v = true;

        if (n < 0) {
            v = false;
            return v;
        }

        for (long i = 0; i <= n-((n/2)); i++) {
            if (i == 0) {
                v = i * i == n;
                if (v) {
                    break;
                }
            } else {
                v = i * i == n;
                if (v) {
                    break;
                }
            }
        }
        return v;
    }

}
public class Square {
    public static void main(String[] args) {
        ResultSequare resultSequare = new ResultSequare();
        boolean v = resultSequare.isSquare(158356657);
        System.out.println(v);
    }
}
