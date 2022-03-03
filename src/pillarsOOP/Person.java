package pillarsOOP;

public class Person {
    protected String name; // property
    private int age;

    // constructor method that takes in a parameter
    public Person (String name) {
        this.name = name; // instance of the object
    }

    // blank constructor
    public Person() {

    }

    // method
    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public void sayGoodBye() {
        System.out.println("Adios muchachos and thanks for all the fish from " + name + "!" );
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }
}
