
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class using_FileInputStream
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //intializing
        FileInputStream fis = new FileInputStream("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\textin.txt");
                //other overloaded constructors consist of File object being passed
        while(fis.available()!=0)
        {
            byte b = (byte) fis.read();
            System.out.print((char)b);
        }
    }
}
