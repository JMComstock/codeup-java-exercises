import java.util.Scanner;

public class PersonLecture {
    //This blueprint has these PROPERTIES:
    // First: Two STRING datatypes representing names
    public String firstName;
    public String lastName;

    // Extra examples: More fields for a Person to have when instantiated (created)
    private int age;
    public String relationship;

    // Properties can also be METHODS, e.g. :
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    // I don't have to just use the default constructor new Class(); - I can set up my own
    public PersonLecture() {
        System.out.println("A new person object has been instantiated");
    }

    public static void main(String[] args) {
        // Created an INSTANCE of a person:
        PersonLecture jason = new PersonLecture();
        // Filled in the properties with values:
        jason.firstName = "Jason";
        jason.lastName = "Comstock";
        jason.age = 40;
        jason.relationship = "taken";

        // See the results from our object and our values that we put into the properties:
        System.out.println("jason.relationship =  " + jason.relationship);
        System.out.println(jason.sayHello());
        // Adding a new line of whitespace:
        System.out.println();

        // To close the conversation, let's make another instance of a Person:
        PersonLecture cody = new PersonLecture();

        cody.firstName = "Cody";
        cody.lastName = "Hastings";

        System.out.println("cody.firstName = " + cody.firstName);
        System.out.println("cody.lastName = " + cody.lastName);
        System.out.println(cody.sayHello());
        System.out.println();

        // Note: we did NOT try to spin off out own version of MATH.
        // No Math jasonMath = new Math(); instead we access the class.StaticField
        System.out.println("Math.PI = " + Math.PI);

        // Compare and contrast:
        // Need to make an INSTANCE to use a Scanner.
        Scanner mcScannerFace = new Scanner(System.in);
        // Call the instance to use:
        mcScannerFace.nextLine();

    }
}
