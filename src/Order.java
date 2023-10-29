public class Order {
    private int id;
    private String status;

    public Order(int id) {
        this.id = id;
        this.status = "Order Placed";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
