public class StandardOrderFactory extends OrderFactory {
    @Override
    public Order createOrder() {
        orderId++;
        return new Order(orderId);
    }
}
