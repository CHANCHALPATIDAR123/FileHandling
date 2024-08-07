package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("output.txt");
        String str = "java is independent language";
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println(fw);
        System.out.println("writing successful");
        fw.close();
    }
}
