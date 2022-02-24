package pillarsOOP;

public class LiveCode {

    public static void main(String[] args) {

//        Person chaucer = new Person("Chaucer");
//
//
//        System.out.println("chaucer.name = " + chaucer.name);
//        chaucer.sayHello();
//        chaucer.sayGoodBye();
//
//        System.out.println();
//
//        // 1st example of instantiating an object with inheritance
//        Employee mcKen = new Employee("McKenneth McHowell");
//
//        System.out.println("mcKen.name = " + mcKen.name);
//        mcKen.sayHello();
//        mcKen.sayGoodBye();
//
//        mcKen.department = "Delivery";
//
//        System.out.println("mcKen.department = " + mcKen.department);
//
//        System.out.println("mcKen.getName() = " + mcKen.getName());
//
//        System.out.println();
//        System.out.println("SUPERHERO TIME");
//
//        SuperHero theComedian = new SuperHero("Eddie Blake", "The Comedian");
//
//        System.out.println("theComedian.getName() = " + theComedian.getName());
//        System.out.println("theComedian.getSecretIdentity() = " + theComedian.getSecretIdentity());
//        System.out.println();

        // POLYMORPHISM

        Person one = new Person("mcExample mcPerson");
        Person two = new Employee("mcExample mcEmployee");

        one.sayGoodBye();
        two.sayGoodBye();


    }
}
