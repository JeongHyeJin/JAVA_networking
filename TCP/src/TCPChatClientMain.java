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
        sender.start();    // ��Ƽ �����带 ���ؼ� start()�� ��. run()�� �׳� �ܼ� �Լ� ȣ��.

        // make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();

    }


}
