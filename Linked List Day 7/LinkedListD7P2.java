import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList2
{
    static Node head;
 
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
 
        if(LinkedList2.head == null)
            LinkedList2.head = new_node;
 
        else{
            Node last = LinkedList2.head;
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
 
    static void rearrange(){
        Node prev = null, curr = head, end = head;
 
        while(end.next != null)
            end = end.next;
 
        Node new_end = end;
 
        while(curr.data % 2 != 0 && curr != end){
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
 
        if(curr.data % 2 == 0){
            head = curr;
 
            while(curr != end){
                if(curr.data % 2 == 0){
                    prev = curr;
                    curr = curr.next;
                }
 
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        else
            prev = curr;
 
        if(new_end != end && end.data % 2 != 0){
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList2 list = new LinkedList2();
 
		System.out.println("Enter number of elements ");
		int n = sc.nextInt();
 
		System.out.println("Enter elements ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list = insert(list, num);
        }
        rearrange();
        System.out.println("Rearranged linked list");
        printList(head);
 
	}
}