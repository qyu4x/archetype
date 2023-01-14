package com.qyu4x.qq.hackerrank;


class ResultKangoroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String status = "NO";

        int kangoro1 = x1;
        int kangoro2 = x2;
        for (int i = 0; i < 10000; i++) {
            kangoro1 += v1;
            kangoro2 += v2;

            if (kangoro1 == kangoro2) {
                status = "YES";
                break;
            }
        }

        return status;

    }

}
public class Kangoroo {
}
