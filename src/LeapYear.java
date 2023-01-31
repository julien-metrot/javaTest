import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Enter a year to check if it is a leap year.\nType \"stop\" to stop: ");
                Scanner input = new Scanner(System.in);
                String year = input.nextLine();
                if (year.equalsIgnoreCase("stop")) {
                    break;
                } else if ((Integer.parseInt(year) % 100 == 0 && Integer.parseInt(year) % 400 == 0) || (Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0)) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}