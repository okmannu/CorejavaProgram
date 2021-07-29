package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {


        //creating file  (constructor1)

        File file = new File("E:\\file's\\abc.txt");
        file.createNewFile();
        System.out.println(file.exists());
        file.mkdir();

        // creating file in which folder (directory)  (constructor2)

        File file1 = new File("E:\\file's\\", "abc1.txt");
        file1.createNewFile();
        System.out.println(file.exists());

        //creating file in  (constructor3)

        File file2 = new File(file, "abc2.txt");
        file1.createNewFile();
        System.out.println(file.exists());

// print all file name and total file in the directory


        System.out.println("print all file name");
        try {
            int count = 0;
            File f = new File("E:\\file's\\abc.txt");
            String[] s = f.list();
            assert s != null;
            for (String s1 : s) {
                count++;
                System.out.println(s1);
            }

            System.out.println("the total number :" + count);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}


