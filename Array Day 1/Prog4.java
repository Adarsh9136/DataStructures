

// Placing all the zeros at last of the array
import java.util.*;
public class Prog4 {

    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        int[] a = new int[n];
        
      for ( int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
          int c=0;
        for (int i=0; i<n;i++)
        {
            if(a[i]!=0)
            {
                a[c++] = a[i];
            }
        }
        for (int i =c;i<n;i++)
        {
            a[c++] = 0;
        }
        for (int i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
        

    
}}