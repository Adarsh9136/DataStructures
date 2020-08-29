import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList
{
    static Node head;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
        }
    }
 
    static LinkedList insertNode(LinkedList list, int data){
        Node new_node = new Node(data);
        new_node.next = null;
 
        if(list.head == null)
            list.head = new_node;
 
        else{
            Node last = list.head;
            while(last.next != null)
                last = last.next;
 
            last.next = new_node;
        }
        return list;
    }
 
    static void printList(Node top){
        Node temp = top;
 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 
    static void removeDups(){
        Node curr = head;
 
        while(curr != null){
            Node temp = curr;
 
            while(temp != null && temp.data == curr.data)
                temp = temp.next;
 
            curr.next = temp;
            curr = curr.next;
        }
    }
	public static void main (String[] args) throws IOException
	{
	Scanner sc = new Scanner(System.in);
 
		LinkedList list = new LinkedList();
 
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list = insertNode(list, num);}
        removeDups();
        System.out.println("Final Linked List");
        printList(head);
 
	}
}