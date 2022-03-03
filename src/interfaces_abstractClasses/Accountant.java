package interfaces_abstractClasses;

public class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "TPS Reports drafted!";
    }

    public String morningMeeting() {
        return "Accountants have morning meetings between 8:15 and 8:45AM";
    }

    public String lunchTIme() {
        return "An accountant takes their lunch from 1 to 2PM or as requested and approved through the accounting manager";
    }

    public int dailyPay() {
        return 500;
    }

    @Override
    public String getPaid() {
        return "Arrived at payment department and was paid in full";
    }
}


