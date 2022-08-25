package com.qyu4x.qq.hackerrank;

import java.util.SortedMap;
import java.util.TreeMap;

class ResultNumberCount {

    public void numberCount(String kata) {
        char[] ch = kata.toCharArray();
        SortedMap<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < ch.length; i++) {
            Character ks = ch[i];
            int cc = 0;

            for (int j = 0; j < ch.length; j++) {
                if (ks.equals(ch[j])) {
                    cc += 1;
                }
            }

            result.put(ks, cc);
        }

        result.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
public class NumberCount {
    public static void main(String[] args) {
       ResultNumberCount resultNumberCount = new ResultNumberCount();
       resultNumberCount.numberCount("maka");
    }
}
