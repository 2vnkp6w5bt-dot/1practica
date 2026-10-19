package mirea.lab1;

public class Rectangle extends Shape{
    protected double width;
    protected double hight;

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*hight;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return hight*width;
    }

    @Override
    public String toString() {
        return "Прямоугольник с высотой " + hight + " и шириной " + width;
    }
}
