import java.io.IOException;
import java.net.*;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPServerMain {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[1024];

        // makeSocket
        DatagramSocket ds = new DatagramSocket(1226);

        // makePacket
        DatagramPacket dp = new DatagramPacket(data, data.length);

        // receive
        System.out.println("UDP Server standby..");
        ds.receive(dp);

        // printMessage
        String message = new String(dp.getData());
        System.out.println(dp.getAddress()+" > "+ message);

        // bye 오면 그만 하기

    }
}
