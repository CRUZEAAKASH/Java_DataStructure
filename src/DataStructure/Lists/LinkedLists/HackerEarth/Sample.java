package DataStructure.Lists.LinkedLists.HackerEarth;

import DataStructure.Lists.LinkedLists.SingleLinkedLists.ListNode;

import java.util.Scanner;

public class Sample {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
//TAKEN TWO PRIMARY CASES

//EX1 => where head is always fixed with ODD num
//1, 2, 4, 6, 5, 8, 10, 12, 14
//FINAL RESULT: 1, 6, 4, 2, 5, 14, 12, 10, 8
//NOTE that head is unchanged if it is ODD

//EX2 => where head can change when is starts with EVEN num
//2, 18, 24, 3, 5, 7, 9, 6, 12, 14, 17
//FINAL RESULT: 24, 18, 2, 3, 5, 7, 9, 14, 12, 17
//NOTE that head is can change if it is EVEN

//LinkedList

        ListNode list = null;
        ListNode head = null, href = null, tail = null;
        int prev = -1;
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            if (list == null) {
                list = new ListNode(num);
                head = list;
                href = head;
                tail = list;
                prev = num;
            } else {
                ListNode newNode = new ListNode(num);
//keeping track of prev num
//to change head reference href, tail and head
                if (num % 2 == 0 && prev % 2 == 0) {
//when head is ODD
                    if (href.getData() % 2 != 0) {
                        newNode.setNext(href.getNext());
                        href.setNext(newNode);
                    } else { //when head is EVEN
                        //newNode.next = href;
                        href = newNode;
                        head = href;
                    }
                } else {
                    //SIMPLE ADDITION at tail node
                    tail.setNext(newNode);
                    href = tail;
                    tail = tail.getNext();
                }
                prev = num;
            }
        }


//JUST PRINTING LOGIC

  //      Node curr = head;
//
  //      while (curr != null) {

    //        System.out.print(curr.data + " ");

      //      curr = curr.next;

        }


    }

