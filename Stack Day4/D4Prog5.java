import java.util.*;
public class D4Prog5 {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String s= sc.nextLine();
    Stack<Character> stck = new Stack<Character>();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=' ')
        {
          stck.push(s.charAt(i));
        }
        else{
            while(stck.empty()==false)
            {
                System.out.print(stck.pop());
            }
            System.out.println(" ");
        }
        }
        while(stck.empty()==false)
        {
            System.out.print(stck.pop());
        }
        sc.close();
    }

    
}