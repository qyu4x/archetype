package com.qyu4x.qq.hackerrank;

class ResultTimeConversion {

    public String timeConversion(String s) {
        Integer[] tt = new Integer[3];
        int k = 0;
        for (int i = 0; i < ((s.length()/2)+1)/2;i++) {

            int u = k + 2;
            tt[i] = Integer.parseInt(s.substring(k, u));
            k = k + 3;

        }

        String ll = s.substring(s.length()-2, s.length());
        if (ll.equals("PM")) {
            int rm = 0;
            for (int lx = tt[0]; lx < 12; lx++) {
                rm++;
            }

            if (tt[0] == 12) {
                tt[0] = 12;
            } else {
                int rs = tt[0] * 2 + rm;
                tt[0] = rs == 24? 0 : rs;
            }
            System.out.println(tt[0]);
        } else {
            tt[0] = tt[0] == 12? 0 : tt[0];
            System.out.println(tt[0]);
        }

        String n = tt[0].toString();
        String x = tt[1].toString();
        String y = tt[2].toString();

        String fn = tt[0] < 10? "0" + n : n;
        String fx = tt[1] < 10? "0" + x : x;
        String fy = tt[2] < 10? "0" + y : y;

        return String.format("%s:%s:%s", fn, fx, fy);
    }
}
public class TimeConversion {
    public static void main(String[] args) {
        ResultTimeConversion result = new ResultTimeConversion();
        String rs = result.timeConversion("12:01:00AM");
        System.out.println(rs);

        /**
         * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
         *
         * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
         * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
         *
         * Example
         * 12:01:00PM
         * Return '12:01:00'.
         *
         * 12:01:00AM
         * Return '00:01:00'.
         */
    }
}
