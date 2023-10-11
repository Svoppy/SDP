public class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
