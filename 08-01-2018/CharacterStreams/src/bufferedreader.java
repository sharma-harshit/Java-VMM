import java.io.*;
public class bufferedreader
{
    public static void main(String[] args) throws IOException
    {
        //br can be implmented using fr and fis both
        
            //implmenting br using fr - Character by Character
        FileReader fr = new FileReader("./file2.txt");
        BufferedReader br1 = new BufferedReader(fr);
        
        String s=" ";
        while(s!=null)
        {
            s = br1.readLine();
            if(s!=null)
            System.out.println(s);
        }
        br1.close();
        fr.close();
        
        
            //implementing using fis - byte by byte
        FileInputStream fis = new FileInputStream("./file3.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br2 = new BufferedReader(isr);
        
        s=" ";
        while(s!=null)
        {
            s = br2.readLine();
            if(s!=null)
            System.out.println(s);
        }
        br2.close();
        isr.close();
        fis.close();
        
    }
}
