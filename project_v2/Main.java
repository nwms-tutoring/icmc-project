import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            int secretNumber = random(100, 999);
            Scanner scan = new Scanner(System.in);
            System.out.println("I've thought of a 3 digit number. Try to guess it! You get 6 attempts.");

            boolean guessed = false;

            for (int i = 0; i < 6; i++) {
                System.out.print("Your guess: ");

                // Check for input errors
                if (!scan.hasNextInt()) {
                    throw new Exception(); // non-number input
                }

                int guess = scan.nextInt();

                // Check if guess is 3 digits
                if (guess < 100 || guess > 999) {
                    throw new Exception(); // not a 3-digit number
                }

                String result = wordleLogic(guess, secretNumber);
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

    public static String wordleLogic(int guess, int secretnum) {
        String strNumber = String.valueOf(secretnum);
        String strGuess = String.valueOf(guess);

        String result = "";

        for (int i = 0; i < 3; i++) {
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
