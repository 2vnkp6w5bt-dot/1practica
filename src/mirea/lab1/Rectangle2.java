package mirea.lab1;

public class Rectangle2 extends ShapeAbs{
    protected double width;
    protected double height;


    public Rectangle2() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle2(double width, double hight) {
        super();
        this.width = width;
        this.height = hight;
    }

    public Rectangle2(String color, boolean filled, double width, double hight) {
        super(color, filled);
        this.width = width;
        this.height = hight;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double hight) {
        this.height = hight;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", height=" + height + ", width=" + width + "]";
    }
}
