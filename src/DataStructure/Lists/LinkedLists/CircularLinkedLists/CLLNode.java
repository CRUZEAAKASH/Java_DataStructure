package Practise.DataStructure.Lists.LinkedLists.CircularLinkedLists;

public class CLLNode {

    private int data;
    private CLLNode next;

    public CLLNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    public CLLNode getNext() {
        return next;
    }
}
