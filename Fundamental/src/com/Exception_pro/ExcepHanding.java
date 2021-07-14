package Exception_pro;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

public class ExcepHanding {
    public static void main(String[] args) throws IOException {


        // simple try catch
/*
        try {
            int a = 100, b = 0, c;   // Arithmetic Exception  //Runtime Exception
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();  // print Dec , E name ,line

            //   System.out.println(e.toString());  Dec , E name
            //  System.out.println(e.getMessage()); // only Dec
            System.out.println("Program including Exception but not break");
        }*/

        //Working on finally keyword it use it close file and when ever open file in try block that is close in finally block o

        FileInputStream fileInputStream = null;
 try {

      fileInputStream = new FileInputStream("D:\\java");

         }catch (Exception e){
     e.printStackTrace();
     System.out.println("catch block");
 }finally {

     //cleanup state
     if(fileInputStream != null)
     {
         fileInputStream.close();
     }
     System.out.println("file closed");
 }

    }
}




  /*      try {
            //runtime Exception  //risky code
            String name = null;
            System.out.println(name.length());

        }catch (Exception e){    // handing code

            System.out.println("Program not terminate" );
        }
    }  */




