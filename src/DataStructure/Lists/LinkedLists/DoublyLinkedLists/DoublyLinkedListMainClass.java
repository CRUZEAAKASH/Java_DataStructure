package Practise.DataStructure.Lists.LinkedLists.DoublyLinkedLists;

public class DoublyLinkedListMainClass {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 6, 7, 8};
        DLLNode node = null;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int i : arr) {
            node = new DLLNode(i);
            doublyLinkedList.insertNodeAtEndOfList(node);
        }
        System.out.println("Length of linked list = " + doublyLinkedList.getLength());
        node = doublyLinkedList.getHead();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }

        //Insert node after 4th position
        node = new DLLNode(3);
        doublyLinkedList.insertNodeAtGivenPositionInList(node, 60);

        System.out.println("Length of linked list = " + doublyLinkedList.getLength());
        node = doublyLinkedList.getHead();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
