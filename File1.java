
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

class TestMain {
    public static void main(String[] args) {
        try {
            File f = new File("data.txt");
            FileOutputStream fout = new FileOutputStream(f);
            String data = "Java is simple and its a plateform independents";
            byte b[] = data.getBytes();
            fout.write(b);
            System.out.println("Opertion Sucessfully......");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File f1 = new File("data.txt");
            FileInputStream fin = new FileInputStream(f1);
            String data = " ";
            while (true) {
                int x = fin.read();
                if (x == -1) {
                    break;
                }
                data = data + (char) x;
            }

            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
