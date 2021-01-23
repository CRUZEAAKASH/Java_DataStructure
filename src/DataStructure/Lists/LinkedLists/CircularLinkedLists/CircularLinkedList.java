package DataStructure.Lists.LinkedLists.CircularLinkedLists;

public class CircularLinkedList {

    private DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode tail;
    private int length;

    public CircularLinkedList() {
        tail = null;
        length = 0;
    }

    //Get length of Circular Linked List
    public int getLength() {
        return length;
    }

    //Get Tail of Circular Linked list
    public DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode getTail() {
        return tail;
    }

    //Add element to head of list
    public void addNodeToHead(DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode node) {
        if (tail == null) {
            //means list is empty
            node.setNext(node);
            tail = node;
        } else {
            DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode temp = tail.getNext();
            tail.setNext(node);
            node.setNext(temp);
        }
        length++;
    }

    //Add element to tail of list
    public void addElementToTail(DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode node) {
        addNodeToHead(node);
        tail = tail.getNext();
    }

    //Return data at head of list
    public int peek() {
        return tail.getNext().getData();
    }

    //Return data at tail of list
    public int tailPeek() {
        return tail.getData();
    }

    //Return and remove data from head of list
    public int removeFromHead() {
        DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode temp = tail.getNext();
        if (temp == null) {
            tail = null;
            return Integer.MIN_VALUE;
        } else if (temp == tail) {
            tail = null;
        } else {
            tail.setNext(temp.getNext());
            temp.setNext(null);
        }
        length--;
        return temp.getData();
    }

    //Returns and remove data from tail of list
    public int removeTail() {
        DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode temp = tail;
        if (temp == null) {
            tail = null;
            return Integer.MIN_VALUE;
        } else if (temp == tail) {
            tail = null;
        } else {
            DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode secondLast = tail;
            while (secondLast.getNext() != tail) {
                secondLast = secondLast.getNext();
            }
            secondLast.setNext(tail.getNext());
            tail = secondLast;
            temp.setNext(null);
        }
        length--;
        return temp.getData();
    }

    //Returns true if list contains data
    public boolean contains(int data) {
        if (tail == null) {
            return false;
        }
        DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode temp = tail;
        while (temp != tail) {
            if (temp.getData() == data) {
                return true;
            }
        }
        return false;
    }

    //Removes and return the matched data from the CircularLinkedList
    //This one is not completed yet
    public int removeSpecifiedData(int data) {
        DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode temp = tail;
        DataStructure.Lists.LinkedLists.CircularLinkedLists.CLLNode next = tail.getNext();
        if (tail == null) {
            return Integer.MIN_VALUE;
        }
        if (tail.getNext() == tail) {
            if (tail.getData() == data) {
                tail.setNext(null);
                return tail.getData();
            }
        }
        while (temp != tail && temp.getData() != data) {
            temp = temp.getNext();
        }
        if (temp == tail && temp.getData() != data) {
            return Integer.MIN_VALUE;
        } else {

        }

        return -1;
    }
}
