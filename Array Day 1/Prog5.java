
// Placing positive numbers at even and negative numbers at odd position
import java.util.*;

public class Prog5 {
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
      int positive =0, negative =1;
       int t=0;
        while(true)
        {
            while(positive<n && a[positive]>=0)
            {
              positive +=2;
            }
            while(negative<n && a[negative]<=0)
            {
                negative +=2;
            }
            if(positive <n && negative<n)
            {
              t = a[positive];
              a[positive] = a[negative];
              a[negative] = t;
            }
            else 
            {
                break;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
}}