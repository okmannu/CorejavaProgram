package Collection;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.invoke.empty.Empty;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {


        System.out.println("---------------------Hashmap--------------------------");
        HashMap<String,Integer> course = new HashMap<>();
        course.put("core java" , 4000);
        course.put("Python" , 3500);
        course.put("PHP" , 3000);
        course.put("c++" , 3000);
        course.put("ANDROID" , 8000);
        course.put("ANDROID" , 8000); // duplicated are not allowed but value are allowed
        course.replace("c++",3000,400);
        System.out.println(course);




         System.out.println("---------------------ForEachMethod--------------------------");
        course.forEach((Key , Value)->{
            System.out.print(Key);
            System.out.print("=>");
            System.out.println(Value);
        });
            System.out.println("---------------------ForEachLoop--------------------------");

            System.out.println(course.get("core java"));
            System.out.println(course.containsKey("c++"));

        System.out.println("---------------------entryset()--------------------------");





    }
}
