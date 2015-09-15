import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPClientMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String message = "";

        while(true) {
            // inputMessage
            System.out.print("send Message > ");
            message = sc.nextLine(); // 한줄 읽기

            // makePacket
            DatagramPacket dp = new DatagramPacket(
                    message.getBytes(),                     // 보낼 메세지의 내용
                    message.getBytes().length,              // 보낼 메세지의 길이
                    InetAddress.getByName("localhost"),     // IP 주소
                    1226                                    // 포트번호
            );

            // makeSocket
            DatagramSocket ds = new DatagramSocket();       // 마차 생성..다그닥 다그닥

            // Send
            ds.send(dp);    // 보냄

            if(message.equals("bye")) break;
        } //while
    }
}
