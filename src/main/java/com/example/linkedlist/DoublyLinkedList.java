package com.example.linkedlist;

public class DoublyLinkedList {
    // Node class to represent each element in the doubly linked list
    static class Node {
        int data;
        Node next;
        Node prev;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    // Constructor to initialize the linked list
    public DoublyLinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        if (temp.data == data) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found!");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Search a node by value
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Print all nodes in the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
