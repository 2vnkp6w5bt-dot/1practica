package mirea.lab1;

public class Square2 extends Rectangle2 {

    public Square2() {
        super();
    }

    public Square2(double side) {
        super(side, side);
    }

    public Square2(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}