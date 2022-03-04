package collectionsLecture;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> favNumbers = new ArrayList<>();

        // add elements to the arrayList
        favNumbers.add(7);
        // decide where to add the element to the array
        favNumbers.add(0, 13);
        favNumbers.add(222);
        favNumbers.add(7);

        // see the list
        System.out.println("favNumbers = " + favNumbers);

        // GET something at index X
        int myFavoriteFavoriteNum = favNumbers.get(0);
        System.out.println("myFavoriteFavoriteNum = " + myFavoriteFavoriteNum);

        // search for my second favorite number, "7"
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        System.out.println("favNumbers.indexOf(777) = " + favNumbers.indexOf(777));

        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));

        // see the length of arrayList
        System.out.println("favNumbers.size() = " + favNumbers.size());

        // with Strings - comparing them?
        ArrayList<String> favAuthors = new ArrayList<>();
        favAuthors.add("Vonnegut");
        favAuthors.add("Heinlein");
        favAuthors.add("W.C. Williams");
        favAuthors.add("Palmer Hall");

        System.out.println("favAuthors = " + favAuthors);

        ArrayList<String> copyFavAuthors = favAuthors;
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));

        copyFavAuthors.add("J.D. Salinger");
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));

        // looks like .equals just checks the Object to Object vs the value of what is INSIDE the object

        // Other common methods: .contains; .lastIndexOf; isEmpty; .remove

        System.out.println("favAuthors.contains(\"Heinlein\") = " + favAuthors.contains("Heinlein"));
        System.out.println("favAuthors.contains(\"Asimov\") = " + favAuthors.contains("Asimov"));
        System.out.println("favAuthors.contains(\"Salinger\") = " + favAuthors.contains("Salinger"));

        // get the last index of 7 since there is two
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7)); // wrong way
        // use last index of method
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));

        // isEmpty is a true or false return statement
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("emptyList.isEmpty() = " + emptyList.isEmpty());

        // .remove()

        Integer toRemove = new Integer(7);
        favNumbers.remove(toRemove);
        System.out.println("favNumbers.remove(7) = " + favNumbers.remove(2));
        System.out.println("favNumbers = " + favNumbers);

        // what if our arrayList had an index and value match?'
        favNumbers.add(3);
        System.out.println("favNumbers = " + favNumbers);

    }
}
