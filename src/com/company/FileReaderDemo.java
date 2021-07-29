package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

// Read character by character  like this -> char ch
    /*    FileReader fileReader = new FileReader("E:\\file's\\manish");
        int fr = fileReader.read();

        while (fr != -1) {
            System.out.print((char) fr); // type cast required because read() return unicode value
            fr = fileReader.read();
        }
        fileReader.close();
    }*/

        // read data array of character like this -> char[] ch

        File file = new File("E:\\file's\\note.txt");
        FileReader fileReader2 = new FileReader(file);
        char[] ch = new char[(int) file.length()];  // array return value int // and length() return value long that's why type cats long to int
        fileReader2.read(ch);
        for (char ch1 : ch) {

            System.out.print(ch1);
        }
    }
}
