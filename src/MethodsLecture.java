import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {

//        System.out.println(helloUser());
//        System.out.println("The numbers added together is: " + addNums());
//        sayHello();

        count(5);

    }

//    public static void sayHi() {
//        System.out.println("hi");
//    }

    // TODO: Write a method that accepts user name from input and return "hello, userInput"

//    public static String helloUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a name: ");
//        String userInput = scanner.nextLine();
//
//        return "Hello, " + userInput;
//    }

    // TODO: Write a method that accepts 2 numbers from user input and returns the result of those two numbers added together

//    public static int addNums() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//
//        return num1 + num2;
//
//    }

    // public -> the specific can be accessed by other packages and classes
    // static -> the presence of this keyword defines that the method belongs to the class, as opposed to an instance of it.
    // void -> return type void denotes that any return type can be returned
    // sayHello --> the name of the method

    // METHOD OVERLOADING --> defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.

    // Overloaded methods can call other versions of themselves, and are commonly used to provide default values for arguments.

//    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }

// RECURSION
    // often have inifinite loops UNLESS break/ or stopping point

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return; // exits the if statement
        }
        System.out.println(n);
        count(n - 1);
    }

}
