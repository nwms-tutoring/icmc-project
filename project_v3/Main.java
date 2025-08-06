import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("This is a Wordle style guessing game. What do you want the difficulty to be? 1 for easy, 2 for medium, 3 for hard.");
            int difficulty = scan.nextInt();

            // Validate difficulty
            if (difficulty < 1 || difficulty > 3) {
                throw new Exception(); // invalid difficulty
            }

            // Set number of digits based on difficulty
            int digits = difficulty + 1; // easy=2, medium=3, hard=4
            int min = (int) Math.pow(10, digits - 1); // smallest number with that many digits
            int max = (int) Math.pow(10, digits) - 1; // largest number with that many digits

            // Generate secret number
            int secretNumber = random(min, max);
            System.out.println("I've thought of a " + digits + "-digit number. Try to guess it! You get 10 attempts.");

            boolean guessed = false;

            for (int i = 0; i < 10; i++) {
                System.out.print("Your guess: ");

                // Check for input errors
                if (!scan.hasNextInt()) {
                    throw new Exception(); // non-number input
                }

                int guess = scan.nextInt();

                // Check if guess has correct number of digits
                if (guess < min || guess > max) {
                    throw new Exception(); // not correct digit length
                }

                String result = wordleLogic(guess, secretNumber, digits);
                System.out.println(result);

                if (guess == secretNumber) {
                    System.out.println("You got it!");
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("You lose! The correct number was: " + secretNumber);
            }

        } catch (Exception e) {
            System.out.println("Error: Not a valid input.");
        }
    }

    public static String wordleLogic(int guess, int secretnum, int digits) {
        String strNumber = String.valueOf(secretnum);
        String strGuess = String.valueOf(guess);

        String result = "";

        for (int i = 0; i < digits; i++) {
            if (strGuess.charAt(i) == strNumber.charAt(i)) {
                result += "[✓] "; // correct position
            } else if (strNumber.contains("" + strGuess.charAt(i))) {
                result += "[~] "; // correct digit wrong position
            } else {
                result += "[X] "; // wrong digit
            }
        }

        return result;
    }

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
