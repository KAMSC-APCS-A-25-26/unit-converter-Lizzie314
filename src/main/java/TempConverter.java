import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\nChoose conversion direction: ");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("\nEnter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter temperature in Fahrenheit: ");
                    double temp1 = sc.nextDouble();
                    System.out.println("\nConversion Results: ");
                    System.out.println("Fahrenheit: " + temp1);
                    double celsius = (temp1 - 32) * 5/9;
                    System.out.println("Celsius: " + celsius);
                    break;
                }

                case 2: {
                    System.out.println("Enter temperature in Celsius: ");
                    double temp2 = sc.nextDouble();
                    System.out.println("\nConversion Results: ");
                    System.out.println("Celsius: " + temp2);
                    double fahrenheit = temp2 * 9 / 5 + 32;
                    System.out.println("Fahrenheit: " + fahrenheit);
                    break;
                }

                case 3: {
                    System.out.println("\nGoodbye!");
                    run = false;
                    break;
                }

                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
    }
}

