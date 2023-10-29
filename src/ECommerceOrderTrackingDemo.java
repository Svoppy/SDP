public class ECommerceOrderTrackingDemo {
    public static void main(String[] args) {
        OrderStatusSystem orderStatusSystem = new OrderStatusSystem();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        orderStatusSystem.addObserver(customer1);
        orderStatusSystem.addObserver(customer2);

        OrderFactory standardOrderFactory = new StandardOrderFactory();
        OrderFactory expeditedOrderFactory = new ExpeditedOrderFactory();

        Order standardOrder = standardOrderFactory.createOrder();
        Order expeditedOrder = expeditedOrderFactory.createOrder();

        orderStatusSystem.updateOrderStatus(standardOrder, "Shipped");
        orderStatusSystem.updateOrderStatus(expeditedOrder, "Out for Delivery");
    }
}
