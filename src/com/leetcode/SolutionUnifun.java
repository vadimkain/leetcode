package com.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class SolutionUnifun {

    static void PythagorasMultiplicationTable() {
        int[][] A = new int[9][9];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (j + 1) * (i + 1);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findTheMostFrequentlyOccurringCharacterInTheString() {
        String str = "jdsdsodjsdddddddddddddddddddddddfsdfsfsdfsfweddddddd fdfsfds";

        Map<Character, Integer> dictionary = new TreeMap<>();

        char[] arrayChars = str.toCharArray();

        for (char c : arrayChars) {
            if (dictionary.get(c) != null) {
                dictionary.put(c, dictionary.get(c) + 1);
            } else {
                dictionary.put(c, 1);
            }
        }

        int max = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> pair : dictionary.entrySet()) {
            if (max < pair.getValue()) {
                maxChar = pair.getKey();
                max = pair.getValue();
            }
        }

        System.out.println(maxChar);
    }

    static void reverseRows() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length - 1;
            while (left < right) {
                // Обмениваем значения элементов
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;

                left++;
                right--;
            }
        }

        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
