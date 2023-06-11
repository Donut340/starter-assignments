import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (// Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for their choice
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine();
            
            // Generate a random number (0, 1, or 2) for the computer's choice
            Random random = new Random();
            int computerChoice = random.nextInt(3);
            
            // Map the random number to rock, paper, or scissors for the computer's choice
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoiceString = choices[computerChoice];
            
            // Print the user's choice and the computer's choice
            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoiceString);
            
            // Compare the choices to determine the winner
            if (userChoice.equalsIgnoreCase(computerChoiceString)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("rock") && computerChoiceString.equals("scissors")) ||
                       (userChoice.equalsIgnoreCase("paper") && computerChoiceString.equals("rock")) ||
                       (userChoice.equalsIgnoreCase("scissors") && computerChoiceString.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
