
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RealChatApp_ClientSide
{
    Socket sock ;
    PrintWriter pw ;
    BufferedReader brn ;
    BufferedReader brk;

    public RealChatApp_ClientSide()
    {
        try 
        {
            sock = new Socket("192.168.43.106",9000);                    
            pw = new PrintWriter(sock.getOutputStream());  
            brn = new BufferedReader( new InputStreamReader( sock.getInputStream() ) );  
            brk = new BufferedReader(new InputStreamReader(System.in));
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
    class send implements Runnable
    {
        @Override
        public void run() 
        {
            String s=" ";
            while(s!="exit")
            {
                try 
                {
                    s = brk.readLine();
                    pw.println("Client : "+s);
                    pw.flush();
                } 
                catch (IOException ex) 
                {
                    ex.printStackTrace();
                }
            }
        }        
    }  
    
    class receive implements Runnable
    {
        @Override
        public void run() 
        {
            String s=" ";
            while(s!="exit")
            {

                try 
                {
                    s = brn.readLine();
                    System.out.println(s);
                }
                catch (IOException ex) 
                {
                    ex.printStackTrace();
                }
            }
        }  
    }
    public static void main(String[] args) 
    {
        RealChatApp_ClientSide obj=new RealChatApp_ClientSide();
        send sender = obj.new send();
        new Thread(sender).start();
        receive receiver = obj.new receive();
        new Thread(receiver).start();
        
    }
}
