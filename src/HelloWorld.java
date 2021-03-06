// class - defining the class
// HelloWorld is the name of the class, and it matches the name of the .java file
public class HelloWorld {

    // method - similar to a function in javascript
    // main method -> specific method in hava that acts as our entry point when running java
    // (similar to GO starting point in a board game)

    public static void main (String[] args) {
        //public - pinned for later
        //static - pinned for later
        //void - for now, it means this method this doesn't expect anything to be returned
        //main - name of out method, main is a keyword that is going to be searched as the entry point
        // String[] args - passing in a string array named args(arguments)

        //print out "Hello World to the console"
        System.out.println("Hello, World!");

        System.out.print("Hello, ");
        System.out.print("World!");

        int myFavoriteNumber = 13;
        System.out.println("\n" + myFavoriteNumber);

        String myString = "This is my string.";
        System.out.println(myString);

//      double newString = myString;

        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        System.out.println("**************");

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *=  x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /=  y;
        y -=  x;
        System.out.println(x);
        System.out.println(y);

    }
}
