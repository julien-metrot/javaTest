import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int guessCount = 0;

        while (guessCount < 10) {
            System.out.print("Enter a guess between 1 and 100: ");
            guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number in " + guessCount + " tries!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Guess again.");
            } else {
                System.out.println("Too high. Guess again.");
            }
            guessCount++;
        }
        if (guessCount == 10) {
            System.out.println("Sorry, you ran out of tries. The number was " + numberToGuess + ".");
        }
    }
}