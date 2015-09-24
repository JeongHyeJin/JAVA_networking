import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatClientMain {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";

        // make socket
        Socket socket = new Socket(serverIP, 6666);

        // make Sender
        Sender sender = new Sender(socket);
        sender.start();    // 멀티 스레드를 위해서 start()를 씀. run()은 그냥 단순 함수 호출.

        // make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();

    }


}
