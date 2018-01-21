
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server_bindingKeyboard_ShowingDataSentByClient
{

    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket ssock = new ServerSocket(9000);
            Socket sock = ssock.accept();
            //using pw to send strings
            PrintWriter pw = new PrintWriter(sock.getOutputStream());            
            pw.write("Hey!!!\nYou just got connected to the server.");
            pw.flush();
                     
            //receiving data from client
            BufferedReader brn = new BufferedReader( new InputStreamReader( sock.getInputStream() ) );
            System.out.println(brn.readLine());
            
             //reading input from keyboard
            BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
            String s = brk.readLine();            
            //sending it to client
            pw.write(s);
            pw.flush();  
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
