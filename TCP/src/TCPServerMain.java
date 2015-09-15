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
        // make socket(accpet)
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();

        // make reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //read
        String message = reader.readLine();

        // print message
        System.out.println("ÁÖ¼Ò > "+message);
    }
}
