package com.qyu4x.qq.iv;

import java.util.Arrays;
import java.util.List;

class ResultDifference {
    public Integer difference(Integer target) {
        Integer[] array = {270, 113, 240, 125, 330, 110};
        Integer temp = 0;
        // sorting
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            Integer current = array[i];
            for (int j = 1 ; j < array.length; j++) {
                // if array [j] - current = target then input value into temp
                Integer currentValue = array[j] - current;
                if (currentValue.equals(target)) {
                    temp += 1;
                }
            }
        }
        return temp;
    }
}

public class ScoreDifference {

    public static void main(String[] args) {
        ResultDifference resultDifference = new ResultDifference();

        Integer result = resultDifference.difference(2);
        System.out.println(result);

    }
}
