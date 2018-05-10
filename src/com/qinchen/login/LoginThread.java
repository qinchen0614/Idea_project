package com.qinchen.login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LoginThread implements Runnable {

    private Socket s;

    LoginThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"--- is connnected");
        try {

            for (int i = 0; i < 3; i++) {

                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                String name = br.readLine();

                if(name==null){
                    break;
                }

                BufferedReader brf = new BufferedReader(new FileReader("D:/javaTest/user.txt"));

                PrintWriter pw = new PrintWriter(this.s.getOutputStream(),true);

                String line = null;

                boolean flag = false;

                while((line = brf.readLine())!=null){
                    if(name.equals(line)){
                        flag = true;
                        break;
                    }

                }

                if(flag){
                    System.out.println(name +"已登录");
                    pw.println(name + ",欢迎登陆");
                    break;
                }else{
                    System.out.println(name + "尝试登录");
                    pw.println(name + ",用户名不存在");

                }

            }
            s.close();
        }catch (Exception e){
            throw new RuntimeException("服务器异常");
        }
    }
}
