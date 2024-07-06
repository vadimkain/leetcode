package com.leetcode.old;

import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(strs);

        if (strs.length == 1) return strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return stringBuilder.toString();
                }
            }

            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}

public class SolutionLongestCommonPrefix {

    static void testCase1() {
        System.out.println("Test case 1");

//        Input: strs = ["flower","flow","flight"]
//        Expected: "fl"

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    static void testCase2() {
        System.out.println("Test case 2");

//        Input: strs = ["dog","racecar","car"]
//        Expected: ""
//        Explanation: There is no common prefix among the input strings.

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    static void testCase3() {
        System.out.println("Test case 3");

//        Input strs = ["a"]
//        Expected "a"

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"a"}));
    }

    static void testCase4() {
        System.out.println("Test case 4");

//        Input strs =["reflower","flow","flight"]
//        Expected ""

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
    }

    static void testCase5() {
        System.out.println("Test case 5");

//        Input strs = ["ab", "a"]
//        Expected "a"

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"ab", "a"}));

    }

    static void testCase6() {
        System.out.println("Test case 6");

//        Input strs = ["flower","flower","flower","flower"]
//        Expected "flower"

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
    }
}
