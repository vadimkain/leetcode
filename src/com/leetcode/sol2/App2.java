package com.leetcode.sol2;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[i + nums1.length] = nums2[i];
        }

//        insertion sort
        for (int i = 1; i < merged.length; i++) {
            int key = merged[i];
            int j = i - 1;

            while (j >= 0 && merged[j] > key) {
                merged[j + 1] = merged[j];
                j--;
            }

            merged[j + 1] = key;
        }

        if (merged.length % 2 != 0) {
            return merged[merged.length / 2];
        }

        return (double) (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;
    }
}

public class App2 {
    static void testCase1() {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    static void testCase2() {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static void main(String[] args) {
//        testCase1();
        testCase2();
    }
}
