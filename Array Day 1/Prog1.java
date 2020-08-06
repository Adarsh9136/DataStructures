
// Searching the number in the array and printing the index of thr number 
import java.util.*;
public class Prog1 {
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
      int t = sc.nextInt();
      int index = -1;
      for (int i=0;i<n;i++)
      {
          if(a[i]==t)
          {
               index =i;
              break;
          }
      }
      if(index<0)
      {
          System.out.println("Searched Number is not predent in the array");
      }
      else{
          System.out.println("Number is present at the index: "+index);
      }
      sc.close();;
    }
    
}