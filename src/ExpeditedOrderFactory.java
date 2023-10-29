public class ExpeditedOrderFactory extends OrderFactory {
    @Override
    public Order createOrder() {
        orderId++;
        return new Order(orderId);
    }
}
