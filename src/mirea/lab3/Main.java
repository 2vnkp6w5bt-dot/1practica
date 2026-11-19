package mirea.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите структуру данных для картотеки:");
        System.out.println("1. Односвязный список");
        System.out.println("2. Двусвязный список");
        System.out.println("3. Кольцевой список");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        CustomList list = null;

        switch (choice) {
            case 1: list = new SinglyLinkedList(); break;
            case 2: list = new DoublyLinkedList(); break;
            case 3: list = new CircularLinkedList(); break;
            default:
                System.out.println("Неверный выбор. Программа завершена.");
                return;
        }

        runMenu(list, scanner);
    }

    private static void runMenu(CustomList list, Scanner scanner) {
        while (true) {
            System.out.println("\nМЕНЮ");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента по имени");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти и вывести одного студента");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить, пуст ли список");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    list.add(new Student(name, age));
                    System.out.println("Студент добавлен.");
                    break;
                case 2:
                    System.out.print("Введите имя для удаления: ");
                    list.remove(scanner.nextLine());
                    System.out.println("Команда выполнена.");
                    break;
                case 3:
                    System.out.println("Список студентов");
                    list.print();
                    break;
                case 4:
                    System.out.print("Введите имя для поиска: ");
                    list.printElement(scanner.nextLine());
                    break;
                case 5:
                    list.clear();
                    break;
                case 6:
                    if (list.isEmpty()) System.out.println("Список пуст.");
                    else System.out.println("В списке есть элементы.");
                    break;
                case 0:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Неверная команда.");
            }
        }
    }
}