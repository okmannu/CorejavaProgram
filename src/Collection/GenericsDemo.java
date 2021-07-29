package Collection;

import java.util.*;


//Generic program
class Example {

// use generic methods
    public<E> void printArray(E[] n)
    {
        for (E x:n
             ) {
            System.out.println(x);
        }
    }



public static class GenericsDemo {
    public static void main(String[] args) {



        //it contain all type of value
        List values = new ArrayList();
        values.add(40);
        values.add("manish");

        System.out.println(values);
        System.out.println("..................................................");


        // it safety with the particular type in  prg
        List<Integer> liIn = new ArrayList<Integer>();
        liIn.add(100);
        liIn.add(200);
        liIn.add(300);
        liIn.add(400);
        liIn.add(400);

        System.out.println(liIn);
        System.out.println(".........................................");



        Example ex = new Example();
        String countries[] = new String[]{"manish", "dhote", "karuna", "dhote",};
        Integer number[] = new Integer[]{1, 2, 5, 4, 5, 6};
        ex.printArray(countries);
        ex.printArray(number);

    }
}





    }

