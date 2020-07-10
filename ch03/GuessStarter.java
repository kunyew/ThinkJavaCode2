import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        // introduce the guessing game
        System.out.println("I'm thinking of a number between 1 and 100 (including both). " +
                "Can you guess what it is? ");

        // ask for input
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guess = in.nextInt();
        System.out.println("Your Guess is: " + guess);

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);
        int diff = Math.abs(guess - number);
        System.out.println("You were off by: " + diff);

    }

}

