package Practise.DataStructure.Lists.LinkedLists.DoublyLinkedLists;

public class DoublyLinkedList {

    private DLLNode head;
    private DLLNode tail;
    private int length;

    public DoublyLinkedList() {
        length = 0;
    }

    //Return Current Length of Doubly Linked List
    public int getLength() {
        return length;
    }

    //Return head
    public DLLNode getHead() {
        return head;
    }

    //Return Tail
    public DLLNode getTail() {
        return tail;
    }

    //Get the value at the given position
    public int getValueAtRequiredPosition(int position) {
        DLLNode dllNode = null;
        if (position < 1 || position >= length) {
            return -1;
        } else {
            int i = 0;
            while (i < position) {
                dllNode = dllNode.getNext();
                i++;
            }
        }
        return dllNode.getData();
    }

    //Return first position of Node value that is equal to required value
    public int getPositionOfRequiredData(int data) {
        DLLNode temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                return position;
            } else {
                temp = temp.getNext();
                position++;
            }
        }
        return position;
    }


    //Insert a node at the beginning of the list
    public void insertNodeAtBeginning(DLLNode node) {
        node.setNext(head);
        head.setPrev(node);
        head = node;
        length++;
    }

    //Insert a node at the end of the list
    public void insertNodeAtEndOfList(DLLNode node) {
        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        length++;
    }

    //Insert node at a given position in the list
    public void insertNodeAtGivenPositionInList(DLLNode node, int position) {
        position--;
        //Fix the position
        if (position < 0) {
            position = 0;
        } else if (position > length) {
            position = length;
        }

        //Check if List is empty. If yes, then make the node as the head element
        if (head == null) {
            head = tail = node;
        } else {
            if (position == 0) {
                node.setNext(head);
                head.setPrev(node);
                head = node;
            } else {
                int i = 1;
                DLLNode temp = head;
                while (i < position) {
                    temp = temp.getNext();
                    i++;
                }
                node.setPrev(temp);
                node.setNext(temp.getNext());
                if (temp.getNext() != null) {
                    temp.getNext().setPrev(node);
                }
                temp.setNext(node);
            }
        }
        length++;
    }

    //Remove value at given position
    public void removeNodeAtGivenPosition(int position) {
        position--;
        if (position < 0 || position >= length) {
            return;
        } else {
            if (head == null) {
                return;
            } else {
                DLLNode temp = head;
                if (position == 0) {
                    head = head.getNext();
                    if (head == null) {
                        tail = null;
                    }
                    temp.setNext(null);
                } else {
                    for (int i = 1; i < position; i++) {
                        temp = temp.getNext();
                    }
                    if (temp.getNext() == null) {
                        temp.getPrev().setNext(null);
                        temp.setPrev(null);

                    } else {
                        temp.getPrev().setNext(temp.getNext());
                        temp.getNext().setPrev(temp.getPrev());
                        temp.setPrev(null);
                        temp.setNext(null);
                    }
                }
            }
        }
        length--;
    }
}
