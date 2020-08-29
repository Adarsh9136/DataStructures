import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList
{
    static Node head1, head2, result;
 
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
 
        if(list == 1){
            new_node.next = head1; 
            head1 = new_node;
        }
 
        else if(list == 2){
            new_node.next = head2; 
            head2 = new_node;
        }
    }
 
    static Node sumList(Node top1, Node top2){
        Node res = null, prev = null, curr = null;
        int carry = 0, sum;
 
        while(top1 != null || top2 != null){
            sum = carry + (top1 == null ? 0 : top1.data) + (top2 == null ? 0 : top2.data);
 
            carry = (sum >= 10) ? (sum/10) : 0;
 
            sum = sum%10;
 
            curr = new Node(sum);
 
            if(res == null)
                res = curr;
 
            else
                prev.next = curr;
 
            prev = curr;
 
            if(top1 != null)
                top1 = top1.next;
 
            if(top2 != null)
                top2 = top2.next;
        }
 
        if(carry != 0)
            curr.next = new Node(carry);
 
        return res;
    }
 
    static void printList(Node top){
        Node temp = top;
 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 
	public static void main (String[] args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
 
		LinkedList list1 = new LinkedList();
 
		System.out.println("Enter 2 Numbers");
		String a = sc.next();
		String b = sc.next();
        for(int i=0; i<a.length(); i++){
            int num = a.charAt(i) - '0';
            insert(1, num);
        }
 
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("\nSum: " + sum);
 
        System.out.println("1st Linked List: ");
        printList(head1);
 
        for(int i=0; i<b.length(); i++){
            int num = b.charAt(i) - '0';
            insert(2, num);
        }
        System.out.println("2nd Linked List ");
        printList(head2);
        result = sumList(head1, head2);
        System.out.println("Sum of Elements of Linked List ");
        printList(result);
	}
}
 