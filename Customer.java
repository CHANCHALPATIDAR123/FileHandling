import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    transient private String contact;
    private int age;

    public Customer(int id, String name, String contact, int age) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.age = age;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public int getAge() {
        return age;
    }
}

class TestMain2 {
    public static void main(String[] args) {
        try {
            File file = new File("Costomer1.txt");
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            Customer c = new Customer(100, "chanchal", "9301845537", 22);
            oos.writeObject(c);
            System.out.println("opertion successfully......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
