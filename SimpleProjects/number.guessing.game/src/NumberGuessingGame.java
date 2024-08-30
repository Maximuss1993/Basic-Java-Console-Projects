import java.util.Scanner;

public class NumberGuessingGame {

        /* This is a number guessing game with a limit of 7 attempts.
    I will think of a number between 1 and 50, and you need to guess
    which number I am thinking of. For each attempt, I will help you
    by telling you whether the number I am thinking of is higher or lower.
     */

    public static void main(String[] args) {

        final int MAX_ATTEMPTS = 7; // This is constant which represent limit of 7 attempts for guessing number.

        int randomNumber = (int) (50 * Math.random());

        System.out.println("I will think of a number between 1 and 50...");
        System.out.println("Can you guess which number I am thinking of?");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");
        Scanner userInput = new Scanner(System.in);

        for (int i =1; i <= MAX_ATTEMPTS; i++){
            int usersNumber = userInput.nextInt();

            if (usersNumber == randomNumber){
                System.out.println("Very well, you guessed my number at " + i + " attempt!");
                break;
            } else if (usersNumber>randomNumber){
                System.out.println("Help: I am thinking of smaller number.");
                System.out.println("You have " + (MAX_ATTEMPTS-i) + " more attempts.");
                continue;
            } else if (usersNumber<randomNumber){
                System.out.println("Help: I am thinking of bigger number.");
                System.out.println("You have " + (MAX_ATTEMPTS-i) + " more attempts.");
                if ((MAX_ATTEMPTS-i) == 0){
                    System.out.println("My number was: " + randomNumber);
                }
                continue;
            }
        }
        System.out.println("End of the game....");
    }
}