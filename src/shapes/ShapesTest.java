package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //TODO: create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        // verify that the getPerimeter and getArea methods return 18 and 20, respectively

//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());

        System.out.println();
        // TODO: create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        //  verify that the getPerimeter and getArea methods return 20 and 25, respectively.

//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());


    }
}
