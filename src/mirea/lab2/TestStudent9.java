package mirea.lab2;

public class TestStudent9 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", "Иванов", "ПИ", 2, "ИУ7-21Б", 103, 4.0),
                new Student("Анна", "Петрова", "ПМ", 1, "ПМ-11", 101, 4.5),
                new Student("Мария", "Сидорова", "ИБ", 3, "ИБ-31", 105, 3.4),
                new Student("Петр", "Смирнов", "ПИ", 2, "ИУ7-21Б", 102, 5.0),
                new Student("Ольга", "Кузнецова", "ПМ", 1, "ПМ-11", 104, 3.4)
        };

        System.out.println("До сортировки по ID:");
        for (Student s : students) {
            System.out.println(s);
        }

        Sorting.StudentSort(students);
        System.out.println("\nПосле сортировки по ID:");
        for (Student s : students) {
            System.out.println(s);
        }

    }
}