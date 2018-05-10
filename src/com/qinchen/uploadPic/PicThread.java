package com.qinchen.uploadPic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PicThread implements Runnable{
    private Socket s;

    PicThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        int count = 1;
        try{
            System.out.println(ip+"--- is connected");
            InputStream in = s.getInputStream();

            File file = new File("D://javaTest//"+ip+"("+(count)+")"+".jpg");
            while(file.exists()){
                 file = new File("D://javaTest//"+ip+"("+(count++)+")"+".jpg");
            }

            FileOutputStream out = new FileOutputStream(file);
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = in.read(bytes))!=-1){
                out.write(bytes,0,len);
            }

            OutputStream outs = s.getOutputStream();
            outs.write("上传成功".getBytes());
            System.out.println("回复客户端成功！");
//            out.close();
//            s.close();
        }catch (Exception e){
            throw new RuntimeException(ip+"上传失败");
        }

    }
}
