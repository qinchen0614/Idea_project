package com.qinchen.login;

import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(9999);
        while (true){
            Socket accept = ss.accept();
            new Thread(new LoginThread(accept)).start();
        }
    }
}
