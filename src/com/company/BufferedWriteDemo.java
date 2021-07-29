package com.company;

import java.io.*;

public class BufferedWriteDemo {
    public static void main(String[] args) throws IOException {

        FileWriter  fileWriter = new FileWriter("E:\\file's\\BufferedWrite.text");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(100);
        bufferedWriter.newLine();
        char[] ch = { 'M', 'a' ,'n','i','s','h'};
        bufferedWriter.write(ch);
        bufferedWriter.newLine();
        bufferedWriter.write("i have done mca ");
        bufferedWriter.flush();
        bufferedWriter.close();// only close Buffered writer because automatic close
    }
}
