package mirea.lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Lab11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
        String input = scanner.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date currentDate = new Date();

            Calendar calCurrent = Calendar.getInstance();
            calCurrent.setTime(currentDate);
            calCurrent.set(Calendar.HOUR_OF_DAY, 0);
            calCurrent.set(Calendar.MINUTE, 0);
            calCurrent.set(Calendar.SECOND, 0);
            calCurrent.set(Calendar.MILLISECOND, 0);
            currentDate = calCurrent.getTime();

            if (userDate.after(currentDate)) {
                System.out.println("Введенная дата находится в БУДУЩЕМ");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата находится в ПРОШЛОМ");
            } else {
                System.out.println("Введенная дата совпадает с текущей");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }
    }
}