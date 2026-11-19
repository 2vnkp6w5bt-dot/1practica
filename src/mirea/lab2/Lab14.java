package mirea.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab14 {
    public static void main(String[] args) {
        System.out.println("\nЗадание 2");

        String regex2 = "^abcdefghijklmnopqrstuv18340$";

        System.out.println("Строка \"abcdefghijklmnopqrstuv18340\":" + "abcdefghijklmnopqrstuv18340".matches(regex2));
        System.out.println("Строка \"abcdefghijklmnoasdfasdpqrstuv18340\": " + "abcdefghijklmnoasdfasdpqrstuv18340".matches(regex2));


        System.out.println("\nЗадание 3");
        String text3 = "Товар 1: 25.98 USD, Товар 2: 100 RUB, Товар 3: 44 ERR, Товар 4: 50.5 EU.";

        String regex3 = "\\d+(\\.\\d{2})?\\s+(USD|RUB|EU)\\b";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text3);

        System.out.println("Найденные корректные цены:");
        while (matcher3.find()) {
            System.out.println(" - " + matcher3.group());
        }

    }
}