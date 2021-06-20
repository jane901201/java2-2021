package com.tom.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try {
            //Socket socket = new Socket("ppt.cc",23);
            Socket socket = new Socket("www.ibm.com",80);
            InputStream is = socket.getInputStream();
            int data = is.read();
            for (int i = 0; i < 10; i++) {
                System.out.println(data);
            }

        }catch (IOException e) {
            e.getStackTrace();
        }

    }
}
