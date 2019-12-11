import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        File file = new File("/home/uzver/dz1111/Box.java");

        try (Scanner scanner = new Scanner(new FileReader(file))) {

            while (scanner.hasNextLine()) {
                str.add(scanner.nextLine());
            }

            Collections.sort(str);
            for (String s : str)
                System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


