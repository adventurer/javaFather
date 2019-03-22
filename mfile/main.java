package mfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);
        newFile("sdfsdf");
    }

    private static void newFile(String content) {

        try {
            FileReader file = new FileReader("content.txt");
            BufferedReader reader = new BufferedReader(file);
            String oldContent;
            System.out.println("旧内容:");
            while ((oldContent = reader.readLine()) != null) {
                System.out.println(oldContent);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("文件读取失败");
        }

        try {
            FileWriter file = new FileWriter("content.txt",true);
            BufferedWriter outHandle = new BufferedWriter(file);
            outHandle.write("无恙\n");
            outHandle.close();
            System.out.println("文件创建成功");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("文件创建失败");
        }



    }
}