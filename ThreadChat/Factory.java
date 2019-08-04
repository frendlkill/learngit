package javaweb.web.mywebDemo2;

import java.io.IOException;
import java.net.Socket;

public class Factory {
    private static Socket s;
    public Factory(Socket s){
        this.s=s;
    }
    public static void star() throws IOException {
        getmassage gm=new getmassage(s);
        sendmassage sm=new sendmassage(s);
        Thread tg=new Thread(gm);
        Thread ts=new Thread(sm);
        tg.start();
        ts.start();
    }
}
