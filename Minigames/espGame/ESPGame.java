package Projects;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        int correctGuesses = 0;

        for (int i = 0; i < 10; i++) {
            int randomColor = rand.nextInt(5);
            System.out.print("Guess the color: ");
            String guess = sc.nextLine();

            if (guess.equalsIgnoreCase(colors[randomColor])) {
                correctGuesses++;
            }

            System.out.println("The color was " + colors[randomColor]);
        }

        System.out.println("Number of correct guesses: " + correctGuesses);
    }
}