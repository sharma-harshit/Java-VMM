import java.io.*;
public class DataInputStream_DataOutputStream
{
    public static void main(String[] args) throws IOException
    {
        //writing to file
            //dos can't do it alone so creating fis as a platform for it
        FileOutputStream fos = new FileOutputStream("./abc.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        //writing primitive data types on the file
        dos.writeInt(100);
        dos.writeChar('\t');
        dos.writeInt(15);
        dos.writeChar('\t');
        dos.writeInt(20);
        dos.writeChar('\n');
        dos.close();
        fos.close();
        //writing from file
        
        FileInputStream fis = new FileInputStream("./abc.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        while(dis.available()!=0)
        {
            System.out.print(dis.readInt());
            System.out.print(dis.readChar());
        }
        dis.close();
        fis.close();
    }
}
