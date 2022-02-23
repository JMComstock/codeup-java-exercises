import java.util.Arrays;

public class ArraysExercises {

    private static String[] addPerson(String[] Person) {
//we create a new Object here, an array of bigger capacity
        String[] newPersonArray = new String[Person.length + 1];
        System.arraycopy(Person, 0, newPersonArray, 0, Person.length);
        newPersonArray[Person.length] = "James";
        return newPersonArray;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@3f0ee7cb  Arrays.toString() is necessary to return a string representation of the elements in the array
        System.out.println(Arrays.toString(numbers));

        String [] Person = new String[3];
        Person[0] = "Jason";
        Person[1] = "Loretta";
        Person[2] = "Sid";

        for (String n : Person) {
            System.out.println(n);
        }

        System.out.println("myArray before adding a new element: " + Arrays.toString(Person));
        Person = addPerson(Person);
        System.out.println("myArray before adding a new element: " + Arrays.toString(Person));

    }

}
