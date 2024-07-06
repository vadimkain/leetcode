package com.leetcode.old;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class EndavaSolution {

    static boolean check(String string) {

        if (string == null || string.isEmpty()) return false;

        Map<Character, Integer> dictionary = new TreeMap<>();

        for (char c : string.toLowerCase().toCharArray()) {
            if (dictionary.get(c) != null) {
                dictionary.put(c, dictionary.get(c) + 1);
            } else {
                dictionary.put(c, 1);
            }
        }


        for (char c : string.toLowerCase().toCharArray()) {
            if (dictionary.get(c) != 1) return false;
        }

        return true;

//        throw new UnsupportedOperationException(); // replace with your solution
    }

    static int[] pairClosestToZero(int[] array) {
        return new int[] {0, 0};
    }

    public static void main(String[] args) {
        System.out.println(check(""));
//        -5 and 6
        System.out.println(Arrays.toString(pairClosestToZero(new int[] {1, 3, -5, 7, 8, 20, -40, 6})));
    }
}
