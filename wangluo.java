服务端Server：

package com.classbook.chapter.work;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        PrintWriter out=null;
        Scanner get = null;
        ServerSocket server=new ServerSocket(8866);
        System.out.println("服务器正在运行，等待客户端连接！");
        while (true){

            Socket client=new Socket();
            client=server.accept();
            System.out.println(client.getInetAddress()+" 已成功连接到此台服务器上。");

            out = new PrintWriter(client.getOutputStream());
            get = new Scanner(client.getInputStream());

            new SocketWrite(out).start();
            new SocketReader(get).start();

        }
    }
}




客户端Client：

package com.classbook.chapter.work;

import thread.SocketReader;
import thread.SocketWrite;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        PrintWriter out=null;
        Scanner get = null;
        Socket client=new Socket("192.168.43.4",8866);
        get = new Scanner(client.getInputStream());
        out = new PrintWriter(client.getOutputStream());
        new SocketReader(get).start();
            new SocketWrite(out).start();

    }
}


SocketWriter：

package com.classbook.chapter.work;

import java.io.PrintWriter;
import java.util.Scanner;

public class SocketWrite extends Thread{

    private Scanner scanner;
    private PrintWriter out;
    private Scanner get_key = null;
    public SocketWrite(PrintWriter out){
        this.out=out;
    }
    public void  run(){
        out.println("已成功连接到远程服务器！");
        out.flush();//将缓冲流中的数据全部输出
        while(true){
            try{
                get_key = new Scanner(System.in);
                String msg=get_key .nextLine();
                out.println(msg);
                out.flush();
            //    System.out.println("请输入消息：");
            }catch(Exception e){
                System.out.println("连接已断开！");
                return;
            }
        }
    }
}



SocketReader：

package com.classbook.chapter.work;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class SocketReader extends Thread{
    private Scanner get;
    public SocketReader(Scanner get){
        this.get=get;
    }

    public void  run(){
        while(true){

            try{
                while(true){
                    System.out.println("收到对端消息："+get.nextLine());
                  //  System.out.print("输入消息：");

                }
            }catch(Exception e){
                System.out.println("连接已中断");
                return;
            }
        }
    }
}


