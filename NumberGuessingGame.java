import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String choice = "yes";
        int round = 1;

        while (choice.equalsIgnoreCase("yes")) {

            int number = r.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nRound " + round);
            System.out.println("Guess a number between 1 and 100");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {
                    System.out.println("Correct!");
                    System.out.println("You guessed it in "
                            + attempts + " attempts.");
                    break;
                }

                if (guess > number) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                System.out.println("Attempts left: "
                        + (maxAttempts - attempts));

                if (attempts == maxAttempts) {
                    System.out.println("You Lost!");
                    System.out.println("The number was: " + number);
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            choice = sc.next();

            round++;
        }

        System.out.println("\nGame Over!");
        System.out.println("Thank you for playing.");

        sc.close();
    }
}