package project;
import java.util.Random;

public class RandomNumberGenerator {
    public static int random(int min, int max) {
         // Inclusive lower bound
         // Inclusive upper bound

        Random random = new Random();
        // Generates a random integer between min (inclusive) and max (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;

        return randomNumber;
    }
    public static void main(String[] args) {
        int randomNum = random(100, 999);
        // simple 3 digit random number 
    }
}
