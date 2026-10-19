package mirea.lab1;

public class TestShapeAbs {
    public static void main(String[] args) {

        ShapeAbs[] shapes = new ShapeAbs[3];
        shapes[0] = new Circle2("red", true, 3.0);
        shapes[1] = new Rectangle2(3.0, 6.0);
        shapes[2] = new Square2("blue", false, 4.0);

        for (ShapeAbs shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Площадь: %.2f%n", shape.getArea());
            System.out.printf("Периметр: %.2f%n", shape.getPerimeter());
            System.out.printf("%n");
        }
        Square2 mySquare = (Square2) shapes[2];
        mySquare.setWidth(5.0);
        System.out.println(mySquare.toString());
    }
}

