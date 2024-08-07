import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;

class TestMain3 {
    public static void main(String[] args) {
        int total = 0;
        try {
            File f1 = new File("data.txt");
            FileInputStream fin = new FileInputStream(f1);
            String line = " ";
            int count = 0;

            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);
            while ((line = br.readLine()) != null) {
                String words[] = line.split("");
                count += words.length;
                for (String word : words) {
                    total += word.length();
                }
                count = count + words.length;
            }
            System.out.println(count);
            System.out.println(total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}