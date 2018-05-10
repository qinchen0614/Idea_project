package com.qinchen.uploadPic;

import java.net.ServerSocket;
import java.net.Socket;

public class PicServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);
        while (true){
            Socket s = ss.accept();
            new Thread(new PicThread(s)).start();
        }
//        ss.close();
    }
}
