package project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = project.RandomNumberGenerator.random(100, 999);
        System.out.println("I've picked a random 3 digit number. Try to guess it! You get 25 guesses.");
        int guesses = 25;

        while (guesses <= 25) {
            System.out.print("Your guess: ");
            int guess = scan.nextInt();
            guesses--;  // Decrement guesses each time

            if (guess == num) {
                System.out.println("You got it! 🐂🐂🐂");
                break;
            } else if (guess < num) {
                System.out.println("Too low! " + guesses + " guesses left!");
            } else {
                System.out.println("Too high! " + guesses + " guesses left!");
            }
        }

        if (guesses == 0) {
            System.out.println("Out of guesses! The number was " + num + ".");
        }
    }
}

