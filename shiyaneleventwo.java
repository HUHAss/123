package com.classbook.chapter.work;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TxtR {
    public static void main(String[] args) throws Exception {

        File test1 = new File("Userinfomation.txt");
        readTxt(test1);

    }

    public static void readTxt(File file) throws Exception {

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;

        while((str = bufferedReader.readLine())!= null) {
            System.out.println(str);
        }

        fileReader.close();

    }
}