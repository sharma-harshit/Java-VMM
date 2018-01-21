import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class using_FileOutputStream
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String s = "Hey there!!!\nThis is text being written to a file from a java program";
        //intializing
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\textout.txt");
                //other overloaded constructors consist of File object being passed
        for (int i = 0; i < s.length(); i++) 
        {
            byte b = (byte) s.charAt(i);
            fos.write(b);
        }
        System.out.println("Done");
    }
}