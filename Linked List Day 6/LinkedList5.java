import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList { 
 
    static Node head; 
 
    static class Node { 
 
        int data; 
        Node next; 
 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
 
    
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
 
    
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
 
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        LinkedList.head = new Node(7);
        LinkedList.head.next = new Node(19);
        LinkedList.head.next.next = new Node(17);
        LinkedList.head.next.next.next = new Node(20);
 
        
        head = list.reverse(head); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
} 