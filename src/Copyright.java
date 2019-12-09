import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Copyright {

    public static void main(String[] args) {
        ArrayList<Integer> fis = new ArrayList<>();

        try (FileInputStream data = new FileInputStream("e:/files/data.txt")) {
            int i = -1;
            while ((i = data.read()) != -1) {
                fis.add(i);
            }
        } catch (IOException ex) {
            System.out.println("IOE" + ex.getMessage());
        }
        try (FileOutputStream data2 = new FileOutputStream("e:/files/data2.txt")) {

            for (int i : fis) {
                data2.write(i);
            }
        } catch (IOException e) {
            System.out.println("IOE" + e.getMessage());
        }
    }
}



