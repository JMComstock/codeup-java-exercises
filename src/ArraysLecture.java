import java.util.Arrays;

public class ArraysLecture {

    public static int sumAll() {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        // WHAT ARE ARRAYS? <- a collection of data
        // ⭐️length of arrays MUST be defined before using in Java
        // data type of the elements being stored in the array (the same data type)


        // HOW TO PROPERLY USE ARRAYS in JAVA

        // CREATE AN ARRAY OF texasTemps for 3-days
        // SYNTAX
//        int[] texasTemps = new int[3];
        // int[] - data type of the variable
        // texasTemps -  var name
        // new int[3] - initializing new array of integers with a length of 3

        // assign some values to those slots
//        texasTemps[0] = 36;
//        texasTemps[1] = 45;
//        texasTemps[2] = 86;
//
//        System.out.println(texasTemps[1]);  // print out the value of the element in the 1st index --> 45

        // TODO: create an array of Strings that store 3 different waether string (sunny, rainy, etc.)
        // 1. declare data type String
        // 2. save it to a variable
        // 3. create the array
        // 4. specify the data type of the array
        // 5. define the length of the array
        // 6. assign values to each of the elements in the array

//        String[] texasWeatherType = {"sunny", "rainy", "humid"};
//        System.out.println(texasWeatherType[2]);
//
//        System.out.println(texasWeatherType);// prints where the array is in memory not the actualy values of the array
//        System.out.println(Arrays.toString(texasWeatherType));

        // HANDLING MULTIPLE ELEMENTS AT A TIME
        // TODO: create an array that holds my daily steps
        // data type of elements ?  long
        // data type - array
        // name the variable that holds the array - dailySteps
        // data type of the variable (dailySteps) ? long

//        long[] dailySteps = {10000, 12000, 13000, 22000};
//        System.out.println(Arrays.toString(dailySteps));

        // TODO: Create an array of ints and print out the array

//        int[] ints = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(ints));

        // HOW TO ITERATE THROUGH ARRAYS
        // TODO: create a method (sumALl) that returns the sum of all integers in an int array (nums)
        // [5,2,3,1] ---> 11

        // PSEUDOCODE
        // 1. create a method(nums)
        // // what's the method signature? --> public static
        // // what data type (if any) is being returned from this method --> int

        // 2. create an array of ints
        // // 2a. What's the length of the array? --> (5)
        // // 2b. Where does this array go? --> in sumALl method
        // // 2c. Assign values to the array

        // 3. Assign values to the array
        // // how are we going to initialize the array of ints?
        // // // array literal{}
        // // // array declaration new int[]

        // 4. iterate through our elements in the array
        // / where does this iteration live? inside of the sumAll()
        // // how do you want to iterate?
        // // // traditional FOR loop
        // // // enhanced FOR loop

        // 5. create a variable to store the sum
        // // where does this variable live? --> in sumAll() --> before (outside) of the loop
        // // where does this variable live?
        // // what is the variable's type (int)
        // // what's this variable's starting point

        // 6. add logic that will add each element to itself
        // where does this logic live?
        // int sum;
        // // [1,5,3,2]
        // // sum += index of element in the FOR loop you are on....

        // 7. return the sum
        // // where does this return statement live? --> in sumAll() after the loop (outside the loop)

        // 8. call the method
        // // where and how do we call the method? --> in PSVM
        // // sout the data from the sumAll()


        System.out.println("The sum of all integers in the nums array is: " + sumAll());

        // // // TRADITIONAL FOR LOOP

//        String[] names = {"Cody", "Kenneth", "Jordy", "Laura"};
//        System.out.println(names.length);
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        // // // ENHANCED FOR LOOP
        // similar to a .forEach() in js
        // for (data type and name of variable: name of the array we're iterating though)

//        String[] names = {"Cody", "Kenneth", "Jordy", "Laura"};
//        System.out.println(names.length);
//        for(String name : names) {
//            System.out.println(name);
//        }

        // // ARRAYS CLASS()

        // // Arrays.fill()
        String[] languages = {"French", "Portuguese", "Dutch"};
        System.out.println(Arrays.toString(languages));
        Arrays.fill(languages, "French");
        System.out.println(Arrays.toString(languages));
        // changing the existing array

        // // Arrays.equals()
        String[] answer = {"apart", "learn", "knock"};
        String[] kenGuess = {"texas", "green", "array"};
        System.out.println(Arrays.equals(answer, kenGuess));
        // accepts two params
        // returns a boolean

        // // Arrays.copyOf()
        String[] lauraCopy = Arrays.copyOf(answer, 4);
        System.out.println(Arrays.toString(lauraCopy));

        // // Arrays.toString()
        // used to print out arrays

        // // Arrays.sort()
        String[] languageList = {"French", "Portuguese", "Dutch"};
        Arrays.sort(languageList);
        System.out.println(Arrays.toString(languageList));

        int[] random = {3,1,17,4,8};
        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
    }
}
