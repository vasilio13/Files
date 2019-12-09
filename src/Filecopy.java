import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class Filecopy {
    public static void main(String[] args) {

        try {
            Path source = Paths.get("e:/files/data.txt");
            Path target = Paths.get("e:/files/data2.txt");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("error path" + e);
        } catch (IOException e) {
            System.out.println("error I/O" + e);
        }
    }
}