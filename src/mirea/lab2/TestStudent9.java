package mirea.lab2;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(103, 4.0),
                new Student(101, 4.5),
                new Student(105, 3.4),
                new Student(102, 5.0),
                new Student(104, 3.4)
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

        SortingStudentByGPA sort = new SortingStudentByGPA();
        sort.quickSort(students, 0, students.length-1);
        System.out.println("\nПосле сортировки по GPA:");
        for (Student s : students) {
            System.out.println(s);
        }


    }
}