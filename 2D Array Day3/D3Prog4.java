
import java.util.*;
public class D3Prog4 {
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
        int k,l;
        l=0;
        k=0;
        int row =n;
        int column =n;
        while(k<row && l<column)
        {
            for(int i=l;i<column;i++)
            {
                System.out.print(a[k][i]+ " ");
            }
            k++;
            for(int i=k;i<row;i++)
            {
                System.out.print(a[i][column-1]+" ");
            }
            column--;
            if(k<row)
            {
                for(int i=column-1;i>=l;i--)
                {
                    System.out.print(a[row-1][i]+" ");
                }
                row--;
            }
            if(l<column)
            {
                for(int i=row-1;i>=k;i--)
                {
                     System.out.print(a[i][l]+" ");
                }
                l++;
            }

        }
    }
}