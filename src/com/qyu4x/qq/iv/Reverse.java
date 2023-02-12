package com.qyu4x.qq.iv;

public class Reverse {
    public static void main(String[] args) {

        String tokek = reverse("tokek");
        System.out.println(tokek);

        boolean katak = palindrome("katak");
        System.out.println(katak);
    }

    static String reverse(String word) {
        String letter = "";
        for (int i = word.length()-1; i >= 0; i--) {
            letter += word.charAt(i);
        }
       return letter;
    }

    static boolean palindrome(String word) {
        String letter = "";
        for (int i = word.length()-1; i >= 0; i--) {
            letter += word.charAt(i);
        }
        return letter.equals(word);
    }
}
