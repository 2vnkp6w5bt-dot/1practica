package mirea.lab2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab14_6 {
    public static void main(String[] args) {

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+$";
        
        Pattern pattern = Pattern.compile(emailRegex);

        System.out.println("\nПравильные адреса");
        String[] validEmails = {
                "user@example.com",
                "root@localhost",
                "john.doe@mail.ru",
                "test+filter@gmail.com"
        };
        for (String email : validEmails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " -> " + matcher.matches());
        }

        System.out.println("\nНеправильные адреса");
        String[] invalidEmails = {
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String",
                "user@",
                "@example.com",
        };
        for (String email : invalidEmails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " -> " + matcher.matches());
        }
    }
}