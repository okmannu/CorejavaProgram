package com.company;

import java.io.*;

public class FileMerger {
    public static void main(String[] args) throws IOException {

// file one and two to marge and show data file 3
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\file's\\Merger.text")); // data save
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\file's\\abc.txt")); // read file one

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader = new BufferedReader(new FileReader("E:\\file's\\abc1.txt")); // read file two
        line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
