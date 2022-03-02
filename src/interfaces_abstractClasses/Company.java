package interfaces_abstractClasses;

public class Company {

    public static void main(String[] args) {

        Employee numberBot = new Accountant("accountantBot", "Accounting");

        Employee cleanerBot = new Custodian("cleanerBot", "Maintenance");

        System.out.println("What's your name and department? : " + numberBot.getName() + " | " + numberBot.getDepartment());
        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println("numberBot.getName() = " + numberBot.getName());
        System.out.println("numberBot.lunchTIme() = " + numberBot.lunchTIme());
        System.out.println("numberBot.dailyPay() = " + numberBot.dailyPay());
        System.out.println("numberBot.getPaid() = " + numberBot.getPaid());

        System.out.println();

        System.out.println("What's your name and department?: " + cleanerBot.getName() + " | " + numberBot.getDepartment()) ;
        System.out.println("cleanerBot.work() = " + cleanerBot.work());
        System.out.println("cleanerBot.getDepartment() = " + cleanerBot.getDepartment());
        System.out.println("cleanerBot.lunchTIme() = " + cleanerBot.lunchTIme());
        System.out.println("cleanerBot.dailyPay() = " + cleanerBot.dailyPay());
        System.out.println("cleanerBot.getPaid() = " + cleanerBot.getPaid());

    }
}
