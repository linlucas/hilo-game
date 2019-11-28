import java.util.Random;
import java.util.Scanner;

public class CommandLineGame {
    public static void main(String[] args) {
        game(10,1);
    }

    public static void game(int tryLimit, int level) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("I'm thinking of a number between 0 and 100, guess what it is: ");
        int number = random.nextInt(100);
        int guessNum = scanner.nextInt();
        boolean won = true;
        int tryCount = 0;

        while (guessNum != number) {
            if (guessNum < number) {
                System.out.println("LO");
            } else {
                System.out.println("HI");
            }
            guessNum = scanner.nextInt();
            tryCount++;
            if (tryCount >= tryLimit) {
                System.out.println("Sorry, you lost the game...");
                won = false;
                break;
            }
        }

        if (won) {
            game(tryLimit-1,level++);
            score += level*10;
            score += (10-tryCount)*5;
        }
        System.out.println("Congratulations! You won the game!");
        System.out.println(score);
    }
}
