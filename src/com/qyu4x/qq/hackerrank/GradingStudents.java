package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.List;

class ResultGradingStudents {
    public List<Integer> gradingStudents(List<Integer> grades) {
        int i = 0;
        for (int j = 0; j <= 100; j += 5) {

            if (i > grades.size()-1) {
                break;
            }

            if (j < grades.get(i)) {
                continue;
            } else {
                int v = (j - grades.get(i)) < 3? grades.set(i, j) : grades.set(i, grades.get(i));
                if (grades.get(i) < 40) {
                    grades.set(i, v);  // v is the value before updating
                }

                i++;
                j = 0;
            }
        }

        return grades;
    }
}
public class GradingStudents {
    public static void main(String[] args) {
        ResultGradingStudents rs = new ResultGradingStudents();
        List<Integer> gs = new ArrayList<>();
        gs.add(38);
        gs.add(73);
        gs.add(33);
        gs.add(4);

        var grv = rs.gradingStudents(gs);;
        System.out.println(grv.get(0));
        System.out.println(grv.get(1));
        System.out.println(grv.get(2));
        System.out.println(grv.get(3));
    }
}
