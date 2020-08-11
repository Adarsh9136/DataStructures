import java.util.*;
public class D4Prog1
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String s= sc.nextLine();
      Deque<Character> stck = new ArrayDeque<Character>();
      char z,a;
      for(int i=0;i<s.length();i++)
      {
        z=s.charAt(i);
        if(z=='('|| z=='['|| z=='{')
      {
         stck.push(z);
         continue;
      }
      if(stck.isEmpty())
      {
        System.out.println("Not Balanced");
        System.exit(0);
      }
      switch(z)
      {
        case ')':
        a=stck.pop();
        if(a=='{'||a=='[')
        {
          System.out.println("Not Balanced");
        System.exit(0);
        }
        break;
        case '}':
        a=stck.pop();
        if(a=='('||a=='[')
        {
          System.out.println("Not Balanced");
        System.exit(0);
        }
        break;
        case ']':
        a=stck.pop();
        if(a=='{'||a=='(')
        {
          System.out.println("Not Balanced");
        System.exit(0);
        }
        break;}

        
      
      }
      if(stck.isEmpty())
      {
        System.out.println("Balanced");
      }
      else{
        System.out.println("Not Balanced");
      }
      
      
    }

    }
