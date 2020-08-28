import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList3 { 
    Node head; 
 
    
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    void printMiddle(){
        Node ptr1 = head;
        Node ptr2 = head;
        if(head!=null)
        {
        while(ptr2!=null && ptr2.next!=null)
        {
            ptr2 = ptr2.next.next;
            ptr1 = ptr1.next;
        }
        System.out.println("Middle "+ ptr1.data);}
    }

    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
 
        public static void main(String[] args) 
    { 
        LinkedList3 llist = new LinkedList3(); 
        llist.push(2); 
        llist.push(7); 
        llist.push(19); 
        llist.push(17); 
        llist.push(25);
        llist.push(37);  
 
        llist.printMiddle(); 
        
 
    } 
}
