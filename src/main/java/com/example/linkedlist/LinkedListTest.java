package com.example.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        // Testing Singly Linked List
        System.out.println("Singly Linked List Operations:");
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.insert(10);
        sList.insert(20);
        sList.insert(30);
        sList.printList();

        System.out.println("Deleting 20 from Singly Linked List:");
        sList.delete(20);
        sList.printList();

        System.out.println("Searching for 10 in Singly Linked List: " + sList.search(10));

        // Testing Doubly Linked List
        System.out.println("\nDoubly Linked List Operations:");
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insert(100);
        dList.insert(200);
        dList.insert(300);
        dList.printList();

        System.out.println("Deleting 200 from Doubly Linked List:");
        dList.delete(200);
        dList.printList();

        System.out.println("Searching for 100 in Doubly Linked List: " + dList.search(100));
    }
}
