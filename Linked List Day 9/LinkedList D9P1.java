import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList2
{
    static Node head;
    static int max = Integer.MIN_VALUE;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
        }
    }
 
    static LinkedList2 insert(LinkedList2 list, int data){
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
 
    static Node rightgreat(Node top){
        if(top == null)
            return top;
 
        top.next = rightgreat(top.next);
        if(top.data < max){
            return top.next;
        }
        max = (top.data > max) ? top.data : max;
 
        return top;
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList2 list = new LinkedList2();
 
		System.out.println("Enter number of elements ");
		int n = sc.nextInt();
 
		System.out.println("Enter elements  ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list = insert(list, num);
        }
 
        
 
        head = rightgreat(head);
 
        System.out.println("Final linked list: ");
        printList(head);
 
	}
}
 