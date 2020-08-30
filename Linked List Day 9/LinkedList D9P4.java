import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList1
{
    static Node head1, head2, res;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
            next = null;
        }
    }
 
    static void insert(int list, int data){
        Node new_node = new Node(data);
        new_node.next = null;
 
        if(list == 1){
        	if(head1 == null)
        		head1 = new_node;
 
        	else{
        		Node last = head1;
        		while(last.next != null)
        			last = last.next;
 
            	last.next = new_node; 
        	}
        }
 
        else if(list == 2){
            if(head2 == null)
        		head2 = new_node;
 
        	else{
        		Node last = head2;
        		while(last.next != null)
        			last = last.next;
 
            	last.next = new_node; 
        	}
        }
        else{
            if(res == null)
        		res = new_node;
 
        	else{
        		Node last = res;
        		while(last.next != null)
        			last = last.next;
 
            	last.next = new_node; 
        	}
        }
    }
 
    static void printList(Node top){
        Node temp = top;
 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 
    static void intersect(){
        Node curr1 = head1, curr2 = head2;
 
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data)
                curr1 = curr1.next;
            else if(curr1.data > curr2.data)
                curr2 = curr2.next;
            else{
                insert(3, curr2.data);
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList1 list = new LinkedList1();
 
		System.out.println("Enter number of elements  ");
		int n1 = sc.nextInt();
 
		System.out.println("Enter elements  ");
        for(int i=0;i<n1;i++){
            int num = sc.nextInt();
            insert(1, num);
        }
 
        System.out.println("Enter number of elements  ");
		int n2 = sc.nextInt();
 
        System.out.println("Enter elements  ");
        for(int i=0;i<n2;i++){
            int num = sc.nextInt();
            insert(2, num);
        }
        intersect();
        System.out.println("Intersection linked list: ");
        printList(res);
	}
}