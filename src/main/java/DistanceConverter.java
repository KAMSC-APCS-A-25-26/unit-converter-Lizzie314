import java.util.Scanner;

public class DistanceConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run)  
        {
            System.out.println("\nChoose conversion direction: ");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");  
            System.out.println("Enter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.println("\nEnter distance in miles: ");
                    double miles = sc.nextDouble();
                    if (miles == 0)
                    {
                        System.out.println("Invalid input");
                    }
                    else
                    {
                        System.out.println("\nConversion Results:");
                        System.out.println("Miles: " + miles);
                        double kilometers = miles * 1.60935;
                        System.out.println("Kilometers: " + kilometers);
                    }
                    break;
                }

                case 2:
                {
                    System.out.println("\nEnter distance in kilometers: ");
                    double kilos = sc.nextDouble();
                    if (kilos == 0)
                    {
                        System.out.println("Invalid input");
                    }
                    else
                    {
                        System.out.println("\nConversion Results: ");
                        System.out.println("Kilometers: " + kilos);
                        double mil = kilos / 1.60935;
                        System.out.println("Miles: " + mil);
                    }
                    break;
                }

                case 3:
                {
                    System.out.println("\nGoodbye!");
                    run = false;
                    break;
                }

                default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }

        }
    }
}