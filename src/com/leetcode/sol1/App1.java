package com.leetcode.sol1;

import java.math.BigInteger;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    BigInteger num(Stack<Integer> stack) {

        StringBuffer stringBuffer = new StringBuffer();

        while (!stack.empty()) {
            stringBuffer.append(stack.pop());
        }

        return new BigInteger(stringBuffer.toString());
    }

    Stack<Integer> stack(ListNode l) {

        Stack<Integer> stack = new Stack<>();

        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }

        return stack;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger added = num(stack(l1)).add(num(stack(l2)));

        System.out.println();

        String addedString = added.toString();

        ListNode listNoderesult = new ListNode();
        ListNode dummy = listNoderesult;
        for (int i = addedString.length() - 1; i >= 0; i--) {
            listNoderesult.val = Integer.parseInt(String.valueOf(addedString.charAt(i)));
            System.out.println(listNoderesult.val);

            if (i != 0) {
                listNoderesult.next = new ListNode();
                listNoderesult = listNoderesult.next;
            }
        }

        return dummy;
    }
}

public class App1 {
    static void testCase1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        new Solution().addTwoNumbers(l1, l2);
    }

    static void testCase2() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        new Solution().addTwoNumbers(l1, l2);
    }

    static void testCase3() {
        ListNode l1 = new ListNode(1);
        ListNode l2 =
                new ListNode(1,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9,
                                                                                        new ListNode(9))))))))));

        new Solution().addTwoNumbers(l1, l2);
    }

    public static void main(String[] args) {
//        testCase1();
//        testCase2();
        testCase3();
    }
}
