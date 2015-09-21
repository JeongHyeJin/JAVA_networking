import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPServerMain {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP Server standby...");

        // make socket(accpet)
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();

        // make reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // ���پ� �б� ���� �긦 ��. ���ε��� recive�� ���� �ʰ� �����ٰ� �����ϰ� reader�� ������

        //read
        String message = reader.readLine();

        // print message
        System.out.println(socket.getInetAddress()+" > "+message);
    }
}
