package com.classbook.chapter.work;

import java.io.*;

public class TxtW {
    public static void main(String[] args) {
        try {
            BufferedReader stdin =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.println("输入 内容1");
            String line = stdin.readLine();
            System.out.println("输入 内容2");
            String line0 = stdin.readLine();
            BufferedWriter fout =
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("Userinfomation.txt")));
            //   fout.write();
            fout.write(line);
            fout.write(line0);
            fout.close();
        } catch (IOException e) {
            System.out.println("...");
        }

    }
}