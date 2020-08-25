import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class D5Prog3
{private static String s;
    static boolean Redundancy(String s)
    {
        Stack<Character> stck = new Stack<>();
        char[] c = s.toCharArray();
        for (char ch: c)
        {
            if(ch == ')')
           {char top = stck.peek();
           stck.pop();
           boolean f =true;
           while(top!='{')
           {
               if(top == '+' || top == '-' || top =='*' || top =='/')
               {
                   f = false;
               }
               top = stck.peek();
               stck.pop();
           }
           if(f == true){
           return true;}
        }
          else{
              stck.push(ch);
       }


    }
    return false;
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
     s = sc.nextLine();
    if(Redundancy(s))
    System.out.println("Yes");
    else
    System.out.println("No");
    sc.close();
}
}