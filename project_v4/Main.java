package project_v4;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int random1 = project_v4.RandomNumberGenerator.random(1, 75);
            int random2 = project_v4.RandomNumberGenerator.random(1, 75);
            int random3 = project_v4.RandomNumberGenerator.random(1, 75);
            int operator1 = project_v4.RandomNumberGenerator.random(1, 4);
            int operator2 = project_v4.RandomNumberGenerator.random(1, 4);

            if (operator1 == 1 && operator2 == 1) {
                double answer = Math.round(random1 + random2 + random3);
                System.out.println(random1 + "+" + random2 + "+" + random3 + " = " + answer);
            }
            else if (operator1 == 2 && operator2 == 1) {
                double answer = Math.round(random1 - random2 + random3);
                System.out.println(random1 + "-" + random2 + "+" + random3 + " = " + answer);
            }
            else if (operator1 == 3 && operator2 == 1) {
                double answer = Math.round((random1 * random2) + random3);
                System.out.println(random1 + "x" + random2 + "+" + random3 + " = " + answer);
            }
            else if (operator1 == 4 && operator2 == 1) {
                double answer = ((double) random1 / random2) + random3;
                System.out.println(random1 + "/" + random2 + "+" + random3 + " = " + answer);
            }
            else if (operator1 == 1 && operator2 == 2) {
                double answer = random1 + random2 - random3;
                System.out.println(random1 + "+" + random2 + "-" + random3 + " = " + answer);
            }
            else if (operator1 == 2 && operator2 == 2) {
                double answer = random1 - random2 - random3;
                System.out.println(random1 + "-" + random2 + "-" + random3 + " = " + answer);
            }
            else if (operator1 == 3 && operator2 == 2) {
                double answer = (random1 * random2) - random3;
                System.out.println(random1 + "x" + random2 + "-" + random3 + " = " + answer);
            }
            else if (operator1 == 4 && operator2 == 2) {
                double answer = ((double) random1 / random2) - random3;
                System.out.println(random1 + "/" + random2 + "-" + random3 + " = " + answer);
            }
            else if (operator1 == 1 && operator2 == 3) {
                double answer = random1 + (random2 * random3);
                System.out.println(random1 + "+" + random2 + "x" + random3 + " = " + answer);
            }
            else if (operator1 == 2 && operator2 == 3) {
                double answer = random1 - (random2 * random3);
                System.out.println(random1 + "-" + random2 + "x" + random3 + " = " + answer);
            }
            else if (operator1 == 3 && operator2 == 3) {
                double answer = (random1 * random2 * random3);
                System.out.println(random1 + "x" + random2 + "x" + random3 + " = " + answer);
            }
            else if (operator1 == 4 && operator2 == 3) {
                double answer = ((double) random1 / random2) * random3;
                System.out.println(random1 + "/" + random2 + "x" + random3 + " = " + answer);
            }
            else if (operator1 == 1 && operator2 == 4) {
                double answer = random1 + ((double) random2 / random3);
                System.out.println(random1 + "+" + random2 + "/" + random3 + " = " + answer);
            }
            else if (operator1 == 2 && operator2 == 4) {
                double answer = random1 - ((double) random2 / random3);
                System.out.println(random1 + "-" + random2 + "/" + random3 + " = " + answer);
            }
            else if (operator1 == 3 && operator2 == 4) {
                double answer = (random1 * random2) / (double) random3;
                System.out.println(random1 + "x" + random2 + "/" + random3 + " = " + answer);
            }
            else if (operator1 == 4 && operator2 == 4) {
                double answer = ((double) random1 / random2) / random3;
                System.out.println(random1 + "/" + random2 + "/" + random3 + " = " + answer);
            }
        }
    }
}
