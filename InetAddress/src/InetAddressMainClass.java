import java.net.*;

public class InetAddressMainClass {
    public static void main(String[] args) throws UnknownHostException {
        // 내 컴퓨터
        System.out.println("내 컴퓨터");
        // get InetAddress from 127.0.0.1
        InetAddress myIA = InetAddress.getLocalHost();
        // IP 주소
        System.out.println("IP주소 : " + myIA.getHostAddress());
        // 도메인 이름
        System.out.println("도메인네임 : " + myIA.getHostName());


        System.out.println("----------------------------------");


        // 미림 홈페이지
        // get InetAddress from www.e-mirim.hs.kr
        System.out.println("미림 홈페이지");
        InetAddress mirimIA = InetAddress.getByName("www.e-mirim.hs.kr");
        // IP 주소
        System.out.println("IP주소 : " + mirimIA.getHostAddress());
        // 도메인 이름
        System.out.println("도메인네임 : " + mirimIA.getHostName());
    }

}
