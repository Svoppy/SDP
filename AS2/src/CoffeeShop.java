import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new Latte();  // Start with a base coffee

        System.out.println("Your coffee order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.cost());

        while (true) {
            System.out.println("\nAdd to your coffee (1 - Milk, 2 - Syrup, 3 - Finish):");
            int choice = scanner.nextInt();

            if (choice == 1) {
                coffee = new MilkDecorator(coffee);  // Add milk
            } else if (choice == 2) {
                coffee = new SyrupDecorator(coffee);  // Add syrup
            } else if (choice == 3) {
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Your coffee order: " + coffee.getDescription());
            System.out.println("Cost: $" + coffee.cost());
        }

        System.out.println("Enjoy your final coffee: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.cost());

        scanner.close();
    }
}
