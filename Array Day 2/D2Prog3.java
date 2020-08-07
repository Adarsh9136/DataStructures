// Even position elelmnts are greater than the odd position
import java.util.*;
public class D2Prog3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i= 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int t=0;
        for (int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                if(a[i]>a[i-1])
                {
                t=a[i-1];
                a[i-1] = a[i];
                a[i] = t;
                }}
                else{
                    if(a[i] < a[i-1])
                    {
                        t = a[i-1];
                        a[i-1] = a[i];
                        a[i] = t;
                    }
                }

            
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}