package mirea.lab2;
import java.util.Date;

public class Lab11_1 {
    public static void main(String[] args) {

        long fiveDaysInMs = 5L * 24 * 60 * 60 * 1000;
        Date receiveDate = new Date(System.currentTimeMillis() - fiveDaysInMs);
        Date submitDate = new Date();

        System.out.println("Разработчик: Будилова Мария");
        System.out.println("Дата получения задания: " + receiveDate);
        System.out.println("Дата сдачи задания: " + submitDate);
    }
}
