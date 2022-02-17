import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // WHILE
        //TODO: Create an integer variable i with a value of 5.
        //TODO: Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:
        // 5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


        // TODO: Refactor the previous two exercises to use a for loop instead.
//        for ( int i = 5; i <= 15; i++) {
//            System.out.print("i is: " + i + ", ");
//            if( i == 15) {
//                System.out.format("%n");
//            }
//        }

        //DO WHILE
        // TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // TODO: Alter your loop to count backwards by 5's from 100 to -10.

//        int j;
//        do {
//            for (j = 100; j <= 100 && j >= -5; j -= 5) {
//                System.out.println(j);
//            }
//        } while (j <= 100 && j >= -5);

        // TODO: Refactor the previous two exercises to use a for loop instead.
//        for ( int j = 0; j <= 100; j += 2) {
//            System.out.println("j is: " + j);
//        }

        // TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        // 2
        // 4
        // 16
        // 256
        // 65536

//        long t = 2L;
//        do {
//            System.out.println(t);
//            t*=t;
//        } while (t < 1000000);

        // TODO: Refactor the previous two exercises to use a for loop instead.
//        long k = 2L;
//        for (k = 2; k <= 1000000; k*=k) {
//            System.out.println("k is: " + k);
//        }

        // FIZZBUZZ
        // TODO: Write a program that prints the numbers from 1 to 100.
        for ( int i = 1; i <= 100; i++) {
            System.out.println("i is: " + i);
        }

        // TODO: For multiples of three: print “Fizz” instead of the number.
        // TODO: For the multiples of five: print “Buzz”.
        // TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.

        for(int k = 1; k <= 100; k++) {
            if (k % 15 == 0) {
                System.out.println("FizzBuzz" + " ");
            }
            else if(k % 3 == 0) {
                System.out.println("Fizz" + " ");
            } else  if (k % 5 == 0) {
                System.out.println("Buzz" + " ");
            } else {
                System.out.println(k + " ");
            }
        }

        // Display a table of powers
        // TODO: Prompt the user to enter an integer.
        // TODO: Display a table of squares and cubes from 1 to the value entered.
        // TODO: Ask if the user wants to continue.
        // TODO: Assume that the user will enter valid data.
        // TODO: Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int userInput = scanner.nextInt();
        for(int i = 1; i <= userInput; i++) {
            System.out.println("Here is your table!");
            System.out.println();
            System.out.format("%10s %10s % 10s %n", "number", "squared", "cubed");

        }
    }
}
