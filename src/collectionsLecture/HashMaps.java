package collectionsLecture;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String, String> authorsBooks = new HashMap<>();

        authorsBooks.put("Kurt Vonnegut", "Cat's Cradle");
        authorsBooks.put("J.D. Salinger", "Franny and Zooey");

        // so - let's get keys and see their values
        System.out.println("authorsBooks.get(\"Kurt Vonnegut\") = " + authorsBooks.get("Kurt Vonnegut"));
        System.out.println("authorsBooks.get(\"Isaac Asimov\") = " + authorsBooks.get("Isaac Asimov"));

        // how do I find if the key is in my HashMap
        System.out.println("authorsBooks.containsKey(\"Isaac Asimov\") = " + authorsBooks.containsKey("Isaac Asimov"));
        System.out.println("authorsBooks.containsKey(\"Kurt Vonnegut\") = " + authorsBooks.containsKey("Kurt Vonnegut"));

        // What if I didn't WANT null
        System.out.println("authorsBooks.getOrDefault(\"Isaac Asimov\", \"No book found for author\") = " + authorsBooks.getOrDefault("Isaac Asimov", "No book found for author"));

        // want to override the key-value pair
        authorsBooks.put("Kurt Vonnegut", "Slaughterhouse Five");

        // Instead of put - let's use PUT IF Absent
        authorsBooks.putIfAbsent("Kurt Vonnegut", "Welcome to The Monkey House");

        // adding and then removing
        authorsBooks.put("Karl Marx", "The Communist Manifesto");
        System.out.println("authorsBooks = " + authorsBooks);
        authorsBooks.remove("Karl Marx");
        System.out.println("authorsBooks = " + authorsBooks);

        // replace something without having to use the entire put method
        authorsBooks.replace("J.D. Salinger", "Nine Stories");
        System.out.println("authorsBooks = " + authorsBooks);
        // remove all items from hashmap
        authorsBooks.clear();
        System.out.println("authorsBooks = " + authorsBooks);

        System.out.println("authorsBooks.isEmpty() = " + authorsBooks.isEmpty());

    }
}
