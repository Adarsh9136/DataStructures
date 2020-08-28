import java.util.*;
import java.lang.*;
import java.io.*;
 

class LinkedList2 { 
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
    public int GetNth(int index)
    {
       Node c = head;
       int count =0;
       while(c!=null)
       {
           if(count == index)
           {
               return c.data;
           }
           count ++;
           c = c.next;
       }
       return 0;
    }
    void NthFromLast(int index)
    {
        int len =0;
        Node temp =head;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        if(len<index)
        {
            return;
        }
        temp = head;
        for (int i=1;i<len-index+1;i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
 
        public static void main(String[] args) 
    { 
        LinkedList2 llist = new LinkedList2(); 
        llist.push(2); 
        llist.push(7); 
        llist.push(19); 
        llist.push(17); 
        llist.push(25);
        llist.push(37);  
 
        System.out.println(llist.GetNth(4)); 
        llist.NthFromLast(5);
        
 
    } 
}
