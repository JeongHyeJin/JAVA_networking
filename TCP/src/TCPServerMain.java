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
        // 한줄씩 읽기 위해 얘를 씀. 따로따로 recive를 받지 않고 연결됬다고 생각하고 reader로 가져옴

        //read
        String message = reader.readLine();

        // print message
        System.out.println(socket.getInetAddress()+" > "+message);
    }
}
