package javaweb.web.mywebDemo2;

import java.io.*;
import java.net.Socket;

public class sendmassage implements Runnable {
    Socket s;
    public sendmassage(Socket s) throws IOException {
        this.s=s;
    }
    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (true) {
            try {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                }
            } catch (IOException e) {
                System.out.println("输出错误");
            }
        }
    }
}

