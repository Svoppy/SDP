import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double totalAmount = calculateTotal();
        paymentStrategy.processPayment(totalAmount);
        // Additional checkout logic here, like clearing the cart, generating an order, etc.
    }
}
