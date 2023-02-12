package com.qyu4x.qq.algorithm.recursion;

public class Factorial {
    public static void main(String[] args) {
        int value = factorial(5);
        System.out.println(value);
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
