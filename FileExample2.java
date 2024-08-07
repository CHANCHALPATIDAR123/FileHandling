package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileExample2 {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        String fileContent = "hello,this is test file";
        // create and write to the file
        try (FileWriter writer1 = new FileWriter(fileName)) {
            writer1.write(fileContent);
            System.out.println("file written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Read the data
        try (FileReader reader = new FileReader(fileName)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
