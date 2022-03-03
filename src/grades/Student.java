package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Jason Coatsmock");
        student1.grades.add(100);
        student1.grades.add(90);
        student1.grades.add(95);
        System.out.println("student1.getName() = " + student1.getName());
        student1.addGrade(97);
        System.out.println("student1.grades = " + student1.grades);
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());


        System.out.println();

        Student student2 = new Student("Sid Sharma");
        student2.grades.add(89);
        student2.grades.add(94);
        student2.grades.add(76);
        System.out.println("student2.getName() = " + student2.getName());
        student2.addGrade(69);
        System.out.println("student2.grades = " + student2.grades);
        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());

        System.out.println();

        Student student3 = new Student("Loretta Less");
        student3.grades.add(100);
        student3.grades.add(98);
        student3.grades.add(99);
        System.out.println("student3.getName() = " + student3.getName());
        student3.addGrade(99);
        System.out.println("student3.grades = " + student3.grades);
        System.out.println("student3.getGradeAverage() = " + student3.getGradeAverage());

    }
}
