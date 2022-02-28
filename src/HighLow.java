
// TODO: Game Development 101
//    The specs for the game are:
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"

import java.util.Objects;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        String userAnswer = null;
        int userGuess;
        int randNum;

        // define the range
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int count = 0;

        // generate random numbers within 1 to 100
        randNum = 0;
        for (int i = 0; i < 10; i++) {
            randNum = (int) (Math.random() * range) + min;
        }
//         show answer
//        System.out.println(randNum);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the random number from 1 to 100 (you have 3 chances): ");
            userGuess = scanner.nextInt();
            count++;

            if (userGuess < randNum) {
                System.out.println("HIGHER");
            } else if (userGuess > randNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }

        } while (userGuess != randNum && count != 3);
    }
}
