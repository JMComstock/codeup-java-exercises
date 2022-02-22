package shapes;

public class Circle {

    private static double radius;
    private static double area;
    private static double pi = Math.PI;
    private static double circumference;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getArea() {
        radius = 3;
        return area = pi * (radius * radius);
    }

    public static double getCircumference() {
        radius = 3;
        return circumference = 2 * pi * radius;
    }

    public static void main(String[] args) {

        System.out.println(getArea());

        System.out.println(getCircumference());
    }
}
