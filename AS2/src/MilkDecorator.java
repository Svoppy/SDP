public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
        description = "Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
