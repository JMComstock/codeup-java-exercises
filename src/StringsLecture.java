import java.util.Locale;

public class StringsLecture {

    public static void main(String[] args) {

        // Strings
        // objects (not primitive like in js)

//        String myName = "Jason";
//        String otherName = "Cody";
//
//        if(myName == otherName) {
//            System.out.println("names match");
//        } else {
//            System.out.println("doesn't match");
//        }
//
//        if(myName.equals(otherName)) {
//            System.out.println("names match");
//        } else {
//            System.out.println("don't match");
//        }

        // DO NOT USE  ==   USE   .equals()   when comparing strings!!!

        // immutable --> teh value con not change

        String greeting = "Hello";

        greeting = greeting + " there";

        System.out.println(greeting);

//      String manipulation

        String sentence = "The quick brown fox jumps over the lazy dog";

//      charAt(int index) --> find a character at a given index
        System.out.println(sentence.charAt(0));
        char findingChar = sentence.charAt(3);
        System.out.println(findingChar);

        // .indexOf(String subString) -->
        System.out.println(sentence.indexOf("quick")); // 4

        // .lastIndexOf(String subString) --> returns int

        System.out.println(sentence.lastIndexOf("a"));

        // .length() --> doesn't accept params, return an int (starts at 1)
        System.out.println(sentence.length());

        // .replace(String pattern, String replacement) --> replace a copy of the string that has pattern and replaced with replacement
        System.out.println(sentence.replace("quick", "fast")); // --> The fast brown fox jumps over the lazy dog
        System.out.println(sentence); // --> The quick brown fox jumps over the lazy dog

        // .substring(int beginIndex[, int endIndex]) --> Returns a new substring that starts at a specified index and (optionally) ends at the specified index
        System.out.println(sentence.substring(5, 10)); // --? uick
        System.out.println(sentence); // --> The quick brown fox jumps over the lazy dog

        // toLowerCase()
        System.out.println(sentence.toLowerCase()); // --> the quick brown fox jumps over the lazy dog

        // toUpperCase()
        System.out.println(sentence.toUpperCase()); // --> THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

        // trim() --> removes whitespace
        System.out.println(sentence.trim());


    }
}
