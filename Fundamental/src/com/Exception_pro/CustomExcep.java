package Exception_pro;
import java.util.Scanner;
public class CustomExcep {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age ");

       int age = scanner.nextInt();
       try {


           if (age < 18) {

               throw new Younger("your are not eligible for voting");
           } else {
               System.out.println(" your voting succes ");
           }
       }catch (Younger e)
       {
           e.printStackTrace();
       }
        System.out.println("end");
    }
}

class Younger extends RuntimeException{

    Younger(String  msg){
        super(msg);
    }
}