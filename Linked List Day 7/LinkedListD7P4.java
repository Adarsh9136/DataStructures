import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList1
{
    static Node head;
    static Node sorted;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
        }
    }
 
    static LinkedList1 insertNode(LinkedList1 list, int data){
        Node new_node = new Node(data);
        new_node.next = null;
 
        if(LinkedList1.head == null)
            LinkedList1.head = new_node;
 
        else{
            Node last = LinkedList1.head;
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
 
    static void insertList(Node top){
        sorted = null;
        Node curr = top;
 
        while(curr != null){
            Node next = curr.next;
            sortList(curr);
            curr = next;
        }
        head = sorted;
    }
 
    static void sortList(Node new_node){
        if(sorted == null || sorted.data >= new_node.data){
            new_node.next = sorted;
            sorted = new_node;
        }
        else{
            Node curr = sorted;
 
            while(curr.next != null && curr.next.data < new_node.data)
                curr = curr.next;
 
            new_node.next = curr.next;
            curr.next = new_node;
        }
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList1 list = new LinkedList1();
 
		System.out.println("Enter number of elements: ");
        int size = sc.nextInt();
        
        for(int i=0;i<size;i++){
		
            int num = sc.nextInt();
            list = insertNode(list, num);
        }
        insertList(head);
        System.out.println("Sorted linked list: ");
        printList(head);
 
	}
}