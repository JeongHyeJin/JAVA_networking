import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatServerMain {
    public static void main(String[] args) throws IOException {
        // make socket(accept)
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();

        // make Sender
        // make Receiver
    }

}
