import java.util.ArrayList;
import java.util.List;

// Step 1: Create a Product class
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Step 2: Create a PaymentStrategy interface
interface PaymentStrategy {
    void processPayment(double amount);
}