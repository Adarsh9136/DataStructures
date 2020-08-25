import java.util.*;
public class D5Prog5 {
    Stack<Integer> stck;
    int min;
    D5Prog5()
    {
        stck = new Stack<Integer>();}
        void getMin()
        {
            if(stck.isEmpty())
            {
                System.out.println("Stack is Empty");
            }
            else{
                System.out.println("Minimum element in the stack is "+ min);            }
        }
        void peek()
        {
            if(stck.isEmpty())
            {
                System.out.println("Stack is Empty");
                return;

            }
            int t = stck.peek();
            System.out.print("Top most element is: ");
            if(t<min)
            System.out.print(min);
            else
            System.out.print(t);}
            void pop()
            {
                if(stck.isEmpty())
                {
                    System.out.println("Stack is Empty");
                    return;
                }
                System.out.print("Top most element Removed: ");
                int t= stck.pop();
                if(t<min)
                {
                    System.out.print(min);
                    min = 2*min -t;
                }
                else
                {
                    System.out.print(t);
                }
            
            }
            void push(int x)
            {
                if(stck.isEmpty())
                {
                    min = x;
                    stck.push(x);
                    System.out.println("Number Inserted: "+ x);
                    return;
                }
                if(x<min)
                {
                    stck.push(2*x - min);
                    min =x;
                }
                else
                {
                    stck.push(x);
                }
                System.out.println("Number Inserted : "+x);

            }
           
       public static void main(String[] args) {
                
    D5Prog5 stck = new D5Prog5();
    stck.push(7);
    stck.push(8);
    stck.getMin();
    stck.push(6);
    stck.push(5);
    stck.getMin();
    stck.pop();
    stck.getMin();
    stck.pop();
    stck.peek();
            }}
           



        
    
