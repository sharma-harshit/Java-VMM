
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class turnwise_chat_app_serverSide
{
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket ssock = new ServerSocket(9000);
            Socket sock = ssock.accept();
            //using pw to send strings
            PrintWriter pw = new PrintWriter(sock.getOutputStream());            
            pw.println("Hey!!!\nYou just got connected to the server.");
            pw.flush();
            String s=" ";
            while(s!="exit")
            {
              //receiving data from client
                 BufferedReader brn = new BufferedReader( new InputStreamReader( sock.getInputStream() ) );
                 System.out.println("Client : " + brn.readLine());
            
             //reading input from keyboard
                BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
                s = brk.readLine();            
            //sending it to client
                 pw.println("\nServer : "+s);
                 pw.flush();  
            }
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
