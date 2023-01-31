import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int divFive = 5;
        int divThree = 3;
        while (true) {
            try {
                System.out.print("Enter a number\nType \"stop\" to stop\nNumber: ");
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("stop")) {
                    break;
                } else if ((Integer.parseInt(userInput) % divFive) == 0 && (Integer.parseInt(userInput) % divThree) == 0) {
                    System.out.println("FizzBuzz");
                } else if (Integer.parseInt(userInput) % divThree == 0) {
                    System.out.println("Buzz");
                } else if (Integer.parseInt(userInput) % divFive == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(userInput);
                    System.out.println("Number is not divisible. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Number. Please enter an Integer.");
            }
        } // End of While loop
    }
}