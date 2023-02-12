package com.qyu4x.qq.hackerrank;

class CamelCaseResult {

    static int camelCaseResult(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int base = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                base++;
            }
        }

        return 1 + base;
    }

}
public class CamelCase {
}
