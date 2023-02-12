package com.qyu4x.qq.hackerrank;

import java.util.*;

class ResultPickingNumber {
    public static int pickingNumber(List<Integer> a) {
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.indexOf(i) <= 1) {
                current.add(a.indexOf(i));
            }
        }
        Arrays.sort(current.toArray());
        List<Integer> pick = new ArrayList<>();
        for (int j = 0; j < current.size(); j++) {
            if (current.indexOf(j) <= 1) {
                pick.add(current.indexOf(j));
            }
        }

        return 0;
    }
}
public class PickingNumber {
}
