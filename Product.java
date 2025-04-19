1.2  Product .java
import java.util.Scanner;

public class ProductMain {
    
    // Product class
    static class Product {
        int pid;
        double price;
        int quantity;

        // Parameterized constructor
        Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID, price, and quantity for product " + (i + 1) + ":");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        // Display results
        System.out.println("\nProduct with the highest price has PID: " + maxPid);
        System.out.println("Total amount spent on all products: " + calculateTotal(products));

        sc.close();
    }
}

