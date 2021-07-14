package Exception_pro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ThrowsPro {

    public static void main(String[] args)  {

        ThrowsPro throwsPro =new ThrowsPro();
        // used to try catch at this moment program not terminate
        try {
            throwsPro.readFile();
        }catch (Exception e)
        {
            e.printStackTrace();  // all file show

        }
      //  throwsPro.saveFile();   // throws FileNotFoundException it use for anther person take your methods
        System.out.println("exception handing ");

    }

    void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(" D:\\java");
        System.out.println("file not found");
        //statement
    }
    void saveFile() throws FileNotFoundException {

        String text = "this is demo";
        System.out.println("file save success");
        FileOutputStream fileOutputStream  =  new FileOutputStream("D:\\test");
        //statement
    }
}

