import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
    static Node head1, head2;
 
    static class Node{
        int data;
        Node next;
 
        public Node(int d){
            data = d;
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
 
    static void printList(Node top){
        Node temp = top;
 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 
    static int multiply(Node top1, Node top2){
        int num1 = 0, num2 = 0;
 
        while(top1 != null || top2 != null){
            if(top1 != null){
                num1 = num1*10 + top1.data;
                top1 = top1.next;
            }
 
            if(top2 != null){
                num2 = num2*10 + top2.data;
                top2 = top2.next;
            }
        }
 
        return num1*num2;
    }
 
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
 
		LinkedList list = new LinkedList();
 
        System.out.println("Enter size of 1st List");
		int n1 = sc.nextInt();
 
		System.out.println("Enter elements  ");
        for(int i=0;i<n1;i++){
            int num = sc.nextInt();
            insert(1, num);
        }
        System.out.println("Enter size of 2nd List");
		int n2 = sc.nextInt();
 
        System.out.println("Enter elements of  ");
        for(int i=0;i<n2;i++){
            int num = sc.nextInt();
            insert(2, num);
        }
        int product = multiply(head1, head2);
        System.out.println("Multiplication of linked lists: ");
        System.out.print(product);
 
	}
}