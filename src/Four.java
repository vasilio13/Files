import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**Подсчитать количество уникальных слов во всех java файлах в
 папке.*/


public class Four {

    public static void main(String[] args) {
        int counterWords = 0;

        System.out.println("start");
        File dirjava = new File("/home/uzver/dz1111/");
        FilenameFilter javaext = new OnlyExt("java");
        String s[] = dirjava.list(javaext);

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<s.length; i++) {

            try (Scanner scanner = new Scanner(new FileReader(dirjava + "/" + s[i]))) {

                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

            System.out.println(sb);
            String sb1 = sb.toString();
            sb1 = sb1.replace("(", " ").replace(")", " ").
                    replace("!", " ").replace("{", " ").
                    replace("}", " ").replace(";", " ").
                    replace("/", " ").replace("+=", " ").
                    replace(".", " ").replace(">"," ").
                    replace("<"," ").replace("["," ").
                    replace("]"," ").replace("="," ").
                    replace("@"," ").replace("+"," ");
            System.out.println(sb1);
            String[] words = sb1.split(" ");
            for (int n = 0; n < words.length; n++)
                words[n] = words[n].trim();
            HashSet<String> wordsOne = new HashSet<>();
            for (int x = 0; x < words.length; x++)
                wordsOne.add(words[x]);
            Iterator<String> it = wordsOne.iterator();
            while (it.hasNext())
                System.out.println(it.next());

        System.out.println("количество уникальных слов: "+wordsOne.size());
        System.out.println("директорий поиска: "+dirjava);
        for (int i=0; i<s.length; i++)
            System.out.println("использовался .java файл: "+s[i]);
        }
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