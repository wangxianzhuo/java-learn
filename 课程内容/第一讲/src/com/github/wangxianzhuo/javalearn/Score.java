package com.github.wangxianzhuo.javalearn;

import static java.lang.Math.floor;

/**
 * description: Score
 * date: 2020/4/19 8:32
 *
 * @author: shangjie
 * @version: 1.0
 */
public class Score {
    public String getGradeLevel(double grade) {
        int n = (int) floor(grade / 10);

        switch (n) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "E";
        }
    }
}
