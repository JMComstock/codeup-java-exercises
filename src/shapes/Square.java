package shapes;

class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
