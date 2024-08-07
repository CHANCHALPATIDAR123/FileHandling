package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileXample3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println((line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
