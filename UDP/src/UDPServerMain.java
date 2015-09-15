import java.io.IOException;
import java.net.*;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPServerMain {
    public static void main(String[] args) throws IOException {
        byte[] data = null;
        String message = "";

        // makeSocket
        DatagramSocket ds = new DatagramSocket(1226); // 뚫어 놓은 것은 하나면 충분함
        while(true) {
            data = new byte[1024];

            // makePacket
            DatagramPacket dp = new DatagramPacket(data, data.length);  // 오는 것 마다 다르니까 새로 만들어줘야돼

            // receive
            System.out.println("UDP Server standby..");
            ds.receive(dp);

            // printMessage
            message = new String(dp.getData()).trim();  //byte 배열이 남은 것을 공백으로 String으로 만들기 때문에 다 빼버림. => 오로지 bye를 추출 하기 위해서
            System.out.println(dp.getAddress() + " > " + message);

            if(message.equals("bye"))  {
                System.out.println("Server Off");
                break;
            }
        }
    }
}
