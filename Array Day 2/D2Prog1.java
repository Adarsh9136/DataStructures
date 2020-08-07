

// To print first, second and third largest 
import java.util.*;
public class D2Prog1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i= 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int first,second,third ;
        first =0;
        second =0;
        third =0;

        for (int i=0;i<n;i++)
        {
            if(a[i] > first)
            {
                third = second;
                second = first;
                first = a[i];

            }
            else if(a[i]>second)
            {
                third =second;
                second = a[i];
            }
            else if(a[i]>third)
            {
                third =a[i];
            }
        }
        System.out.println("First largest is: "+ first+" Second largest is: "+second+" Third largest is: "+third);
   
}
}