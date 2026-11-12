package mirea.lab2;

public class TestMerge {
    public static void main(String[] args) {

        Student[] list1 = {
                new Student("Иван", "Иванов", "ПИ", 2, "ИУ7-21Б", 103, 4.0),
                new Student("Анна", "Петрова", "ПМ", 1, "ПМ-11", 101, 5.0),
                new Student("Мария", "Сидорова", "ИБ", 3, "ИБ-31", 105, 3.4)
        };

        Student[] list2 = {
                new Student("Петр", "Смирнов", "ПИ", 2, "ИУ7-21Б", 102, 4.5),
                new Student("Ольга", "Кузнецова", "ПМ", 1, "ПМ-11", 104, 3.9),
                new Student("Глеб", "Орлов", "ИБ", 3, "ИБ-31", 106, 4.8)
        };

        SortingStudentByGPA sorter = new SortingStudentByGPA();
        sorter.quickSort(list1, sorter);
        sorter.quickSort(list2, sorter);
        Student[] merged = SortingStudentByGPA.mergeTwoArrays(list1, list2, sorter);

        for (Student s : merged) {
            System.out.println(s);
        }
    }
}