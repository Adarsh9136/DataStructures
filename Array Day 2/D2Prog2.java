
// Number having atleast 2 numbers greater
import java.util.*;
public class D2Prog2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i= 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int first,second;
        first =0;
        second =0;
        for( int i=0;i<n;i++)
        {
            if(a[i] > first)
            {
                second =first;
                first = a[i];
            }

            else if(a[i]>second)
            {
                second =a[i];
            }
        }
        System.out.print("Number having atleast 2 numbers greater are: ");
        for (int i=0;i<n;i++)
        {
            if(a[i]<second)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}