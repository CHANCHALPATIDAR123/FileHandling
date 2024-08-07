import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class File4 {

    public static void main(String[] args) {
        String filePath = "E:\\IO\\gellary3.jpg";
        int speed = 256;

        try {
            long fileSizeBytes = countBytesInImage(filePath);
            System.out.println("File size: " + fileSizeBytes + " bytes");

            double time = calculateUploadTime(fileSizeBytes, speed);
            System.out.println("Time to upload the file: " + time + " seconds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long countBytesInImage(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            throw new IOException("No file: '" + filePath + "'");
        }

        return Files.size(file.toPath());
    }

    public static double calculateUploadTime(long fileSizeBytes, int speed) {
        long size = fileSizeBytes * 8/speed; // Convert bytes to bits
        return (double) size;
    }
}
