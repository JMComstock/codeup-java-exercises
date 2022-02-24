import java.io.IOException;
import java.util.Scanner;

public class MethodsExercises {


    // TODO: Basic Arithmetic
    //    Create four separate methods. Each will perform an arithmetic operation:
    //    Addition
    //    Subtraction
    //    Multiplication
    //    Division

    // TODO: Each function needs to take two parameters/arguments so that the operation can be performed.

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("The addition result is: " + result);
    }

    public static void subtract(int c, int d) {
        int result = c - d;
        System.out.println("The subtraction result is: " + result);
    }

    public static void multiply(int e, int f) {
//        int result = e * f;
//        System.out.println("The multiplication result is: " + result);

        // TODO: Create your multiplication method without the * operator (Hint: a loop might be helpful).
        int result = 0;
        for(int i=1; i<=e; i++) {
            result = result + f;
        }
        System.out.println("The multiplication result is: " + result);
    }

    public static void divide(int g, int h) {
        int result = g / h;
        System.out.println("The division result is: " + result);

    }

    // TODO: Add a modulus method that finds the modulus of two numbers.

    public static void modulus(int i, int j) {
        int result = i % j;
        System.out.println("The remainder result is " + result);
    }

    // TODO: Create four separate methods. Each will perform an arithmetic operation with recursion:

    public static int addRecursion(int num1) {
        if(num1 != 0) {
            return num1 + addRecursion(num1 -1);
        } else {
            return num1;
        }
    }

    public static int subtractRecursion(int num2) {
        if(num2 != 0) {
            return num2 - subtractRecursion(num2 - 1);
        } else {
            return num2;
        }
    }

    public static int multiplyRecursion(int num3, int num4) {
        if( num3 < num4) {
            return multiplyRecursion(num4, num3);
        } else if (num4 != 0) {
            return (num3 + multiplyRecursion(num3, num4 -1));
        } else {
            return 0;
        }
    }

    public static int divideRecursion(int num5, int num6) {
        if(num6 == 0) {
            return 0;
        } else if (num5 - num6 == 0){
            return 1;
        } else if (num5 < num6) {
            return 0;
        } else {
            return (1 + divideRecursion(num5-num6, num6));
        }
    }

    //TODO: Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter a number between %s %S: %n", min, max);
            int userInput = sc.nextInt();
            if(userInput >= min & userInput <= max) {
                System.out.println("Your number is inside of the specified range.");
                break;
            } else {
                System.out.println("Your number is outside the range, try again");
            }
        }
        return 1;
    }

    // TODO: Calculate the factorial of a number:
    //    Prompt the user to enter an integer from 1 to 10.
    //    Display the factorial of the number entered by the user.
    //    Ask if the user wants to continue.
    //    Use a for loop to calculate the factorial.
    //    Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //    Use the long type to store the factorial.
    //    Continue only if the user agrees to.
    //    A factorial is a number multiplied by each of the numbers before it.
    //    Factorials are denoted by the exclamation point (n!). Ex:

    public static void calculateFactorial() {
        long factorialAnswer = 1;

        Scanner factorialScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 amd 20 to calculate its factorial: ");
        long userFactorialInput = factorialScanner.nextLong();

        if (userFactorialInput >= 1 && userFactorialInput <= 20) {
            for(int i = 1; i <= userFactorialInput; i++) {
                factorialAnswer = factorialAnswer * i;
            }
            System.out.println(userFactorialInput + "! = " + factorialAnswer);
        } else {
            System.out.println("Your number is outside of the specified range! 🤬");
        }

    }

    // TODO: Create an application that simulates dice rolling.
    //    Ask the user to enter the number of sides for a pair of dice.
    //    Prompt the user to roll the dice.
    //    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //    Use static methods to implement the method(s) that generate the random numbers.
    //    Use the .random method of the java.lang.Math class to generate random numbers.

    public static void diceRoller () throws IOException {

        String userAnswer;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of sides for a pair of dice: ");
            int diceSides = scan.nextInt();
            System.out.println("Roll the dice by pressing X ...");
            String roller = scan.next();
            int min = 1;
            if(roller.equals("X")) {

                double firstRoll = Math.floor(Math.random()*(diceSides-min+1)+min);
                System.out.println("The first dice produced: " + (firstRoll));
                double secondRoll = Math.floor(Math.random()*(diceSides-min+1)+min);
                System.out.println("The second dice produced: " + secondRoll);

            } else {
                System.out.println("Guess you're not rolling the dice...");
            }

            System.out.println("Do you want to continue? (answer yes or no): ");
            userAnswer = scan.next();

        } while (userAnswer.equals("yes") || userAnswer.equals("Yes"));




    }


    public static void main(String[] args) throws IOException {

//        add(1,2);
//
//        subtract(2, 1);
//
//        multiply(10, 10);
//
//        divide(4, 2);
//
//        modulus(5,3);

        int number = 10;
        int sumAdd = addRecursion(number);
        System.out.println("Addition with recursion method = " + sumAdd);

        int sumSubtract= subtractRecursion(number);
        System.out.println("Subtraction with recursion method = " + sumSubtract);

        int num3 = 5;
        int num4 = 5;
        System.out.println("Multiplication with recursion method = " + multiplyRecursion(num3, num4));

        int num5 = 6;
        int num6 = 2;
        int result = divideRecursion(num5, num6);
        System.out.println("Division with recursion method = " + result);

        getInteger(1, 10);

        calculateFactorial();

        diceRoller();

    }
}
