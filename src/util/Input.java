package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.println("Tell me how you're feeling.");
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.println("Tell me yes or no...");
        if(Objects.equals(scanner.nextLine(), "yes") || Objects.equals(scanner.nextLine(), "y")) {
            return true;
        } else {
            return false;
        }

    }

    public static int getInt(int min, int max) {
        System.out.println("Give me a number within the specified range");

        if(scanner.nextInt() >= min && scanner.nextInt() <= max)  {
            System.out.println("Your number is in the range");
        } else {
            System.out.println("Your number is not in the range");
        }
        return 1;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static void getDouble (double min, double max) {
        System.out.println("Give me a number within the specified range");

        if(scanner.nextDouble() >= min && scanner.nextDouble() <= max)  {
            System.out.println("Your number is in the range");
        } else {
            System.out.println("Your number is not in the range");
        }
    }

    public static void getDouble() {
        scanner.nextDouble();
    }

    public static void main(String[] args) {

        getString();

        yesNo();

        getInt(1, 100);

        getInt();

        getDouble(1, 100);

        getDouble();
    }
}
