// Reverse the array without using any other array
import java.util.*;
public class Prog2 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        int[] a = new int[n];
      for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=0;
        int end =n-1;
        for (int i=0; i<end;i++)
        {
            t = a[i];
            a[i]=a[end];
            a[end]=t;
            end --;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}