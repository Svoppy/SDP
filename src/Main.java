public class Main {
    public static void main(String[] args) {
        // Создайте экземпляр класса ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Добавьте продукты в корзину
        Product product1 = new Product("Product A", 20.0, 2);
        Product product2 = new Product("Product B", 15.0, 3);

        cart.addProduct(product1);
        cart.addProduct(product2);

        // Выберите стратегию оплаты
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com");

        // Выполните оплату с выбранной стратегией
        cart.checkout(creditCardPayment);
        cart.checkout(payPalPayment);
    }
}
