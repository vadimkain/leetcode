package com.leetcode.old;

class MyLinkedList {

    Node head;

    int size;

    private static final class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if ((index < 0) || (size < index)) return -1;

        Node current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current == null) {
            return -1;
        }

        return current.value;
    }

    public void addAtHead(int val) {
        Node current = new Node(val);
        current.next = this.head;
        this.head = current;
        size++;
    }

    public void addAtTail(int val) {
        if (this.head == null) {
            addAtHead(val);
            return;
        }

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if ((index < 0) || (size < index)) return;

        if (index == 0) addAtHead(val);
        else if (index == size) addAtTail(val);
        else {
            Node current = this.head;

            for (int i = 1; i < index; i++) {
                current = current.next;
            }

            Node new_node = new Node(val);
            Node next_nodes_for_new_node = current.next;
            current.next = new_node;
            new_node.next = next_nodes_for_new_node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if ((index < 0) || (size <= index)) return;

        if (index == 0) {
            this.head = this.head.next;
            size--;
            return;
        }

        Node current = this.head;

        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }
}

public class SolutionMyLinkedList {

    static void defaultTestCase() {
        System.out.println("default test case");
        MyLinkedList linkedList = new MyLinkedList();

        for (int i = 0; i < 5; i += 2) {
            linkedList.addAtHead(i);
        }

        for (int i = 10; i <= 15; i += 2) {
            linkedList.addAtTail(i);
        }

        for (int i = 1; i <= 7; i += 2) {
            linkedList.addAtIndex(i, 111);
        }

        linkedList.deleteAtIndex(4);

        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    static void testCaseWhichFailed1() {
        System.out.println("test case which failed 1");

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(0);

        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    static void testCaseWhichFailed2() {
        System.out.println("test case which failed 2");

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(4);
        System.out.println("Value at index 1: " + myLinkedList.get(1));

        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(5);
        myLinkedList.deleteAtIndex(3);

        myLinkedList.addAtHead(7);
        System.out.println("Value at index 3: " + myLinkedList.get(3));
        System.out.println("Value at index 3: " + myLinkedList.get(3));
        System.out.println("Value at index 3: " + myLinkedList.get(3));

        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(4);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {
        defaultTestCase();
        testCaseWhichFailed1();
        testCaseWhichFailed2();
    }
}
