package com.company;

public class Operators {
    public static void main(String[] args) {

//Arithmatic op
        System.out.println("Arithmatic op");
        int a = 4 ;
        int b = 6 + a;
        System.out.println(b);

        int c = 4;
        int d = 6 % c; //modulo operator reminder show
        System.out.println(d);


      //Assignment op
        System.out.println("Assignment op");
        int e = 4;
           e += 3;
        System.out.println(e);

        //comparison op
        System.out.println("comparison op");
        System.out.println(e==b); //
        System.out.println(e<=b);
        System.out.println(e>=b);



        //Logical op
        System.out.println("logical op");
        // && all condition true than ans true
        System.out.println(50>51 && 50>25);

        // || only one condition ture than ans ture
        System.out.println(50>51 || 50>25);

        //Bitwise
        System.out.println(2&3);


        //increment and decrement operators
        int i = 56;
        int g = i++; // first g is assigned then i  is increment (56)

        int k = 57;  //first k is is increment  then l assigned j (68)
        int l = ++k ;

        System.out.println(i++);

        System.out.println(i);

        System.out.println(++i);

        System.out.println(i);
    }
}

