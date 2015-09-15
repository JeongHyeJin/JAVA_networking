import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPClientMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String message = "";

        // input message
        message = sc.nextLine(); // 한줄 읽기

        // make socket
        Socket socket = new Socket("localhost", 6666);

        // make writer
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);   // 그냥 연결 된 곳에 쓸수 있도록 연결.
                                                                    // printwriter는 바로바로 쓴다는 의미를 갖고 있음.

        // writer
        writer.println(message);
    }
}
