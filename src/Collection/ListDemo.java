package Collection;

import java.util.*;


/* 1) type safe - same type of element (object) are add to collection /
              ArrayList<String> name = new ArrayList<String>();
 *  2) type un safe - different type elements can be add to collection
 *        ArrayList name = new ArrayList();
 *  */
public class ListDemo {
    public static void main(String[] args) {

        System.out.println("..........................type safe(Array List).....................................");
        ArrayList<String> name = new ArrayList<String>();
        name.add("manish");  // order preserved
        name.add("mannu");
        name.add("manish dhote");  // duplicates are allow
        name.add("manish dhote");
        name.add("YASH");
        name.add("Aman");
        // name.add(888);   not allowed different type
        System.out.println(name);


        System.out.println("..........................Sorting...................................");
        List<Integer> name1 = new ArrayList<Integer>();
        name1.add(100);  // order preserved
        name1.add(2000);
        name1.add(35);  // duplicates are allow
        name1.add(40000);
        name1.add(50000);

        System.out.println(name1);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(name1);
        treeSet.forEach(e -> {
            System.out.println(e);
        });

        System.out.println(".................// indexed collection..........");
        System.out.println(name);
        System.out.println(name.get(2)); // indexed collection


        System.out.println(".................// removed index value 4..........");
        name.remove(3);
        System.out.println(name);


        System.out.println(".................// Size............");
        System.out.println("Size =" + name.size());


        System.out.println(".............. // checked list name............");

        System.out.println(name.contains("manish")); // ture


        System.out.println(".............. // add index value  ............");
        name.set(1, "kl aana");
        System.out.println(name);


        // add other collection in vector
        System.out.println(",,,,,,,,,,,,,,,,,,,,,Vector,,,,,,,,,,,,,,,");
        Vector<String> vint = new Vector<>();
        vint.addAll(name);
        System.out.println(vint);





    }
}
























