public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void processPayment(double amount) {
        // Implement credit card payment logic here
        System.out.println("Paid $" + amount + " with Credit Card ending in " + cardNumber);
    }
}


