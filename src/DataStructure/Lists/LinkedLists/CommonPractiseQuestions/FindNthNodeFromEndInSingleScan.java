package Practise.DataStructure.Lists.LinkedLists.CommonPractiseQuestions;

import Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists.LinkedList;
import Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode;

public class FindNthNodeFromEndInSingleScan {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 7, 10, 12, 15};
        ListNode node = null;
        LinkedList linkedList = new LinkedList();
        for (int i : arr) {
            node = new ListNode(i);
            linkedList.insertNodeAtEndOfList(node);
        }

        //Need 4th node from the end
        int position = 6;

        ListNode previous = linkedList.getHead();
        ListNode scaler = linkedList.getHead();
        for (int i = 1; i <= position; i++) {
            scaler = scaler.getNext();
        }
        while (scaler != null) {
            previous = previous.getNext();
            scaler = scaler.getNext();
        }
        System.out.println("Nth node from end = " + previous.getData());
    }
}
