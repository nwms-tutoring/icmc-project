package project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = project.RandomNumberGenerator.random(100, 999);
        System.out.println("I've picked a random 3 digit number. Try to guess it!");
        boolean bool = true;


        while (true) {
            System.out.print("Your guess: ");
            int guess = scan.nextInt();

            if (guess == num) {
                System.out.println("You got it!");
                break;
            } else if (guess < num) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        
    }
}

