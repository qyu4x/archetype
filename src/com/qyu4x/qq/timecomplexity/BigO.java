package com.qyu4x.qq.timecomplexity;

public class BigO {

    // O(1), constant -> Good
    public Integer O1(Integer x, Integer y) {
        return x * y;
    }

    // O(log n) -> good than 0(n) , sample log2^8 = ?, base always 2 in cs
    // 2x = 8
    // 2x = 2 pow ? = 8
    // 2 pow 3 so x = 3
    // 2 log 3 = 8
    public Integer OlogN(Integer n) {
        if (n == 0) {
            return n;
        }
        n = Math.floorDiv(n, 2); // level 1, 2 , and 3 recursion, loop 4 times
        return OlogN(n);
    }

    // 0(N), linear -> Good, sample 4^1 = 4
    public Integer ON(Integer number) {
        Integer result = 0;
        for (int i = 0 ; i < number; i++) {
            result += i;
        }
        return result;

    }

    // 0 (n log n) -> comming soon, better than O(n^2)
    public Integer ONlogN(Integer number) {
        Integer  y = number;
        while(number > 1) {
            number = Math.floorDiv(number, 2);
            for (int i = 1; i < y; i++) { // O (n)
                System.out.println(i);
            }
        }

        return ONlogN(number); // log n
    }

    // O(n^2), linear ->  not so good (matrix), sample 4^2 = 16
    public Integer ONpow(Integer counter) {
        Integer xy = 0;
        for (int x = 0; x <  counter; x++) { // column
            for (int y = 0; y < counter; y++) { // rows
                xy = x * y;
            }
        }

        return xy;
    }

    // O(n^3), linear -> not so good (cube), sample 4^3 = 64
    public Integer ONcube(Integer counter) {
        int result = 0;
        for (int i = 0; i < counter; i++) { // column
            for (int j = 0; j < counter; j++) { // rows
                for (int z = 0; z < counter; z++){ // height
                    result += z + j + i;
                }
            }
        }
        return result;
    }
}
