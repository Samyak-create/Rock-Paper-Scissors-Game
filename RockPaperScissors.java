import java.util.*;

public class RockPaperScissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String rps[] = { "r", "p", "s" };
            String computerMove = rps[new Random().nextInt(rps.length)];

            // Declaring playerMove outside while loop so it can be used later
            String playerMove = "";

            while (true) {
                System.out.println("Please enter your move (r, p or s):");
                playerMove = sc.nextLine();

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break; // Valid move
                } else {
                    System.out.println(playerMove + " is an invalid move. Please try again.");
                }
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = sc.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break; // Exit the game loop
            }
        }

        sc.close(); // Close Scanner outside the loop
    }
}
