import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        String s = socket.getInetAddress().getHostAddress();
        System.out.println(s+"------ is connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        PrintWriter bw = new PrintWriter(new FileWriter("main.txt"),true);
        String line = null;
        while ((line = br.readLine())!=null){
            sop(line);
            bw.println(line);
        }
        pw.println("发送成功12345");
    }

    public static void sop (Object obj){
        System.out.println(obj);
    }
}
