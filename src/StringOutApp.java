import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringOutApp {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        try(BufferedReader br = new BufferedReader (new FileReader("e:/files/data.txt")))
        {

            String s;
            while((s=br.readLine())!=null){
                al.add(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        Collections.sort(al);
        for(String s : al)
            System.out.println(s);
    }
}
