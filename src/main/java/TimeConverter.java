import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run)
        {
            System.out.println("\nConvert time to total seconds");
            System.out.println("Enter hours: ");
            System.out.println("Enter minutes: ");
            System.out.println("Enter seconds: ");
            int hours = sc.nextInt();
            int mins = sc.nextInt();
            int secs = sc.nextInt();
            System.out.println("\nTime Conversion: ");
            System.out.println("Input: " + hours + " hour," + mins + " minute, and" + secs + " second");
            int totalsecs = (hours * 3600) + (mins * 60) + secs;
            System.out.println("Total seconds: " + totalsecs + " seconds");
            System.out.println("\nCalculation: ");
            int hs = hours * 3600;
            System.out.println(hours + " hours * 3600 = " + hs + " seconds");
            int ms = mins * 60;
            System.out.println(mins + " minutes * 60 = " + ms + " seconds");
            System.out.println(secs + " seconds = " + secs + " seconds");
            System.out.println("Total: " + totalsecs + " seconds");
            System.out.println("\nDo you want to convert another time? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n') {
                System.out.println("Goodbye!");
                run = false;
            }


        }
    }
}