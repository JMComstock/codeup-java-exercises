public class LectureEnvironment {

    public static void main(String[] args) {

        // Using the "Person" blueprint
        PersonLecture thisPerson = new PersonLecture();

        thisPerson.firstName = "Samuel";
        thisPerson.lastName = "Clemens";

        // A test of an instance method to see the right String return of "Hello from Samuel Clemens"
        System.out.println(thisPerson.sayHello());

        // Well, what about Arithmetic? It wouldn't be proper to start off by making an instance of it ..
//        Arithmetic jasonsMath = new Arithmetic();
//
//        System.out.println(jasonsMath.pi);
        // Instead: We want to talk to it in a non-instanced way [static way]
        System.out.println();
        System.out.println(Arithmetic.pi);
        System.out.println("Arithmetic.add(3, 3) = " + Arithmetic.add(3, 3));
        System.out.println("Arithmetic.multiply(4, 5) = " + Arithmetic.multiply(4, 5));

        // Well, can I access the instance property similarly to a static property? / NO!!!
//        System.out.println("PersonLecture.firstName = " + Person.firstName);

        // Back here: Let's make a PersonLecture with an age and mess with the visibility
        PersonLecture mcPerson = new PersonLecture("Kurt", "Vonnegut", 60, "complicated");

        System.out.println(mcPerson.shareAge());
    }
}
