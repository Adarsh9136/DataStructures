import java.util.*;
public class D3Prog5 {
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
        int k=0,l=0;
        int row =n;
        int column =n;
        int t=0,c=0;
        while(k<row && l<column)
        {
            if(k+1 == row || l+1 ==column)
            {
                break;
            }
            t=a[k+1][l];
            for(int i=l;i<column;i++)
            {
                c=a[k][i];
                a[k][i]=t;
                t=c;}
                k++;

                for(int i=k;i<row;i++)
                {
                    c=a[i][column-1];
                    a[i][column-1]=t;
                    t=c;
                }
                column--;
                if(k<row)
                {
                    for(int i=column-1;i>=l;i--)
                    {
                        c=a[row-1][i];
                        a[row-1][i]=t;
                        t=c;

                    }}
                    row--;
                
                if(l<column)
                {
                    for(int i=row-1;i>=k;i--)
                    {
                        c=a[i][l];
                        a[i][l]=t;
                        c=t;
                    }
                }
                         l++;

            }
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+ " ");

            }
            System.out.println();
        }
        
    }
}