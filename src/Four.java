import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**Подсчитать количество уникальных слов во всех java файлах в
 папке.*/


public class Four {

    static int calculateWords(String s) {
                return 10;
    }

    public static void main(String[] args) {
        int counterWords = 0;

        System.out.println("start");
        File dirjava = new File("/home/uzver/dz1111/");
        FilenameFilter javaext = new OnlyExt("java");
        String s[] = dirjava.list(javaext);


        for (int i=0; i<s.length; i++) {
            System.out.println(s[i]);
            System.out.println(i);
            counterWords= counterWords+calculateWords(s[i]);
            System.out.println(counterWords);
        }

        StringBuffer sb = new StringBuffer();
        try (Scanner scanner = new Scanner(new FileReader(dirjava+"/"+s[0]))) {

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
        }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        System.out.println(sb);
        String sb1 = sb.toString();
        sb1 = sb1.replace("(", " ").replace(")", " ").
                replace("!", " ").replace("{"," ").
                replace("}"," ").replace(";"," ").
                replace("/"," ").replace("="," ").
                replace("."," ");
        System.out.println(sb1);
        String[] words = sb1.split(" ");
        for(int i=0;i<words.length;i++)
        words[i]=words[i].trim();
        HashSet<String> wordsOne = new HashSet<>();
        for(int i=0;i<words.length;i++)
            wordsOne.add(words[i]);
        Iterator<String> i =wordsOne.iterator();
        while (i.hasNext())
        System.out.println(i.next());

        }
        //String trimedStr2 = str2.trim();  // "cat"


        /*try (FileInputStream data = new FileInputStream(dirjava+"/"+s[0])) {
            int i = -1;
            while ((i = data.read()) != -1) {
                sb.append(i);
            }
        } catch (IOException ex) {
            System.out.println("IOE" + ex.getMessage());
        }
        System.out.println(sb);
*/

    }





    class OnlyExt implements FilenameFilter {
        String ext;
        public OnlyExt (String ext) {
            this.ext = "."+ext;
        }
        public boolean accept (File dir, String name) {
            return name.endsWith(ext);
        }
    }






/*
    String str = "Hello world(cat)";
    String[] words = str.split(" ");

    String str2 = "   cat    ";
    String trimedStr2 = str2.trim();  // "cat"

    str = str.replace("(", " ").replace(")", " ").replace("!", "");

    StringBuffer stringBuffer = new StringBuffer();

       while (reader.hasNextLine()) {

        stringBuffer.append(reader.nextLine());

    }

      stingBuffer.toString();

public interface FilenameFilter {
boolean accept(File dir, String name);
}
}


*/