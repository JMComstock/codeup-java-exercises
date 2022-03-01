package movies;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        String userChoice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("0 - exit:\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - add a movie to the list");
            System.out.print("Enter your choice: ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    System.out.println("Here is all the movies...\n");
                    System.out.println("FINDALL RESULT: " + Arrays.toString(MoviesArray.findAll()));
                    Movie[] outerArr = MoviesArray.findAll(); // [[name,cat],[name,cat],[name,cat],[]]
                    for (movies.Movie eachMovieArr : outerArr) { // array of arrays
                        System.out.println(eachMovieArr.getName());

//                        for(int i = 0; i < outerArr.length; i +=1 ){
//                        System.out.println("outerArr[i]: " + (outerArr[i].getName()));
////                        System.out.println(movies.Movie);
////                        System.out.println(movies);
//
//                        System.out.println(eachMoviearr.getName() + " -- " + eachMoviearr.getCategory());
//                    }
                    }
                    break;
                case 2:
                    System.out.println("Here is a list of the animated movies...\n");
                    for (movies.Movie Movie : MoviesArray.findAll()) {
                        if (Objects.equals(Movie.getCategory(), "animated")) {
                            System.out.println(Movie.getName() + " -- " + Movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Here is a list of the dramas...\n");
                    for (movies.Movie Movie : MoviesArray.findAll()) {
                        if (Objects.equals(Movie.getCategory(), "drama")) {
                            System.out.println(Movie.getName() + " -- " + Movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Here is a list of the horror movies...\n");
                    for (movies.Movie Movie : MoviesArray.findAll()) {
                        if (Objects.equals(Movie.getCategory(), "horror")) {
                            System.out.println(Movie.getName() + " -- " + Movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Here is a list of the sci-fi movies...\n");
                    for (movies.Movie Movie : MoviesArray.findAll()) {
                        if (Objects.equals(Movie.getCategory(), "scifi")) {
                            System.out.println(Movie.getName() + " -- " + Movie.getCategory());
                        }
                    }
                    break;
                case 6:
//                    System.out.println("Add your movie name: ");
//                    String userMovieName = scanner.next();
//                    System.out.println("Add your movie category: ");
//                    String userMovieCategory = scanner.next();
//                    MoviesArray.add(userMovieName, userMovieCategory);
//                    System.out.println("Your movie was added.");
//                   for (movies.Movie Movie : MoviesArray.findAll()) {
//                        System.out.println(Movie.getName() + " -- " + Movie.getCategory());
//                    }
//                    break;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to choose another category? (Y/N) ");
            userChoice = sc.nextLine();

        } while (Objects.equals(userChoice, "Y") || Objects.equals(userChoice, "y"));

    }
}
