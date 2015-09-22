import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Sender extends Thread{ // 보내는 애니까 입력을 받고 보냄
    Socket socket;
    DataOutputStream out;

    Sender(Socket socket){
        this.socket = socket;
        // make DataOutputStream
        out = new DataOutputStream(socket.getOutputStream()); //출력 역할 하는 애

    }

    @Override
    public void run() {
        // input message
        Scanner sc = new Scanner(System.in); // 입력을 받음
        String message = sc.nextLine();

        // writeUTF(message)
        out.writeUTF(message);
    }
}
