package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length*2) + (width*2);
    }

    @Override
    public double getArea() {
        return length * 4;
    }
}
