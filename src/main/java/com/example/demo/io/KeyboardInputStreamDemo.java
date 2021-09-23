package com.example.demo.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liangchen
 */
public class KeyboardInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int i;
        while ((i = inputStream.read()) != -1) {
            System.out.println((char) i);
        }
    }
}
