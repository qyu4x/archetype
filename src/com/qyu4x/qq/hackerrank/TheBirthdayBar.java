package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.List;

class ResultTheBirthdayBar {
    public static int birthday(List<Integer> s, int d, int m) {
        // belom kelarrr
        // Write your code here
        // m = segment
        // d = total
        int segment =  m;
        if (segment == 0) {
            return 0;
        }

        if (segment == 1) {
            int counter = 0;
            for (int j = 0; j < s.size(); j++) {
                if (s.indexOf(j) == d) {
                    counter++;
                }
            }
            return counter;
        } else {
            for (int k = 0; k < s.size(); k++) {
                List<List<Integer>> result = new ArrayList<>();
                for (int z = 0; z < s.size(); z++) {
                    if ((s.indexOf(k) + s.indexOf(z)) == d) {
                        List<Integer> current = new ArrayList<>();
                        current.add(s.indexOf(k));
                        current.add(s.indexOf(z));
                    }
                }
            }
        }

        return -1;
    }
}
public class TheBirthdayBar {
}
