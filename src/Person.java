public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name );
    }

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // TODO: Create Person class inside of src that has a private name field that is a string, and the following methods:
//        Person newPerson = new Person();
//        newPerson.name = "Jason";
//        System.out.println("Setting newPerson.name to: " + newPerson.getName());
//        newPerson.sayHello();
//
//        newPerson.setName("Juan");
//
//        newPerson.sayHello();

        // TODO: The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane


    }
}
