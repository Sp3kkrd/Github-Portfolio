package Projects;

import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Ask the players to enter an odd number of rounds
        System.out.print("Enter the number of rounds (odd number): ");
        int rounds = input.nextInt();

// Initialize the win counts for each player
        int player1Wins = 0;
        int player2Wins = 0;

// Loop through each round
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + ": ");

            // Player 1 selects a Pokémon and enters its stats
            System.out.print("Player 1, enter your Pokemon's name: ");
            String player1Pokemon = input.next();
            System.out.print("Enter hit points: ");
            int player1HitPoints = input.nextInt();
            System.out.print("Enter move: ");
            String player1Move = input.next();
            System.out.print("Enter move's power: ");
            int player1Power = input.nextInt();
            System.out.print("Enter attack speed: ");
            int player1Speed = input.nextInt();

            // Player 2 selects a Pokémon and enters its stats
            System.out.print("\nPlayer 2, enter your Pokemon's name: ");
            String player2Pokemon = input.next();
            System.out.print("Enter hit points: ");
            int player2HitPoints = input.nextInt();
            System.out.print("Enter move: ");
            String player2Move = input.next();
            System.out.print("Enter move's power: ");
            int player2Power = input.nextInt();
            System.out.print("Enter attack speed: ");
            int player2Speed = input.nextInt();

            // Determine the round's winner
            int player1Turn = 1;
            int player2Turn = 2;
            if (player1Speed > player2Speed) {
                player1Turn = 1;
                player2Turn = 2;
            } else if (player2Speed > player1Speed) {
                player1Turn = 2;
                player2Turn = 1;
            } else {
                int turn = random.nextInt(2) + 1;
                if (turn == 1) {
                    player1Turn = 1;
                    player2Turn = 2;
                } else {
                    player1Turn = 2;
                    player2Turn = 1;
                }
            }

            // Play the round
            while (player1HitPoints > 0 && player2HitPoints > 0) {
                if (player1Turn == 1) {
                    player2HitPoints -= player1Power;
                    if (player2HitPoints <= 0) {
                        System.out.println("\nPlayer 1 is the round winner");
                        player1Wins++;
                        break;
                    }
                    player1Turn = 2;
                    player2Turn = 1;
                } else {
                    player1HitPoints -= player2Power;
                    if (player1HitPoints <= 0) {
                        System.out.println("\nPlayer 2 is the round winner");
                        player2Wins++;
                        break;
                    }
                    player1Turn = 1;
                    player2Turn = 2;
                }
            }
        }

// Print the final scores
        System.out.println("\nFinal Scores:");
        System.out.println("Player 1: " + player1Wins + " wins");
        System.out.println("Player 2: " + player2Wins + " wins");

// Determine the overall game winner
        if (player1Wins > player2Wins) {
            System.out.println("\nPlayer 1 has won the game");
        } else if (player2Wins > player1Wins) {
            System.out.println("\nPlayer 2 has won the game");
        } else {
            System.out.println("\nThe game is a tie");
        }
    }
}
