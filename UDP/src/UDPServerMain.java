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
        DatagramSocket ds = new DatagramSocket(1226); // �վ� ���� ���� �ϳ��� �����
        while(true) {
            data = new byte[1024];

            // makePacket
            DatagramPacket dp = new DatagramPacket(data, data.length);  // ���� �� ���� �ٸ��ϱ� ���� �������ߵ�

            // receive
            System.out.println("UDP Server standby..");
            ds.receive(dp);

            // printMessage
            message = new String(dp.getData()).trim();  //byte �迭�� ���� ���� �������� String���� ����� ������ �� ������. => ������ bye�� ���� �ϱ� ���ؼ�
            System.out.println(dp.getAddress() + " > " + message);

            if(message.equals("bye"))  {
                System.out.println("Server Off");
                break;
            }
        }
    }
}
