package mirea.lab2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lab11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1;
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите часы (0-23): ");
        int hour = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minute = scanner.nextInt();

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);

        Date date = cal.getTime();

        System.out.println("\nСозданный объект Calendar: " + cal.getTime());
        System.out.println("Созданный объект Date: " + date);
    }
}