import java.util.*;
public class D3Prog2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
}