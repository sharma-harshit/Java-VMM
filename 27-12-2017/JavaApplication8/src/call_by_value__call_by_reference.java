import java.io.*;
public class call_by_value__call_by_reference
{
    
        int num1 =10 , num2= 20;
    
    //Call by Value
    static void swap(int num1,int num2)
    {        
        System.out.println("Before Swapping from swap function: "+num1+"\t num2 : "+num2);
        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping from swap function : "+num1+"\t num2 : "+num2);
    }
    static void swap(call_by_value__call_by_reference obj)
    {        
        System.out.println("Before Swapping from swap function: "+obj.num1+"\t num2 : "+obj.num2);
        obj.num1+=obj.num2;
        obj.num2=obj.num1-obj.num2;
        obj.num1=obj.num1-obj.num2;
        System.out.println("After Swapping from swap function : "+obj.num1+"\t num2 : "+obj.num2);
        
    }
    
    
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        call_by_value__call_by_reference obj=new call_by_value__call_by_reference();
        //call by value
        swap(obj);
//        System.out.println("Swapping with call by Value \nnum1 : "+num1+"\t num2 : "+num2);
    }
}
