package interfaces_abstractClasses;

public class Custodian extends Employee {

    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Maintaining the building!";
    }

    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department and schedule meetings as necessary";
    }

    public String lunchTIme() {
        return "12:00 - 1:00PM in cafeteria.";
    }

    public int dailyPay() {
        return 120;
    }

    @Override
    public String getPaid() {
        return "Direct deposit to their bank account as appropriate";
    }
}
