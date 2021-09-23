package com.example.demo.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author liangchen
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("E:\\io\\test.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
