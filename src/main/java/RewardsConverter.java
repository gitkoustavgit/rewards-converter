import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.println("Please enter a cash value to convert to airline miles: ");
            var input_value = scanner.nextLine();
            double cashValue;
            try {
                cashValue = Double.parseDouble(input_value);
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a double, exiting");
                return;
            }
            System.out.println("Please enter the miles conversion rate: ");
            var input_rate = scanner.nextLine();
            double milesConversionRate;
            try {
                milesConversionRate = Double.parseDouble(input_rate);
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input rate as a double, exiting.");
                return;
            }
            System.out.println("converting $" + input_value + " to miles");
            var rewardsValue = new RewardValue(cashValue,milesConversionRate);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        }
    }
}
