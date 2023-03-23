package org.st.log;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(new Cash());
        byte[] b = {121,11,37,111};
        String mess = new String(b, 0, b.length, StandardCharsets.UTF_8);
        System.out.println(mess);
        File file = new File("C:/Test");
        File file2 = new File("C:\\Test");

    }
}
