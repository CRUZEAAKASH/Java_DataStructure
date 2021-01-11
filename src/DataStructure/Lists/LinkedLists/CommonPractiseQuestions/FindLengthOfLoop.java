package Practise.DataStructure.Lists.LinkedLists.CommonPractiseQuestions;

import Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode;

public class FindLengthOfLoop {
    ListNode fastPtr;
    ListNode slowPtr;

    public boolean findIfLoopExits(ListNode head) {
        fastPtr = head;
        slowPtr = head;
        while (fastPtr != null && fastPtr.getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfLoop(ListNode head) {
        Boolean isLoopPresent = findIfLoopExits(head);
        int length = 0;
        do {
            fastPtr = fastPtr.getNext();
            length++;
        } while (fastPtr != slowPtr);
        return length;
    }

}
