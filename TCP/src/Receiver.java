import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Receiver extends Thread {
    Socket socket;
    DataInputStream in;
    String message;

    Receiver(Socket socket) throws IOException {
        this.socket = socket;
        // make DataInputStream
        in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        while (in != null) {
            // readUTF(message)
            try {
                message = in.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // print message
            System.out.println(socket.getInetAddress() + " >> " + message);

            if (message.equals("bye")) break;

        }
    }
}
