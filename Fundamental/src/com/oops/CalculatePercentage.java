package com.company;
import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {

        float  total = 0;
        System.out.println("Welcome To The State Board Percentage Marks:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Total marks of the subject 100: ");
        int total_marks = scanner.nextInt();

        System.out.println("Enter the hindi marks");
        float   hindi = scanner.nextFloat();
        total = total + hindi;

        System.out.println("Enter the English marks");
        float  eglish  = scanner.nextFloat();
        total = total + eglish;

        System.out.println("Enter the Maths marks");
        float  maths = scanner.nextFloat();
        total = total + maths;

        System.out.println("Enter the science marks");
        float   science = scanner.nextFloat();
        total = total + science;


        System.out.println("Enter the so-science marks");
        float  ss = scanner.nextFloat();
        total = total + ss;


        float grandTotal  = total *total_marks / (total_marks*5);
        float tolat_M    = total *total_marks/ (total_marks);

        System.out.println("your total percentage =  " + grandTotal + " percent");
        System.out.println("your total percentage =  " + tolat_M + " Total marks");





/*
//String concatenate
        System.out.println("pleas enter you name:");
        Scanner sc = new Scanner(System.in);
        String  name = sc.next();
        System.out.println("hello " + name + " have a good day");*/

// check int value
        System.out.println("pleas enter you name:");
        Scanner sc= new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}

