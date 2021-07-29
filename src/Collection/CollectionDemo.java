package Collection;

import java.util.*;




public class CollectionDemo {
    public static void main(String[] args) {


        //type safe creating object is same type of object

        ArrayList<String> name = new ArrayList<String>();
        name.add("manish");
        name.add("mannu");
        name.add("manish dhote");
        name.add("manish dhote");
        name.add("YASH");

        // getting index  value
        System.out.println(name);


        /*    // un type safe creating object is different type of object

        LinkedList list = new LinkedList();
        list.add(1225);
        list.add(10.25);
        list.add(1025);
        list.add(10255);
        list.add(true);

        System.out.println(list.get(1));*/

        //remove data
        //  name.remove("mannu");
        // System.out.println(name);

        // size
        //  System.out.println("Size ="+name .size());

        // checked list name
        // System.out.println(name.contains("manish")); // ture

        // setting value
        //  name.set(1,"okmannu");

        // siwfting element
        //  name.add(1,"rohit");

// add data for new collection
        Vector<String> vector = new Vector<>();
        vector.addAll(name);

        System.out.println(vector);
        System.out.println(".............................Hashset..............................");

        HashSet<Double> nms = new HashSet<Double>();
        nms.add(14.25);
        nms.add(158.25);
        nms.add(13.25);
        nms.add(14.5);
        nms.add(14.5);
        nms.add(5.2);

        System.out.println(nms);

// sorting
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(nms);
        System.out.println(treeSet);


    }
}
