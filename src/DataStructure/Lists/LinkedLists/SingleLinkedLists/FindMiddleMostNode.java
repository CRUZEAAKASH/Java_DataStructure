package DataStructure.Lists.LinkedLists.SingleLinkedLists;

public class FindMiddleMostNode {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8, 10};
        DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode node;
        LinkedList linkedList = new LinkedList();
        for (int i : arr) {
            node = new DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode(i);
            linkedList.insertNodeAtEndOfList(node);
        }
        DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode p = linkedList.getHead(), q = linkedList.getHead();
        while (q != null) {
            System.out.println("Data of slow node = " + p.getData());
            System.out.println("Data of fast node = " + q.getData());
            p = p.getNext();
            q = q.getNext().getNext();
        }
        System.out.println("Middle Most Node Data = " + p.getData());

    }
}
