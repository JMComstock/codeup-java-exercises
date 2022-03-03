package interfaces_abstractClasses;

public abstract class Employee implements dailyWork, monthlyWork{
    // FIELDS
    protected String name;
    protected String department;

    // CONSTRUCTOR
    public Employee(String name, String department) {
        this.name = name; // FIELD
        this.department = department; // FIELD
    }

    // GETTER
    public String getName() {
        return name;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    // GETTER
    public String getDepartment() {
        return department;
    }

    // SETTER
    public void setDepartment(String department) {
        this.department = department;
    }
}

