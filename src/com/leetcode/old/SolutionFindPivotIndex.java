package com.leetcode.old;


class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

public class SolutionFindPivotIndex {
    static void testCase1() {

        System.out.println("Test case 1");

//        Input: nums = [1,7,3,6,5,6]
//        Output: 3
//        Explanation:
//        The pivot index is 3.
//        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//        Right sum = nums[4] + nums[5] = 5 + 6 = 11

        System.out.println(new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    static void testCase2() {

        System.out.println("Test case 2");

//        Input: nums = [1,2,3]
//        Output: -1
//        Explanation:
//        There is no index that satisfies the conditions in the problem statement.

        System.out.println(new FindPivotIndex().pivotIndex(new int[]{1, 2, 3}));
    }

    static void testCase3() {

        System.out.println("Test case 3");

//        Input: nums = [2,1,-1]
//        Output: 0
//        Explanation:
//        The pivot index is 0.
//        Left sum = 0 (no elements to the left of index 0)
//        Right sum = nums[1] + nums[2] = 1 + -1 = 0

        System.out.println(new FindPivotIndex().pivotIndex(new int[]{2, 1, -1}));
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }
}
