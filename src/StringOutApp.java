import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringOutApp {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        try(BufferedReader br = new BufferedReader (new FileReader("/home/uzver/Circle3.java")))
        {
//чтение построчно
            String s;
            while((s=br.readLine())!=null){
                al.add(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        Collections.sort(al);
        //Comparator<String> comparator = Collections.sort();
        for(String s : al)
            System.out.println(s);
    }
}
   /* Также можно считать текст построчно:
        try(BufferedReader br = new BufferedReader(new FileReader("notes4.txt")))
        {


        // чтение посимвольно
            int c;
            while((c=br.read())!=-1){
                System.out.print((char)c);



        }
        }
        catch(IOException ex){
        System.out.println(ex.getMessage());
    }
    */