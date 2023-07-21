package com.leetcode;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = 1;

        int sum = 0;

        while (nums[left] + nums[right] != target) {
            sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (right + 1 != nums.length) {
                right++;
            } else if (right + 1 == nums.length) {
                left++;
                right = left + 1;
            }
        }

        return nums[left] + nums[right] == target ? new int[]{left, right} : new int[]{0, 1};

        /*
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return new int[]{0, 1};
         */
    }
}

public class SolutionTwoSum {
    static void testCases() {
        System.out.println("test cases");

        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9))); // [0, 1]
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2, 4}, 6))); // [1, 2]
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 3}, 6))); // [0, 1]
    }

    public static void main(String[] args) {
        testCases();
    }
}
