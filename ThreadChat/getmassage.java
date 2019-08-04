package javaweb.web.mywebDemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class getmassage implements Runnable{
    Socket s;
    public getmassage(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        System.out.println("连接成功");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("接收端报错");
        }

    }
}
