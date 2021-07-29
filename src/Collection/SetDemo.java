package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

       /* not Index collection
       * order not preserved
       * not duplicates allowed
       * */

        System.out.println("....................set{Hasset}.......................");

        HashSet<Integer> hset =  new HashSet<>();
        hset.add(1);
        hset.add(2);
        hset.add(11);
        hset.add(11);
        hset.add(22);
        hset.add(31);
        hset.add(33);
        hset.add(50);

        System.out.println(hset +  "order not preserved ");

        System.out.println("....................set{TreeSet}.......................");

        TreeSet<Integer> tset = new TreeSet<>();
        tset.addAll(hset);  // add other(hset) collection
        System.out.println(tset+" sorted data");

    }
}
