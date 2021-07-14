package com.company;

public class Loop {
    public static void main(String[] args) {


        //while loop// while required boolean type  value  // while (ture) it infinite time

        int i = 1;
        while (i < 18) {
            System.out.println(i);
            i++;
        }


        //do while loop
        int j = 10;
        do {
            System.out.println("whit do while loop");
            System.out.println(j);
            j++;
        } while (j < 5);


        // for loop
        System.out.println("For loop");
        for (i = 0; i <= 10; i++) {
            System.out.println(i);  //(2*i+1)  n=5 //  i=0 n<5 i++
        }


// Decrementing
        System.out.println("Decrementing");
        for (j=0; j>5 ; j--) {
            System.out.println(j);
        }


//Break statement
        for (int t = 0; t < 5; t++) {
            System.out.println(t);
            System.out.println("java is great");
            if (t==2) {
                System.out.println("Ending the loop");
                break;
            }
        }


        // do while with Break

   /*     System.out.println("break");
        int m = 0;
        do {
            System.out.println(m);
            System.out.println("java is great");
            if (m == 2) {
                System.out.println("Ending the loop");
                break;
            }
            m++;
        } while (i < 5);

        {
            System.out.println("Ending end here");
        }*/


        //Continue


        System.out.println("continue");
            for (i=0; i<5; i++) {
                if (i == 2) {
                    System.out.println("Ending the loop");
                    continue;
                }
                System.out.println(i);
                System.out.println("java is great");
            }
    }
}