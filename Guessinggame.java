import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number
        
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        int guessedNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (guessedNumber != randomNumber) {
            System.out.print("Enter your guess (between 1 and 100): ");
            guessedNumber = scanner.nextInt(); // Read user input
            attempts++; // Increment the attempts counter

            // Check if the guess is valid
            if (guessedNumber < 1 || guessedNumber > 100) {
                System.out.println("Please enter a valid number between 1 and 100.");
                attempts--; // Do not count invalid attempts
                continue; // Skip the rest of the loop
            }

            // Provide feedback on the guess
            if (guessedNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}