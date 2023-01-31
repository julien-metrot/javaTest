import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;

        String[] questions = {
                "What is the capital of France?",
                "What is the largest planet in our solar system?",
                "Who wrote the novel 'Pride and Prejudice'?"
        };
        String[][] options = {
                {"Paris", "Rome", "Madrid", "Berlin"},
                {"Earth", "Jupiter", "Mars", "Saturn"},
                {"Jane Austen", "George Orwell", "Charles Dickens", "Mark Twain"}
        };
        int[] answers = {0, 1, 0};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i+1) + ": " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j+1) + ". " + options[i][j]);
            }
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            if (choice - 1 == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + (answers[i] + 1));
            }
            System.out.println();
        }
        System.out.println("Your final score is " + score + " out of " + questions.length);
    }
}
