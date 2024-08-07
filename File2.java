import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

class TestMain1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("data.txt");
            FileInputStream fin = new FileInputStream(f1);
            String data = " ";
            int count = 0;
            while (true) {
                int x = fin.read();
                if (x == 't') {
                    count++;
                }
                if (x == -1) {
                    break;
                }
                data = data + (char) x;
            }
            System.out.println(count);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
