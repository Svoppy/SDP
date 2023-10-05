public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        // Implement PayPal payment logic here
        System.out.println("Paid $" + amount + " with PayPal using email: " + email);
    }
}