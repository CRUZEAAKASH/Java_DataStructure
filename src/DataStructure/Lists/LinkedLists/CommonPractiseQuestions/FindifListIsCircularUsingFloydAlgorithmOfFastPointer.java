package DataStructure.Lists.LinkedLists.CommonPractiseQuestions;

import DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode;

public class FindifListIsCircularUsingFloydAlgorithmOfFastPointer {

    public static void main(String[] args) {

    }

    public boolean findIfLoopExits(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }
}
