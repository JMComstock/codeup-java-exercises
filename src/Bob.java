import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        String userAnswer;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Talk to Bob... ask him a question (end with a '?'), yell at him (end with a '!'), or say nothing at all and see what he says ");
            String userInput = scanner.nextLine();

            if(userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                return;
            }


            System.out.println();
            System.out.println("Do you want to keep chatting with Bob? (answer yes or no): ");
            userAnswer = scanner.next();

        } while (userAnswer.equals("yes") || userAnswer.equals("Yes"));
    }
}
