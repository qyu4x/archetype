package com.qyu4x.qq.iv;

class ResultPalindrome {
    public boolean palindrome(String v) {
        boolean s = true;
        for (int i = 0; i < v.length(); i++) {
            if (v.charAt(i) != v.charAt(v.length()-1-i)) {
                s = false;
                break;
            }
        }

        return s;
    }
}
public class Palindrome {
    public static void main(String[] args) {

        ResultPalindrome resultPalindrome = new ResultPalindrome();
        boolean r = resultPalindrome.palindrome("KATAK");
        System.out.println(r);
    }

}
