package Practise.DataStructure.Lists.LinkedLists.SingleLinkedLists;

public class LinkedList {

    private ListNode head;
    private int length;

    public LinkedList() {
        length = 0;
    }

    //Get first node in the linked list
    public ListNode getHead() {
        return head;
    }

    //Get Linked List length
    public int getLength() {
        return length;
    }

    //Insert a node at the beginning of the list
    public void insertNodeAtBeginning(ListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    //Insert a node at the end of the list
    public void insertNodeAtEndOfList(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p = head;
            ListNode q = p.getNext();
            while (q != null) {
                p = q;
                q = q.getNext();
            }
            p.setNext(node);
        }
        length++;
    }

    //Insert node at a given position in the list
    public void insertNodeAtGivenPositionInList(ListNode node, int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length;
        }
        if (head == null) {
            head = node;
        } else {
            if (position == 0) {
                node.setNext(head);
                head = node;
            } else {
                ListNode p = head;
                for (int i = 1; i < position; i++) {
                    p = p.getNext();
                }
                ListNode q = p.getNext();
                node.setNext(q);
                p.setNext(node);
            }
            length++;
        }
    }

    //Delete Node from the beginning
    public ListNode deleteNodeAtTheBeginningOfTheLinkedList() {
        ListNode node = head;
        if (node != null) {
            head = node.getNext();
            node.setNext(null);
            length--;
        }
        return node;
    }

    // Delete node at the end of the list
    public ListNode deleteNodeAtTheLastOfTheLinkedList() {
        if (head == null) {
            return null;
        }
        ListNode p = null;
        ListNode q = head;
        ListNode r = head.getNext();
        while (r != null) {
            p = q;
            q = r;
            r = r.getNext();
        }
        p.setNext(null);
        length--;
        return q;
    }

    //Delete Node matching a specified node from the list
    public ListNode deleteSpecifiedNodeFromTheList(ListNode node) {
        if (head == null) {
            return null;
        } else if (node.equals(head)) {
            head = head.getNext();
            node.setNext(null);
            length--;
        } else {
            ListNode p = null;
            ListNode q = head;
            while (q != null) {
                if (q.equals(node)) {
                    p.setNext(node.getNext());
                    node.setNext(null);
                    break;
                } else {
                    p = q;
                    q = q.getNext();
                }
            }
        }
        return node;
    }

    //Return first position of Node value that is equal to required value
    public int getPositionOfRequiredData(int data) {
        ListNode temp = getHead();
        int position = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                return position;
            } else {
                position++;
            }
        }
        return position;
    }

    //Remove everything from the list
    public void clearList() {
        head = null;
        length = 0;
    }
}
