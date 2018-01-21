import java.io.*;
public class File_Writer__File_Reader__basics
{
    public static void main(String[] args) throws IOException
    {
        //Writing Character by Character
        FileWriter fw =new FileWriter("./file1.txt");
        String s ="\u095B\u093E\u0935\u093E";
        for (int i = 0; i < s.length(); i++) 
        {
            fw.write(s.charAt(i));
        }
        fw.close();
        
        FileReader fr = new FileReader("./file1.txt");
        {
            while(true)
            {
                int r = fr.read();
                if(r==-1) break;
                System.out.print((char)r);
            }
            System.out.println("");
        }
    }
}
