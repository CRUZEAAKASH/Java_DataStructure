package DataStructure.HackerRankPractise;

import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    Node(int d) {
        this.data = d;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class Day15_LinkedList {

    public static Node insertNodeAtTheEndOfTheLinkedList(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node q = head;
            while (q.getNext() != null) {
                q = q.getNext();
            }
            q.setNext(newNode);
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        return insertNodeAtTheEndOfTheLinkedList(head, data);
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.getData() + " ");
            start = start.getNext();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
