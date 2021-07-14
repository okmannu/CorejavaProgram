package com.company;
import java.util.Scanner;

public class ScanNer {
    public static void main(String[] args) {

        System.out.println("Taking The Input in user :");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the  int number 1:");
        int a = scanner.nextInt();
        System.out.println("Enter the int number 1:");
        int b = scanner.nextInt();

        System.out.println("Enter the float number 2:");
        float c = scanner.nextFloat();
        System.out.println("Enter the float number 2:");
        float d = scanner.nextFloat();

        int sum = a + b;
        float add = c + d;

        System.out.print("the sum of these int number is = ");
        System.out.println(sum);

        System.out.print("the sum of these float number is = ");
        System.out.println(add);



 /*       //check it user put int data are not
        boolean b1 = scanner.hasNextInt();
        System.out.println(b1);*/

 /*       // .next() input String ko return krta hai (read only on world)
        String str = scanner.next();
         System.out.println(str);*/

   /*     //read whole tine
        String str1 = scanner.nextLine();
        System.out.println(str1);*/

    }
}
