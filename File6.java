import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

class TestMain4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("data.txt");
            FileInputStream fin = new FileInputStream(f1);
            String data = " ";
            int count = 0;
            int x = 0;
            while (true) {
                x = fin.read();
                if ((char) x == ' ' || (char) x == '.') {
                    count++;
                } else if (x == -1) {
                    break;
                }
                data = data + (char) x;
            }
            System.out.println(count);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
