package com.leetcode;

import java.util.Arrays;

public class SolutionLargestNumberAtLeastTwiceofOthers {

    static int dominantIndex(int[] nums) {

        int[] ints = Arrays.copyOf(nums, nums.length);

        Arrays.sort(nums);

        if (nums[nums.length - 2] == 0 || nums[nums.length - 1] / nums[nums.length - 2] >= 2) {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == nums[nums.length - 1]) {
                    return i;
                }
            }
        }


        return -1;
    }


    static void testCase1() {
//        Input: nums = [3,6,1,0]
//        Output: 1
//        Explanation: 6 is the largest integer.
//        For every other number in the array x, 6 is at least twice as big as x.
//        The index of value 6 is 1, so we return 1.

        int[] nums = {3, 6, 1, 0};

        System.out.println(dominantIndex(nums));
    }

    static void testCase2() {
//        Input: nums = [1,2,3,4]
//        Output: -1
//        Explanation: 4 is less than twice the value of 3, so we return -1.

        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
    }

    static void testCase3() {
//        Expected
//        3
        System.out.println(dominantIndex(new int[]{0, 0, 0, 1}));
    }

    static void testCase4() {
//        Expected
//        5
        System.out.println(dominantIndex(new int[]{1, 2, 16, 35, 44, 100, 27, 0}));
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }
}
