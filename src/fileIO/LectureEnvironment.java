package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureEnvironment {

    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); // we need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        // Paths class = static methods to obtain filepaths (Path class)
        // Path interface = abstracts away differences between WIin  && MacOS [vs. trying to do everything with strings]
        // Files class - Files.methods() for manipulationg / interacting with files ^ utilizing paths above
        // File class object{} representation of a file

        // working with absolute and relative paths
        // declare and initialize a 'Path' datatype

        String myString = "This string";

        Path pathToPoem = Paths.get("src/fileIO/wcw.txt");

        System.out.println("pathToPoem = " + pathToPoem);

        // calling the Files helper class - boolean answer
        System.out.println("Files.exists(pathToPoem) = " + Files.exists(pathToPoem));

        printPoem(pathToPoem);

        // - create a file and a directory/path to that file
        //1. String representing where I want a directory to go
        String directory = "./src/fileIO/data";
        //2. string representing name of the file as I would like it.
        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory); // path-ify that String with the directory
        Path dataDirectoryAndFile = Paths.get(directory, fileName); // Combining both Strings into one 'Path'!

        System.out.println();
//        System.out.println("dataDirectory = " + dataDirectory);
//        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

//        if(Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }

        if(Files.notExists(dataDirectoryAndFile)) {
            Files.createDirectories(dataDirectory);

            Files.createFile(dataDirectoryAndFile);
        }

        //3. - created a directories and files that did not exist before, now I want to manipulate what is INSIDE a file
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        // Set up something we want to WRITE into the text file...
        List<String> groceryList = Arrays.asList("coffee", "dog food", "roast beef", "carrots", "potatoes", "onions", "bread");

        System.out.println("groceryList = " + groceryList);

        Files.write(dataDirectoryAndFile, groceryList);

        //UPDATE the grocery list
        List<String> forgotAGrocery = Arrays.asList("muenster cheese", "gouda cheese", "colby jack cheese");

        Files.write(dataDirectoryAndFile, forgotAGrocery, StandardOpenOption.APPEND);

        // get info from text file back into Java

        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);

        System.out.println();
        System.out.println("printGroceryList = " + printGroceryList);

        for (int i=0; i< printGroceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + printGroceryList.get(i));
        }

        // 1. get the list as it exists now
        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);
        //2. set up 2nd array list to hold updated list we want to write to the text file
        List<String> newList = new ArrayList<>();
        //3. look inside of ONE LINE from ALL OF THESE LINES I got from my text file
        for (String line : printGroceryList2) {
            if (line.equalsIgnoreCase("gouda cheese")) {
                newList.add("vegan cheese");
                continue;
            }

            newList.add(line);

        }

        System.out.println("printGroceryList2 = " + printGroceryList2);
        System.out.println("newList = " + newList);
        printGroceryList2 = newList;
        System.out.println("printGroceryList2 (overwrite experiment) = " + printGroceryList2);

        Files.write(dataDirectoryAndFile, newList);
    }
}
