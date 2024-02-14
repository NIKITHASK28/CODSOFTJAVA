import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int Guessnumber = rand.nextInt(100) + 1;
        Scanner nk = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = nk.nextInt();

            if (guess == Guessnumber) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < Guessnumber) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }

        nk.close();
    }
}