package mirea.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab13_6 {

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        String currentWord = words.remove(0);
        result.append(currentWord);

        while (!words.isEmpty()) {
            boolean found = false;
            char lastChar = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));

            for (int i = 0; i < words.size(); i++) {
                String nextWord = words.get(i);
                char firstChar = Character.toLowerCase(nextWord.charAt(0));

                if (firstChar == lastChar) {
                    result.append(" ").append(nextWord);
                    currentWord = nextWord;
                    words.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = consoleScanner.nextLine();

        List<String> words = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                StringTokenizer tokenizer = new StringTokenizer(line, " ");

                while (tokenizer.hasMoreTokens()) {
                    words.add(tokenizer.nextToken());
                }
            }
            fileScanner.close();

            System.out.println("Слова, прочитанные из файла: " + words);

            if (!words.isEmpty()) {
                String chain = getLine(words);
                System.out.println("\nРезультат (цепочка):");
                System.out.println(chain);
            } else {
                System.out.println("Файл пуст или не содержит слов.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("ОШИБКА: Файл с именем '" + fileName + "' не найден!");
        }
    }
}