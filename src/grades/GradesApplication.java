package grades;

import java.util.*;

public class GradesApplication {


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student jason = new Student("Jason");
        jason.addGrade(100);
        jason.addGrade(98);
        jason.addGrade(97);
        Student sid = new Student("Sid");
        sid.addGrade(98);
        sid.addGrade(96);
        sid.addGrade(95);
        Student loretta = new Student("Loretta");
        loretta.addGrade(100);
        loretta.addGrade(100);
        loretta.addGrade(99);
        Student jim = new Student("Jim");
        jim.addGrade(90);
        jim.addGrade(97);
        jim.addGrade(96);

        students.put("JMComstock", jason);
        students.put("Sid1", sid);
        students.put("HelenWait", loretta);
        students.put("BuffJim", jim);

        String userInput;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome!\n\nHere are the GibHub usernames of our students:\n");
            for(String name : students.keySet()) {
                System.out.printf("|%s| ", name);
            }

            System.out.println("\n\nWhat student would you like to see more information on?");
            String choice = sc.nextLine();
            Student userChoice = students.get(choice);
            if(students.containsKey(choice)) {
                System.out.printf("Name: %s - GitHub Username: %s%nAll Grades: %s%nCurrent Average: %.1f%n", userChoice.getName(), choice, userChoice.getGrades(), userChoice.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + "\"" + choice + "\"." );
            }

            System.out.println("\nWould you like to view all the grades for all the students? yes or no");
            String allGradesChoice = sc.nextLine();
            if(allGradesChoice.equals("yes")) {

                for (Map.Entry<String, Student> stringStudentEntry : students.entrySet()) {
                    System.out.println("Username: " + stringStudentEntry.getKey() + " Grades: " + stringStudentEntry.getValue());
                }

            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWould you like to see another student?");
            userInput = scanner.nextLine();

        } while (Objects.equals(userInput, "Y") || Objects.equals(userInput, "yes") || Objects.equals(userInput, "YES") || Objects.equals(userInput, "y"));


    }
}
