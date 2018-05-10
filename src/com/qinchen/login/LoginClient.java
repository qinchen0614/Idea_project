package com.qinchen.login;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LoginClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1",9999);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

        BufferedReader brc = new BufferedReader(new InputStreamReader(s.getInputStream()));

        for (int i = 0; i < 3; i++) {

            String line = br.readLine();
            if(line==null){
                break;
            }
            pw.println(line);
            String s1 = brc.readLine();
            if(s1.contains("欢迎")){
                System.out.println("info:"+s1);
                break;
            }else{
                System.out.println("info:"+s1);
            }
        }

        br.close();
        s.close();

    }
}
