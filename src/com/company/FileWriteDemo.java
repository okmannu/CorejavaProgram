package com.company;
import  java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {

     //   FileWriter fileWriter = new FileWriter("E:\\file's\\manish");
        FileWriter fileWriter = new FileWriter("E:\\file's\\manish",true);
        fileWriter.write(100); // adding single character
        fileWriter.write("Manish write one line \n okay");
        fileWriter.write("\n");
        char [] ch = { 'd' , 'h', 'o' , 't', 'e'};

        fileWriter.write(ch);
        fileWriter.flush();
        fileWriter.close();


    }
}
