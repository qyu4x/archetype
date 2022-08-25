package com.qyu4x.qq.tlxtoki;

class ResultLamp {
    public void lamp(long N) {
        long dc = 0;
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                dc++;
            }
        }

        if (dc%2 == 0) {
            System.out.println("lampu mati");
        } else {
            System.out.println("lampu menyala");
        }
    }
}

public class Lamp {
    public static void main(String[] args) {
        ResultLamp resultLamp = new ResultLamp();
        resultLamp.lamp(5);

    }
}
