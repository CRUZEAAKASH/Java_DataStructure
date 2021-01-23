package DataStructure.Lists.LinkedLists.HackerEarth;

//import DataStructure.Lists.LinkedLists.SingleLinkedLists.Node;

//import DataStructure.Lists.LinkedLists.SingleLinkedLists.Node;

import java.util.Scanner;


class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}

public class ReverseEvenIntegerPairs extends Node {

    public ReverseEvenIntegerPairs(int data) {
        super(data);
    }

    public static void main(String[] args) {
        //int[] arr = new int[]{4, 2, 8, 10, 9, 12, 16};
        // Node Node = null;
        // LinkedList list = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        int sizeofLinkedList = scanner.nextInt();
        scanner.nextLine();


        Node Node1 = null;
        Node head = null;
        Node tail = null;
        Node temp = null;
        int previous = -1;
        //LinkedList secondLinkedList = new LinkedList();
        for (int i = 1; i <= sizeofLinkedList; i++) {
            int num = scanner.nextInt();
            if (Node1 == null) {
                Node1 = new Node(num);
                head = tail = temp = Node1;
                previous = num;
            } else {
                Node newNode = new Node(num);
                if (num % 2 == 0 && previous % 2 == 0) {
                    if (temp.getData() % 2 != 0) {
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);
                    } else {
                        newNode.setNext(temp);
                        temp = newNode;
                        head = temp;
                    }
                } else {
                    tail.setNext(newNode);
                    temp = tail;
                    tail = tail.getNext();
                }
            }
            previous = num;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}
