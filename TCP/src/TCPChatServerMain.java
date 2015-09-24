import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket;

        System.out.println("TCP Chat Server standby...");

        // make socket(accept)
        socket = serverSocket.accept();

        // make Sender
        Sender sender = new Sender(socket);
        sender.start();      // 멀티 스레드를 위해서 start()를 씀. run()은 그냥 단순 함수 호출.

        // make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();
    }

}
