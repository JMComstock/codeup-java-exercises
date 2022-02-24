package pillarsOOP;

public class Employee extends Person {

    //constructor for an employee
    public Employee(String employeeName) {
        super(employeeName);
    }

    // Employees need to have a department, not every person has this.
    public String department;

    public void sayGoodBye() {
        System.out.println("It was my pleasure working with you today, come back and see us sometime.");
    }

    public String getName() {
        return this.name;
    }

}
