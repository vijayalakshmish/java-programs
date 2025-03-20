import java.util.Scanner;

public class dollarcent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first amount in dollars: ");
        int dollars1 = scanner.nextInt();

        System.out.print("Enter the first amount in cents: ");
        int cents1 = scanner.nextInt();

        System.out.print("Enter the second amount in dollars: ");
        int dollars2 = scanner.nextInt();

        System.out.print("Enter the second amount in cents: ");
        int cents2 = scanner.nextInt();

        // Convert to cents for easy addition
        int totalCents1 = dollars1 * 100 + cents1;
        int totalCents2 = dollars2 * 100 + cents2;

        // Calculate the sum
        int totalCentsSum = totalCents1 + totalCents2;
        int totalDollars = totalCentsSum / 100;
        int remainingCents = totalCentsSum % 100;

        // Display results
        System.out.println("Total Dollar: " + totalDollars);
        System.out.println("Total Cents: " + remainingCents);

        // Close scanner
        scanner.close();
    }
}
