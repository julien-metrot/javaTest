import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        int age = 0;
        boolean ageValidation = false;
        while (!ageValidation) {
            try {
                System.out.print("Please enter your age: ");
                age = Integer.parseInt(scanner.nextLine());
                ageValidation = true;
            } catch (Exception e) {
                System.out.println("Age was invalid.");
            }
        }

        final int monthsInYear = 12;
        final int percent = 100;

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest / percent / monthsInYear;

        System.out.print("Period in Years: ");
        int years = scanner.nextInt();
        int numberOfPayments = years * monthsInYear;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Here is your info.");
        System.out.print("-----------------");
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mortgage: " + mortgageFormatted);
        System.out.print("-----------------");
    }
}