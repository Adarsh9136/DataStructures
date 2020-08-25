import java.util.*; 
public class D5Prog1
{
   static int evaluatePostfix(String s)
{
    Stack<Integer> stck = new Stack<>();
    for (int i=0;i<s.length();i++)
    {
        char c= s.charAt(i);
        if(Character.isDigit(c))
        {
            stck.push(c-'0');
        }
        else{
            int val1 = stck.pop();
            int val2 = stck.pop();
            switch(c)
            {
                case '+':
                stck.push(val2+val1);
                break;
                case '-':
                stck.push(val2-val1);
                break;
                case '/':
                stck.push(val2/val1);
                break;
                case '*':
                stck.push(val2*val1);
                break;
                        }
        }
    }
    return stck.pop();
}
public static void main(String args[])
{
    Scanner sc = new Scanner (System.in);
   String s= sc.nextLine();
    System.out.println("Postfix Result : "+ evaluatePostfix(s));
}
}