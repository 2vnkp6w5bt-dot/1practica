package mirea.lab2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestStudentBirthDate {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2004, Calendar.MAY, 15);
        Date birthDate = cal.getTime();

        Student student = new Student("Мария", "Иванова", "Программная инженерия", 1, "ИУ7-11Б", 108, 4.8, birthDate);

        System.out.println("\n1. Вывод через toString():");
        System.out.println(student);

        System.out.println("\n2. Разные форматы даты рождения:");

        String shortDate = student.getFormattedBirthDate(DateFormat.SHORT);
        System.out.println("Короткий: " + shortDate);

        String mediumDate = student.getFormattedBirthDate(DateFormat.MEDIUM);
        System.out.println("Средний: " + mediumDate);

        String longDate = student.getFormattedBirthDate(DateFormat.LONG);
        System.out.println("Длинный: " + longDate);

        String fullDate = student.getFormattedBirthDate(DateFormat.FULL);
        System.out.println("Полный: " + fullDate);
    }
}