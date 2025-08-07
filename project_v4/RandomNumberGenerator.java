package project_v4;
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
    
}