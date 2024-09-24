import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("=== Basic Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Choose an operation: ");
            
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.printf("Result: %.2f\n", (num1 + num2));
                        break;
                    case 2:
                        System.out.printf("Result: %.2f\n", (num1 - num2));
                        break;
                    case 3:
                        System.out.printf("Result: %.2f\n", (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.printf("Result: %.2f\n", (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            System.out.printf("Result: %.2f\n", (num1 % num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                }
            } else if (choice != 6) {
                System.out.println("Invalid choice! Please try again.");
            }
            
            System.out.println();
        } while (choice != 6);
        
        System.out.println("Exiting the calculator. Goodbye!");
        scanner.close();
    }
}
