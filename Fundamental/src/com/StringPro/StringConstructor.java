package StringPro;

public class StringConstructor {
    public static void main(String[] args) {

        String s = new String();// constructor empty
        System.out.println(s.length());


        // StringBuffer
StringBuffer stringBuffer = new StringBuffer("manish");

        // String Constructor
     String s1 = new  String(stringBuffer);
     String s3 = "manish";
        System.out.println("length of constructor");
        System.out.println(s1.length());
        System.out.println(s1);

// String Builder
       StringBuilder stringBuilder = new StringBuilder("mannu");
        System.out.println("String Builder");
        // String Constructor
        String s2 = new  String(stringBuilder); // constructor refr.
        System.out.println(s2.length());
        System.out.println(s2);


        // converting byte to integer
        System.out.println("String btye ");
        byte[] b = {102,103,104};
        String s4 = new String(b);
        System.out.println(s4);

        //converting String
        System.out.println("String char");
        char[] c = {'m','a','n','i','s','h'};
        String s5 = new String(c);
        System.out.println(s5);

        //why are you pref. pass in char[] not String

        char[] c1 = new char[]{'a','b','c','d'};   // only created object directly not convert (scp not deleted from garbage collection)

        String s6 = new String("password");  // object value

        System.out.println("c1 = "+ c1);

        System.out.println("S6 = "+ s6);
    }
}
