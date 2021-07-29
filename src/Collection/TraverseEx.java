package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseEx {
    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<String>();
        name.add("Manish");
        name.add("Dhote");
        name.add("Rahul");
        name.add("Dhote");
        name.add("Karuna");


        //for each loop
        System.out.println("-----------------  //for each loop --------------------------");
        for (String str : name) {

            System.out.print(str + "\t" + str.length() + "\t");


            // String reverse
            StringBuffer stringBuffer = new StringBuffer(str);
            System.out.println(stringBuffer.reverse());
        }
        System.out.println("-----------------  // forward traversal of collection using ITERATOR --------------------------");

        // traversing using ITERATOR forward traversing
        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext()) {  // it provide ture when next element is present here
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("---------------//  backward traversal of collection listIterator------------------------");
         //  backward traversal of collection listIterator

        ListIterator<String> listIterator = name.listIterator(name.size());
        while (listIterator.hasPrevious()) {

            String previous = listIterator.previous();
            System.out.println(previous);
        }

        // ForEachMethod
            System.out.println("---------------- ForEachMethod-----------------------");
            // for each Method
            name.forEach(str ->{
                System.out.println(str);    // str is not fix you can write any world
            });

        System.out.println("----------------Sorting element for ForEachMethod----in form of TreeSet-------------------");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(name);
            treeSet.forEach(e->{
                System.out.println(e);
            });
        }

    }

