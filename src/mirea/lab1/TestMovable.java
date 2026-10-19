package mirea.lab1;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 10);
        System.out.println("Изначально: " + point);

        point.moveRight();
        point.moveUp();
        System.out.println("После moveRight и moveUp: " + point);
        System.out.printf("%n");

        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("Изначально: " + circle);

        circle.moveLeft();
        circle.moveDown();
        System.out.println("После moveLeft и moveDown: " + circle);
        System.out.printf("%n");

        Movable m = new MovablePoint(0, 0, 1, 1);
        m.moveRight();
        System.out.println(m.toString());
        System.out.printf("%n");

        MovableRectangle rect = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println("Изначально:");
        System.out.println(rect);

        rect.moveUp();
        rect.moveRight();
        System.out.println("После moveRight и moveUp: " + rect);
        System.out.println("Скорости одинаковые? " + rect.isSpeedSame());
        System.out.printf("%n");

    }
}
