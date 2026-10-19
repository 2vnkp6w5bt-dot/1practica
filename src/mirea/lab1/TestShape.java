package mirea.lab1;

public class TestShape {
    public static void main (String[] args){

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(3.0, 6.0);
        shapes[2] = new Square(4.0);

        for (Shape shape: shapes){
            System.out.println(shape.toString());
            System.out.println("Тип " + shape.getType());
            System.out.printf("Площадь: %.2f%n", shape.getArea());
            System.out.printf("Периметр: %.2f%n", shape.getPerimeter());
            System.out.printf("%n");
        }
    }
}
