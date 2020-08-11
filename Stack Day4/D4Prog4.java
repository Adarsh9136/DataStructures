import java.util.*;
public class D4Prog4 {
    static void deleteMid(Stack<Character>stck,int n, int current)
    {
       if(stck.empty() || current ==n)
       {
           return;
       }
       char x = stck.pop();
       deleteMid(stck, n, current+1);
       if(current!=n/2)
       {
           stck.push(x);
       }}
       public static void main(String args[])
       {
           Scanner sc= new Scanner(System.in);
           String s = sc.nextLine();
           Stack<Character> stck = new Stack<>();
           for(int i=0;i<s.length();i++)
           {
               stck.push(s.charAt(i));
   
           }
           deleteMid(stck,stck.size(),0);
           while(!stck.isEmpty())
           {
               char p=stck.pop();
               System.out.print(p+" ");

           }
           sc.close();
    }
    
}