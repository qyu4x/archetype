package com.qyu4x.qq.iv;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String anagram = anagram("katak", "katak");
        System.out.println(anagram);
    }

    static String anagram(String kata1, String kata2) {
        if (kata1.length() != kata2.length()) {
            return "Is Not Anagram";
        } else {
            char[] charsKata1 = kata1.toCharArray();
            char[] charsKata2 = kata2.toCharArray();
            Arrays.sort(charsKata1);
            Arrays.sort(charsKata2);

            if (Arrays.equals(charsKata1, charsKata2)) {
                return "Anagram";
            } else {
                return "Is Not Anagram";
            }
        }
    }
}
