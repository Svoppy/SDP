import java.util.ArrayList;
import java.util.List;

public class OrderStatusSystem {
    private List<OrderStatusObserver> observers = new ArrayList<>();

    public void addObserver(OrderStatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderStatusObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Order order) {
        for (OrderStatusObserver observer : observers) {
            observer.update(order);
        }
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
        notifyObservers(order);
    }
}
