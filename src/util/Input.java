package util;

import java.util.Scanner;

public class Input {

    public Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Type yes or no...");

        String userInput = scanner.nextLine();
        return userInput.equals("yes") || userInput.equals("y");

    }

    public int getInt(int min, int max) {
        int userNum;

        do {
            System.out.println("Enter a number between " + min +" and " + max + ": ");
            userNum = scanner.nextInt();
        } while (userNum < min || userNum > max);
        return userNum;

    }

    public int getInt() {
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();

        try {

            Integer.valueOf(userNum);

        } catch (NumberFormatException e) {

            System.out.println("The number you entered is not an Integer" + e.getMessage());
            System.out.println("Here is more about the error: ");
            e.printStackTrace();
        }
        return userNum;
    }

    public double getDouble (double min, double max) {
        double userNum = 0;

        try {
            do {
                System.out.println("Enter a decimal number between " + min +" and " + max + ": ");
                userNum = scanner.nextDouble();
            } while (userNum < min || userNum > max);
        } catch (Exception e) {
            System.out.println("Wops you have an error" + e.getMessage());
            e.printStackTrace();

        }
        return userNum;
    }

    public double getDouble() {
        System.out.println("Enter a number with decimals: ");

        double userNum = scanner.nextDouble();

        try {

            Double.valueOf(userNum);

        } catch (NumberFormatException e) {

            System.out.println("That is not a number with decimals: " + e.getMessage());
            System.out.println("More info about the error: ");
            e.printStackTrace();
        }
        return userNum;
    }


    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Input input = new Input();
        System.out.println("You entered: " + input.getString());

        boolean tOrF = input.yesNo();
        System.out.println("You entered: " + tOrF);

        int yourNumber = input.getInt(-Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println("The number you entered is " + yourNumber);

        int randomInt = input.getInt();
        System.out.println("The number you entered is: " + randomInt);

        double userDouble = input.getDouble(-Double.MAX_VALUE, Double.MAX_VALUE);
        System.out.println("The decimal number you entered is: " + userDouble);

        double anyDouble = input.getDouble();
        System.out.println("The decimal number you enteresd is: " + anyDouble);
    }
}
