package DataStructure.Lists.LinkedLists.CommonPractiseQuestions;

import DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode;

public class FindStartingNodeOfTheLoop {

    public ListNode verifyIfListIsLoopAndReturnStartingNodeOfTheLoop(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        Boolean isLoopPresent = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if (slowPtr == fastPtr) {
                isLoopPresent = true;
                break;
            }
        }
        if (isLoopPresent) {
            slowPtr = head;
            while (slowPtr != fastPtr) {
                slowPtr = slowPtr.getNext();
                fastPtr = fastPtr.getNext();
            }
            return fastPtr;
        }
        return null;
    }

}
