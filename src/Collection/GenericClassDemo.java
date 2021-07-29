package Collection;

import java.util.ArrayList;

public class GenericClassDemo {


    static class MyGeneric<T1> {
        int val;
        private T1 t1;

        public MyGeneric(int val, T1 t1) {

            this.val = val;
            this.t1 = t1;
        }

        public int getVal() {
            return val;

        }

        public void setVal(int val) {
            this.val = val;
        }

        public T1 getT1() {
            return t1;
        }

        public void setT1(T1 t1) {
            this.t1 = t1;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1230);
        arrayList.add(12);
        arrayList.add(130);
        // arrayList.add("manish");
        arrayList.add(1);
        // arrayList.add(12.5f);

        //      int a = (int)arrayList.get(50);  // type casting

        System.out.println(arrayList);

        System.out.println(arrayList.set(0, 20));

        // replace the value
        System.out.println(arrayList);

        System.out.println(".....................................");

        MyGeneric<String> g1 = new MyGeneric(20,"mkmksmkmskkskkks");
        MyGeneric<Integer> g2 = new MyGeneric(20,25522);

        String a = g1.getT1();
        Integer b = g2.getVal();
        System.out.println(a);
        System.out.println(b);

    }
}
