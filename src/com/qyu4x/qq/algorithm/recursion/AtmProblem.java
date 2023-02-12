package com.qyu4x.qq.algorithm.recursion;

class Person {
    private Integer nextInLine;

    public Integer getNextInLine() {
        return nextInLine;
    }

    public void setNextInLine(Integer nextInLine) {
        this.nextInLine = nextInLine;
    }
}
public class AtmProblem {
    public static Integer getMyCurrentPosition(Person person) {
        if (person.getNextInLine() == null) {
            return 1;
        }

        return 1 + getMyCurrentPosition(person);
    }
}
