// Products of the elements of before and previous elements
import java.util.*;
public class D2Prog4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i= 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int previous =a[0];
        a[0] = a[0] * a[1];

        
        
        for ( int i=1;i<n-1;i++)
        {
           int c = a[i];
           a[i] = previous*a[i+1];
           previous = c;
        }
        a[n-1] = previous * a[n-1];
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}