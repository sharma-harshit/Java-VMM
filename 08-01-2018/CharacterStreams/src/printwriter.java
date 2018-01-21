import java.io.*;
public class printwriter
{
    public static void main(String[] args) throws IOException
    {
        //pw can't work alone so can be implmented using fos or fw
        
            //implmenting using fw  - Character by Character
        FileWriter fw = new FileWriter("./file2.txt");
        PrintWriter pw1 = new PrintWriter(fw);
        
        pw1.write("Hello print writer\n");
        pw1.write("FileWriter is being used to implement PrintWriter");
        pw1.flush();
        
        pw1.close();
        fw.close();
        
            //implmenting using fos - Byte by Byte
        FileOutputStream fos = new FileOutputStream("./file3.txt");
        PrintWriter pw2 = new PrintWriter(fos);
        
        pw2.write("Hello print writer\n");
        pw2.write("FileInputStream is being used to implement PrintWriter");
        pw2.flush();
        
        pw2.close();
        fos.close();
        
    }
}
