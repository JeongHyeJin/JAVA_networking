import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Receiver extends Thread {
    Socket socket;
    DataInputStream in;
    String message;

    Receiver(Socket socket) {
        this.socket = socket;
        // make DataInputStream
        in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        // readUTF(message)
        message = in.readUTF();
        // print message
        System.out.println(socket.getInetAddress()+" >> "+ message);
    }
}
