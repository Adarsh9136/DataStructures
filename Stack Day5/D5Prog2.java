import java.util.*;
public class D5Prog2 {
    private static int[] arr;
    private static int n;

    static void printNGE( int a[], int len)
    {
          int i=0;
         
         Stack<Integer> s = new Stack<>();
       
         int c, next;
         s.push(a[0]);
         for (i=1;i<len;i++)
         {
             next =a[i];
             if(s.isEmpty() == false)
             {
                 c = s.pop();
             
             while(c < next)
             {
               System.out.println(c+"-->"+next);
               if(s.isEmpty() == true)
               {
                   break;
               }
               c = s.pop();
                         }
                         if(c>next)
                         {
                             s.push(c);
                         }
         }
         s.push(next);
        }
        while(s.isEmpty() == false)
        {
            c = s.pop();
            next =-1;
            System.out.println(c+"-->"+next);
        }
    }

    public static void main(final String args[]) {
        Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
        arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        printNGE(arr,n);
        sc.close();
    }
    
}