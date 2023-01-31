import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        boolean validEmail = false;
        String email = "";
        while (!validEmail) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";
            Pattern pat = Pattern.compile(emailRegex);
            Matcher matcher = pat.matcher(email);
            if (matcher.matches()) {
                validEmail = true;
            } else {
                System.out.println("Invalid email address. Please enter a valid email address.");
            }
        }

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            try {
                System.out.print("Enter your age: ");
                age = Integer.parseInt(scanner.nextLine());
                validAge = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid number.");
            }
        }

        boolean validPhoneNumber = false;
        String phoneNumber = "";
        while (!validPhoneNumber) {
            System.out.print("Enter your phone number: ");
            phoneNumber = scanner.nextLine();

            String phoneRegex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
            Pattern pat = Pattern.compile(phoneRegex);
            Matcher matcher = pat.matcher(phoneNumber);
            if (matcher.matches()) {
                validPhoneNumber = true;
            } else {
                System.out.println("Invalid phone number. Please enter a valid phone number.");
            }
        }

        System.out.println("\nThank you for your information.");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
    }
}
