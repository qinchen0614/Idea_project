package com.qinchen.chaibao;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ChaiBao {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://47.92.126.8:8080/gasinternet");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println("合并分支");
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}
