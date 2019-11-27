import java.util.Random;
import java.util.Scanner;

public class CommandLineGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 0 and 100, guess what it is: ");
        int number = random.nextInt(100);
        int guessNum = scanner.nextInt();
        int tryCount = 0;
        boolean won = true;

        while (guessNum != number) {
            if (guessNum < number) {
                System.out.println("LO");
            } else {
                System.out.println("HI");
            }
            guessNum = scanner.nextInt();
            tryCount++;
            if (tryCount >= 10) {
                System.out.println("Sorry, you lost the game...");
                won = false;
                break;
            }
        }

        if (won) {
            System.out.println("Congratulations! You won the game!");
        }
    }
}
