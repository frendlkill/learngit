package javaweb.web.mywebDemo2;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("你想和谁建立连接");
        System.out.println("address:");
        String address=sc.nextLine();
        System.out.println("什么端口");
        int ipd=sc.nextInt();
        Socket s=new Socket(address,ipd);
        Factory f=new Factory(s);
        f.star();
    }
}
