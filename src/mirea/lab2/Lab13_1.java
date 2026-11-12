package mirea.lab2;

public class Lab13_1 {
    public static void main(String[] args) {
        String text = "I like Java!!!";
        System.out.println("Исходная строка: " + text);
        analyzeString(text);
    }

    public static void analyzeString(String str) {
        System.out.println("2. Последний символ: " + str.charAt(str.length() - 1));

        System.out.println("3. Заканчивается на '!!!': " + str.endsWith("!!!"));

        System.out.println("4. Начинается на 'I like': " + str.startsWith("I like"));

        System.out.println("5. Содержит 'Java': " + str.contains("Java"));

        System.out.println("6. Позиция 'Java': " + str.indexOf("Java"));

        String replacedString = str.replace('a', 'o');
        System.out.println("7. Замена 'a' на 'o': " + replacedString);

        String upperString = str.toUpperCase();
        System.out.println("8. Верхний регистр: " + upperString);

        String lowerString = str.toLowerCase();
        System.out.println("9. Нижний регистр: " + lowerString);

        int start = str.indexOf("Java");
        int end = start + "Java".length();
        String javaSubstring = str.substring(start, end);
        System.out.println("10. Вырезанная подстрока: " + javaSubstring);
    }
}