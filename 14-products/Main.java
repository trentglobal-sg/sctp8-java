import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner sc;
    private static ArrayList<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (true) {
            int choice = displayMenu();
            if (choice == 1) {
                addNewProduct();
            }
            if (choice == 2) {
                displayProducts();
            }
            // choice 3 is quit
            if (choice == 3) {
                break;
            }
        }

    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear the input buffer
            if (choice >= 1 && choice <= 3) {
                break;
            }
        }

        return choice;

    }

    private static void addNewProduct() {
        System.out.println();
        System.out.println("Adding New Product");
        System.out.println("Enter the name of the product");
        String productName = sc.nextLine();
        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();
        sc.nextLine(); // clear the buffer
        System.out.println("Enter the SKU of the product");
        String sku = sc.nextLine();

        Product newProduct = new Product(productName, price, sku);
        productList.add(newProduct);
    }

    private static void displayProducts() {
        System.out.println("Display All Products");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}