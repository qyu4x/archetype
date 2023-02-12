package com.qyu4x.qq.hackerrank;

class Solution {
    public static String catAndMouse(int x, int y, int z) {
        String catA = "Cat A";
        String catB = "Cat B";
        String mouseC = "Mouse C";
        int distanceX = z - x <= 0 ? (z - x) * -1 : z - x;
        int distanceY = z - y <= 0 ? (z - y) * -1 : z - y;

        if (distanceX == distanceY) {
            return mouseC;
        } else if (distanceY < distanceX) {
            return catB;
        } else {
            return catA;
        }
    }
}

public class CatAndMouse {
    public static void main(String[] args) {
        
    }
}
