import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ShoppingItem {
    private String itemName;
    private double price;
    private int quantity;

    public ShoppingItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " +
                quantity;
    }
}

class ShoppingDetails {

    public static void main(String[] args) {
        String filePath = "Shoping.bytes";
        ShoppingItem[] items = {
                new ShoppingItem("Apple", 0.99, 10),
                new ShoppingItem("Bread", 2.49, 2),
                new ShoppingItem("Milk", 1.89, 3)
        };
        try {
            writeShopping(filePath, items);
            System.out.println("Shopping details written to " + filePath);
            System.out.println("completed write opretion.........!");
            System.out.println(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ShoppingItem[] readItem = readShopping(filePath);
            System.out.println("Shopping details read from " + filePath);
            for (ShoppingItem item : readItem) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeShopping(String filePath, ShoppingItem[] items) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(items.length);
            for (ShoppingItem item : items) {
                dos.writeUTF(item.getItemName());
                dos.writeDouble(item.getPrice());
                dos.writeInt(item.getQuantity());
            }
        }
    }

    public static ShoppingItem[] readShopping(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int numItems = dis.readInt();
            ShoppingItem[] items = new ShoppingItem[numItems];
            for (int i = 0; i < numItems; i++) {
                String itemName = dis.readUTF();
                double price = dis.readDouble();
                int quantity = dis.readInt();
                items[i] = new ShoppingItem(itemName, price, quantity);
            }
            return items;
        }
    }
}
