package Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists;

public class FindNthNodeFromEnd {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 7, 9, 12, 15};
        ListNode node = null;
        LinkedList linkedList = new LinkedList();
        for (int i : arr) {
            node = new ListNode(i);
            linkedList.insertNodeAtEndOfList(node);
        }

        //Need 4th node from the end
        int position = 4;


        if (position > linkedList.getLength()) {
            System.out.println("Fewer Number of lists are present in the list");
        } else {
            position = linkedList.getLength() - position + 1;
            node = linkedList.getHead();
            for (int i = 1; i < position; i++) {
                node = node.getNext();
            }
            System.out.println("4th Node from end = " + node.getData());
        }


    }

}
