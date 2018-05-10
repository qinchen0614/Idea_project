package com.qinchen.uploadPic;

import java.io.*;
import java.net.Socket;

public class PicClient {
    public static void main(String[] args) throws Exception{

        if(args.length!=1){
            System.out.println("请选择一个文件上传");
            return;
        }

        File f =new File(args[0]);

        if(!(f.exists()&&f.isFile())){
            System.out.println("文件不存在或者不是文件");
            return;
        }

        if(!f.getName().endsWith(".jpg")){
            System.out.println("文件格式必须是jpg");
            return;
        }
        if(f.length()>1024*1024){
            System.out.println("文件不能超过1M");
            return;
        }

        FileInputStream file = new FileInputStream(f);
        Socket socket  = new Socket("127.0.0.1",8888);
        OutputStream out = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = file.read(bytes))!=-1){
            out.write(bytes,0,len);
        }

        socket.shutdownOutput();

        InputStream in = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int read = in.read(bytes1);
        System.out.println(new String(bytes1,0,read));

        out.close();
        socket.close();
    }
}
