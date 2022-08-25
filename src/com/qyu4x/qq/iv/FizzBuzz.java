package com.qyu4x.qq.iv;

import java.util.Scanner;

class ResultFizzBuzz {

    public void fizzBuzz(Integer n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void fizzBuzzBug1(Integer n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void fizzBuzzBug2(Integer n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void fizzBuzz3If(Integer n) {
        for (int i = 1; i <= n; i++) {
            String defaultValue = Integer.toString(i);

            if (i % 3 == 0) {
                defaultValue = "Fizz";
            }

            if (i % 5 == 0) {
                defaultValue = "Buzz";
            }

            if (i % 3 == 0 && i % 5 == 0) {
                defaultValue = "FizzBuzz";
            }

            System.out.println(defaultValue);
        }
    }
}

public class FizzBuzz {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer v = scanner.nextInt();

        ResultFizzBuzz resultFizzBuzz = new ResultFizzBuzz();
        resultFizzBuzz.fizzBuzz(v);

    }
}
