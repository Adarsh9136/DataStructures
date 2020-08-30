import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList3
{
    static Node head;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
        }
    }
 
    static LinkedList3 insert(LinkedList3 list, int data){
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
 
    static void swap(){
        Node prev, curr, after;
 
        prev = head;
        curr = head.next.next;
        head = head.next;
        head.next = prev;
 
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            after = curr.next.next;
            curr.next.next = curr;
            curr = after;
        }
        prev.next = curr;
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList3 list = new LinkedList3();
 
		System.out.println("Enter number of elements ");
		int n = sc.nextInt();
 
		System.out.println("Enter elements ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list = insert(list, num);
        }
        swap();
        System.out.println("Swapped linked list: ");
        printList(head);
	}
}