package Week1.DataStructuresAndAlgorithms.InventoryManagementSystem;

public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));

        inventory.addProduct(new Product(102, "Mouse", 50, 700));

        inventory.addProduct(new Product(103, "Keyboard", 20, 1500));

        System.out.println("\nInventory:");

        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 45, 900);

        inventory.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");

        inventory.displayProducts();
    }
}
