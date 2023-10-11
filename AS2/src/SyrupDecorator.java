public class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
        description = "Syrup";
    }

    @Override
    public double cost() {
        // Add the cost of sugar to the base cost
        return coffee.cost() + 0.25;
    }
}
