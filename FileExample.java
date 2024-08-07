package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("chanchal.txt");
        // check if the file exists
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not exits");
        }
        // create a new file
        try {
            if (file.createNewFile()) {
                System.out.println("file is create");
            } else {
                System.out.println("file already created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // get file information
        if (file.exists()) {
            System.out.println("File Name:" + file.getName());
            System.out.println("AbsolutePath :" + file.getAbsolutePath());

            System.out.println("writable:" + file.canRead());
            System.out.println("file size in byte:" + file.length());

        }
        // Delete the file
        if (file.delete()) {
            System.out.println("file deleted");
        } else {
            System.out.println("failed deletedd the file");
        }
    }
}
