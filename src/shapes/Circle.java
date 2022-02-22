package shapes;

public class Circle {

    private static double radius;
    private static final double pi = Math.PI;

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public static double getArea() {
        radius = 3;
        return pi * (radius * radius);
    }

    public static double getCircumference() {
        radius = 3;
        return 2 * pi * radius;
    }

    public static void main(String[] args) {

        System.out.println("The area of a circle with the radius of 3 is: " + getArea());

        System.out.println("The circumference of a circle with te radius of 3 is: " + getCircumference());
    }
}
