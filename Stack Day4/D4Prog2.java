import java.util.*;


public class D4Prog2 {
    static int Prec(char c)
   {switch(c)
    {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;    
    
     }
     return -1;

   }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String result =new String("");
        Stack<Character> stck = new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result=result+c;
            }
            else if( c == '(')
            {
             stck.push(c);
            }
            else if(c==')')
            {
                 while(!stck.isEmpty() && stck.peek()!='(')
                 {
                     result = result+stck.pop();
                 }
                 if(!stck.isEmpty() && stck.peek() !='(')
                 {
                     result =  "Invalid Expressions";
                     break;
                 }
                 else {
                     stck.pop();
                 }
            }
            else{
                while(!stck.isEmpty() && Prec(c)<=Prec(stck.peek()))
                {
                    if(stck.peek() == '(')
                    {
                        result = "Invalid Expressions";
                        break;
                    }
                    result = result + stck.pop();
                }
                stck.push(c);

            }

        }
        while(!stck.isEmpty())
        {
            if(stck.peek() == '(')
            {
                result = "Invalid Expressions";
                break;
            }
            result = result+stck.pop();


        }
        System.out.print(result);
        sc.close();
    }
    
    
}