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
        message = sc.nextLine(); // ���� �б�

        // make socket
        Socket socket = new Socket("localhost", 6666);

        // make writer
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);   // �׳� ���� �� ���� ���� �ֵ��� ����.
                                                                    // printwriter�� �ٷιٷ� ���ٴ� �ǹ̸� ���� ����.

        // writer
        writer.println(message);
    }
}
