package com.example.demo.io;

import java.io.ByteArrayInputStream;

/**
 * @author liangchen
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String str="Hello world";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        int i;
        while ((i = byteArrayInputStream.read()) != -1) {
            System.out.println((char) i);
        }
    }
}
