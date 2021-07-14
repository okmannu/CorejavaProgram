package com.company;

import java.util.Scanner;

public class ConditionalsPro {
    public static void main(String[] args) {
        int age = 18;

        boolean cand = (age == 18);  // boolean type

        if (cand)  // (age=18) it assignment op  // (age==18) it is equality checked
        {
            System.out.println("yes boy you can drive");
        } else {
            System.out.println("no you can not drive");
        }

        ///if else

        boolean a = true;
        boolean b = false;

        if (a || b) {     // (a && b)
            System.out.println("  y ");

        } else {
            System.out.println(" N");
        }


        // ladder if else

/*
        System.out.println("Enter your Experienced year");
          Scanner sc = new Scanner(System.in);
           int year = sc.nextInt();

        if (year>20){
            System.out.println("you are experienced");
        }else  if (year>=15){
            System.out.println("you are semi - experienced");
        }else if (year>=10){
            System.out.println("you are semi - semi - experienced");
        }else {
            System.out.println("you are not experienced");
        }*/

//switch case

        System.out.println("Enter your Number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

     //   char var = r;   // String manish = "Dhote"  case "Dhote":

        switch (number) {   //switch (var) ans case will be case r; like
            case 1: {
                System.out.println("first number");
                break;
            }
            case 2: {
                System.out.println("2 number");
                break;
            }
            case 3: {
                System.out.println(" 3 number");
                break;
            }
            default: {
                System.out.println(" enjoy your bro");
            }
        }

    }
}
