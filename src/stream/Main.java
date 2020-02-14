package stream;

import java.io.*;

/**
 * @author Coco
 * @date 2020/02/13
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("---------start--------");

        byte[] buffer = new byte[10];

        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte)i;
        }

        try {

            // 写入
            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("src/stream/out.txt"))));
            int i = 666;
            printWriter.println(i);
            printWriter.close();

            // 读取
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/stream/out.txt"), "utf8"));

            String s = in.readLine();
            System.out.println("s = " + s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
