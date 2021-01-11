package Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists;

public class LinkedListMainClass {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6,7,8};
        ListNode listNode = null;
        LinkedList list = new LinkedList();
        for(int i : arr){
            listNode = new ListNode(i);
            list.insertNodeAtEndOfList(listNode);
        }


        //Insert node after 4th position
        listNode = new ListNode(50);
        list.insertNodeAtGivenPositionInList(listNode,4);


        //Delete Node from the first position
        list.deleteNodeAtTheBeginningOfTheLinkedList();

        // Delete last node from the linked list
        list.deleteNodeAtTheLastOfTheLinkedList();

        //Delete node having data 50
        list.deleteSpecifiedNodeFromTheList(listNode);

        //getHead
        listNode = list.getHead();
        while (listNode!=null){
            System.out.println(listNode.getData());
            listNode = listNode.getNext();
        }

    }
}
