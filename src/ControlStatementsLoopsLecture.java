import java.util.Objects;
import java.util.Scanner;

public class ControlStatementsLoopsLecture {

    public static void main(String[] args) {

//        // CONTROL STATEMENTS
//        // allows us to control the flow of the code
//        // operators - tools needed to control the flow
//        // ==, !=, >, <, <=, >= ---> operators
//
//        // boolean expression
//        // java statement that results in either true or false
//
//        int myFavoriteNumber = 13;  // statement
//        boolean yOrN = myFavoriteNumber > 0;  // result in a boolean
//
//        System.out.println(yOrN);
//
//        // logical operators
//        // &&, ||, &, |, !
//
//        int age = 40;
//        int bmi = 20;
//        String hair = "curly";
//        if(hair == ("curly")) {
//            System.out.println("fun times!!");
//        } else {
//            System.out.println("other");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//        // Don't do this!
////        boolean confirmation = userInput == "y";

//        if(userInput.equals("y")) {
//            System.out.println("yes, continue");
//        } else {
//            System.out.println("don't continue");
//        }
//
//        String myName = "Jason";
//        String yourName = "jason";
//
//        boolean nameMatching = myName.equals(yourName);
//        System.out.println(nameMatching); // false
//        boolean nameNoCase = myName.equalsIgnoreCase(yourName);
//        System.out.println(nameNoCase); // true
//
//        boolean bothNanes = myName.equals(yourName);
//        System.out.println(bothNanes); // false

        // LOOPS
        // iterating through an array

        // for
//        for(int i = 0; i < 10; i++) {
//            System.out.println("i is currently at: " + i);
//        }

        //while
        // not sure how many times it will loop
        // check the condition first before it starts looping
        int i = 0;
        int counter = 0;
        while (i < 10) {
            i++;
            System.out.println("i is: " + i);

            if(i % 2 == 0) {
                counter += 2;

                continue;
            }
            System.out.println("counter: " + counter);

        }


        // do while
        // executes code once before checking
        int j = 0;
        do {
            System.out.println("j: " + j);
            j++;
        } while (j < 10);

    }
}
