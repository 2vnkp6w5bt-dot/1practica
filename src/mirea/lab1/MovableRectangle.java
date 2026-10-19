package mirea.lab1;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSpeedSame(){
        return topLeft.getxSpeed() == bottomRight.getxSpeed() &&
                topLeft.getySpeed() == bottomRight.getySpeed();
    }

    @Override
    public void moveUp() {
        if (isSpeedSame()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("Скорости точек разные!");
        }
    }

    @Override
    public void moveDown() {
        if (isSpeedSame()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            System.out.println("Скорости точек разные!");
        }
    }
    @Override
    public void moveLeft() {
        if (isSpeedSame()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            System.out.println("Скорости точек разные!");
        }
    }

    @Override
    public void moveRight() {
        if (isSpeedSame()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            System.out.println("Скорости точек разные!");
        }
    }
    @Override
    public String toString() {
        return "MovableRectangle(topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() + ")";
    }

    }
