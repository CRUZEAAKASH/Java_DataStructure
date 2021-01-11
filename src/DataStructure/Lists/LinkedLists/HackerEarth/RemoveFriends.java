package Practise.DataStructure.Lists.LinkedLists.HackerEarth;

import java.util.Scanner;

class Node1 {

    private int data;
    private Node next;

    public Node1(int data) {
        this.data = data;
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

public class RemoveFriends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = Integer.parseInt(scanner.nextLine());
        Node1 node1 = null;
        Node1 head = null;
        Node1 current = null;
        Node1 previous = null;
        while (numberOfTestCases-- > 0) {
            int numberOfFriends = scanner.nextInt();
            int numberOfFriendsToBeDeleted = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < numberOfFriends; i++) {
                if (node1 == null) {
                    head = current = new Node1(scanner.nextInt());
                }
            }
        }
    }
}
