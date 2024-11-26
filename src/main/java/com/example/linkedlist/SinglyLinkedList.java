package com.example.linkedlist;

public class SinglyLinkedList {
    // Node class to represent each element in the list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor to initialize the linked list
    public SinglyLinkedList() {
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
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        if (head.data == data) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        
        if (temp.next == null) {
            System.out.println("Node not found!");
        } else {
            temp.next = temp.next.next;
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

    // Print all the nodes in the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
