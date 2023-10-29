public class Customer implements OrderStatusObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println(name + ": Order " + order.getId() + " - Status: " + order.getStatus());
    }
}
