import java.io.*;
public class string_processor
{
    public static double calculate(String s)
    {
        double answer = 0,flag=0;
        double num1=0,num2=0;
        char operator='a';
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                if(flag==0)
                {
                    num1 = (num1*10)+ (double)s.charAt(i);
                }
                else
                {
                    num2 = (num2*10)+ (double)s.charAt(i);
                }
            }
            else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
            {
                operator=s.charAt(i);
                flag=1;                
            }
        }
        num1 -= 528 ;
        num2 -= 528 ;
        System.out.println("Num1 : " + num1 + "\tNum2 : " + num2);
        switch(operator)
        {
            case '+' :
            {
                answer = num1 + num2;
                break;
            }
            case '-' :
            {
                answer = num1 - num2;                
                break;
            }
            case '*' :
            {
                answer = num1 * num2;
                break;
            }
            case '/' :
            {
                answer = num1 / num2;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any String : ");
        String input = br.readLine();
        System.out.println("Output is : \t" + calculate(input));
    }
}
