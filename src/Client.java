import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Idea_project\\src\\Main.java")));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader brs = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while((line = br.readLine())!=null){
            pw.println(line);
//            bw.write(line);
//            bw.newLine();
//            bw.flush();

        }

        socket.shutdownOutput();

        String readLine = brs.readLine();
        sop(readLine);

        br.close();
        socket.close();
    }

    public static void sop (Object obj){
        System.out.println(obj);
    }
}
