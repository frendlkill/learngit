package javaweb.web.mywebDemo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServletDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("什么端口");
        int ipd=sc.nextInt();
        ServerSocket ss=new ServerSocket(ipd);
        Socket s=ss.accept();
        Factory f=new Factory(s);
        f.star();
    }
}
