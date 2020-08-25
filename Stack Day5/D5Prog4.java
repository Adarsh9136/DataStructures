import java.util.*;
public class D5Prog4 {
    static int getMaxArea(int a[], int n)
    {
        Stack<Integer> stck = new Stack<>();
        int m_area = 0;
        int t;
        int area_with_top;
        int i=0;
        while(i<n)
        {
            
            if(stck.empty() || a[stck.peek()]<=a[i])
            {
                stck.push(i++);
            }
            else{
                t = stck.peek();
                stck.pop();
                area_with_top = a[t]*(stck.empty()? i:i-stck.peek()-1);
                if(m_area<area_with_top){
                    m_area = area_with_top;
                }
            }
        }
        while(stck.empty()==false)
        {
            t = stck.peek();
            stck.pop();
            area_with_top = a[t]*(stck.empty()? i:i-stck.peek()-1);
            if(m_area<area_with_top){
                m_area = area_with_top;
            }
        }
        return m_area;}
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Maximum Area is :"+getMaxArea(a, n));
            sc.close();
        }
    }

           
   