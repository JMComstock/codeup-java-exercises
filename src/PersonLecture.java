import java.util.Scanner;

public class PersonLecture {
    //This blueprint has these PROPERTIES:
    // First: Two STRING datatypes representing names
    public String firstName;
    public String lastName;

    // Extra examples: More fields for a Person to have when instantiated (created)
    private int age;
    public String relationship;

    public int shareAge () {
        return this.age;
    }

    // Properties can also be METHODS, e.g. :
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    // I don't have to just use the default constructor new Class(); - I can set up my own
//    public PersonLecture() {
//        System.out.println("A new person object has been instantiated");
//    }

    // More real world example: Users only provide us a firstName and lastName on registration, but not an age or relationship
    public PersonLecture(String firstName, String lastName) {
        // Inside of our constructor .  . default for age and relationship vs. taking it in as an argument
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
        relationship = "undefined";
    }
    // Now, our user has registered and we want to create an object with all of the potential fields

//    public PersonLecture(String firstName, String lastName, int age, String relationship) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.relationship = relationship;
//    }

    // Refactor of above constructor: Utilizing the, this() method constructor call
    public PersonLecture(String firstName, String lastName, int age, String relationship) {
        this(firstName, lastName); //<<<
        this.age = age;
        this.relationship = relationship;
    }

    // That means, we could have a completely separate constructor as a default:
    public PersonLecture() {
        //default things
    }

    public static void main(String[] args) {
        // Created an INSTANCE of a person:
//        PersonLecture jason = new PersonLecture();
//        // Filled in the properties with values:
//        jason.firstName = "Jason";
//        jason.lastName = "Comstock";
//        jason.age = 40;
//        jason.relationship = "taken";
//
//        // See the results from our object and our values that we put into the properties:
//        System.out.println("jason.relationship =  " + jason.relationship);
//        System.out.println(jason.sayHello());
//        // Adding a new line of whitespace:
//        System.out.println();
//
//        // To close the conversation, let's make another instance of a Person:
//        PersonLecture cody = new PersonLecture();
//
//        cody.firstName = "Cody";
//        cody.lastName = "Hastings";
//
//        System.out.println("cody.firstName = " + cody.firstName);
//        System.out.println("cody.lastName = " + cody.lastName);
//        System.out.println(cody.sayHello());
//        System.out.println();
//
//        // Note: we did NOT try to spin off out own version of MATH.
//        // No Math jasonMath = new Math(); instead we access the class.StaticField
//        System.out.println("Math.PI = " + Math.PI);
//
//        // Compare and contrast:
//        // Need to make an INSTANCE to use a Scanner.
//        Scanner mcScannerFace = new Scanner(System.in);
//        // Call the instance to use:
//        mcScannerFace.nextLine();

        // Constructor overloading example:
        // Scenario 1: user registers with only 2 pieces of info
        // Before: We were using our default construcor and assigning all fields manually . . .
//        PersonLecture newUser = new PersonLecture();
//        newUser.firstName = "myName";
        // etc.

        //Now:
        PersonLecture newUser = new PersonLecture("Bugs", "Bunny");
        System.out.println(newUser.sayHello());
        System.out.println("newUser.age = " + newUser.age);
        System.out.println("newUser.relationship = " + newUser.relationship);

        //Example 2: User provides use all four pieces of information to instantiate a 'Person'
        PersonLecture newerUser = new PersonLecture("Daffy", "Duck", 90, "complicated");
        System.out.println();
        System.out.println(newerUser.sayHello());
        System.out.println("newerUser.age = " + newerUser.age);
        System.out.println("newerUser.relationship = " + newerUser.relationship);

    }
}
