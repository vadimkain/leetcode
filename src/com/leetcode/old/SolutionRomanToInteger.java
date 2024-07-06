package com.leetcode.old;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanSystem = new HashMap<>();

        int result = 0;

        romanSystem.put('I', 1);
        romanSystem.put('V', 5);
        romanSystem.put('X', 10);
        romanSystem.put('L', 50);
        romanSystem.put('C', 100);
        romanSystem.put('D', 500);
        romanSystem.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanSystem.get(s.charAt(i)) < romanSystem.get(s.charAt(i + 1))) {
                result -= romanSystem.get(s.charAt(i));
            } else {
                result += romanSystem.get(s.charAt(i));
            }
        }

        return result;
    }
}

public class SolutionRomanToInteger {
}
