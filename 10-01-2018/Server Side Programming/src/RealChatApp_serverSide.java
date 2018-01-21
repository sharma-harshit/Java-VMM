
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RealChatApp_serverSide
{
    ServerSocket ssock ;
    Socket sock ;
    PrintWriter pw ;
    BufferedReader brn ;
    BufferedReader brk;

    public RealChatApp_serverSide()
    {
        try 
        {
            ssock = new ServerSocket(9000);
            sock = ssock.accept();                    
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
                    pw.println("Server : "+s);
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
        RealChatApp_serverSide obj=new RealChatApp_serverSide();
        send sender = obj.new send();
        new Thread(sender).start();
        receive receiver = obj.new receive();
        new Thread(receiver).start();
        
    }
}
