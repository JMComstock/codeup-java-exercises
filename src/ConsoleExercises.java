import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        //1. TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <-- ");

        //TODO:  What happens if you input something that is not an integer?
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ConsoleExercises.main(ConsoleExercises.java:12)

        //2. TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println("Your first entry is: " + userInput1 + " Your second entry is: " + userInput2 + " Your third entry is: " + userInput3 );


        //TODO: What happens if you enter less than 3 words?

        // the console cursor moves to the next line awaiting the last inputs

        //TODO: What happens if you enter more than 3 words?

        // the console displays the first 3 words you type

        //3. TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.println(("The sentence you entered is: " + userSentence));


        //do you capture all the words?

        // only the first word is captured in the sentence that is typed

//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(("The sentence you entered is: " + userSentence));

        // CALCULATE THE PERIMETER AND AREA OF CODEUP'S CLASSROOMS

        //1. TODO: Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

        System.out.print("Enter numeric values of the length, width and height of the classroom at Codeup respectively: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("The length of the classroom is: " + length + ". The width of the classroom is: " + width + ". The height of the classroom is: " + height);

        //2. TODO: Display the area and perimeter of that classroom.
        System.out.println("The area of the classroom is: " + (length * width));
        System.out.println("The perimeter of the classroom is: " + ( (length*2) + (width*2) ));

        // BONUSES

        //TODO: In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.

        System.out.println("The volume of the classroom is: " + (length * width * height));


        //How does this change the way your program operates?

            // you can enter multiple inputs

    }
}
