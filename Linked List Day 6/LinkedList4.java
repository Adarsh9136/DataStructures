import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList4 { 
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int countNodes(Node n) {
        int r = 1;
        Node temp = n;
        while (temp.next != n) {
            r++;
            temp = temp.next;
        }
        return r;
    }

    int countNodesinLoop(Node list) {
        Node ptr1 = list;
        Node ptr2 = list;

        while (ptr1 != null && ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2)
                return countNodes(ptr1);
        }
        return 0;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedList4 llist = new LinkedList4();
        llist.push(2);
        llist.push(7);
        llist.push(19);
        llist.push(17);
        llist.push(25);
        llist.push(37);
        LinkedList4.head.next.next.next.next = LinkedList4.head;
        System.out.println(llist.countNodesinLoop(head));
       
        
 
    } 
}
