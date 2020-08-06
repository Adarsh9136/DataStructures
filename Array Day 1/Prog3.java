// Rotate the array by one
import java.util.*;
public class Prog3 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        int[] a = new int[n];
        int i;
      for ( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=a[0];
        for ( i=0;i<(n-1);i++)
        {
            a[i]=a[i+1];
        }

        a[i]=t;
        for ( i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}