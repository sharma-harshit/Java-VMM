
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class input_and_output_app
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\app_in.txt");
        String s="";
        while(fis.available()!=0)
        {
            s+= (char) fis.read();
        }
         //outputting alogwith spaces
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\app_out.txt");
        for (int i = 0; i < s.length(); i++) 
        {
            fos.write((byte) s.charAt(i));
            fos.write((byte) ' ');
        }
        
    }
}
