
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Making_Server
{
    public static void main(String[] args) throws IOException
    {
        // intializing a server at port 4321
        ServerSocket ssock = new ServerSocket(4321);
        System.out.println("Server Established!!!");
        
        // accepting requests and making connection on other free port
        Socket sock = ssock.accept();
        
        // preparing a PrintWriter so that it can write to output stream with takes only bytes
        PrintWriter pw = new PrintWriter(sock.getOutputStream());
        
        pw.println("Hey there !!!\nHow are you ?");
        pw.flush();
        
        pw.close();
        sock.close();
        ssock.close();
    }
}
