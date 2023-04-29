package Projects;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guesses = 0;

        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
        System.out.println("Enter 'q' to quit.");

        while (true) {
            System.out.print("Enter your guess: ");
            String input = sc.nextLine();

            if (input.equals("q")) {
                System.out.println("The number was " + number);
                break;
            }

            int guess = Integer.parseInt(input);
            guesses++;

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("You guessed it in " + guesses + " tries!");
                break;
            }
        }
    }
}