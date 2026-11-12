package mirea.lab2;
import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {
    private Student[] students;
    private int size;

    public void setArray() {
        students = new Student[5];
        students[0] = new Student("Иван", "Иванов", "Программная инженерия", 2, "ИУ7-21Б", 103, 4.0);
        students[1] = new Student("Анна", "Петрова", "Прикладная математика", 1, "ПМ-11", 101, 4.5);
        students[2] = new Student("Мария", "Сидорова", "Информатика", 3, "ИБ-31", 105, 3.4);
        students[3] = new Student("Петр", "Смирнов", "Программная инженерия", 2, "ИУ7-21Б", 102, 5.0);
        students[4] = new Student("Ольга", "Кузнецова", "Прикладная математика", 1, "ПМ-11", 104, 3.4);
        size = 5;
    }

    public void outArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }

    //Быстрая сортировка
    public void quickSort(Comparator<Student> comp) {
        quickSortRecursive(students, 0, size - 1, comp);
    }

    private void quickSortRecursive(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pi = partition(arr, low, high, comp);
            quickSortRecursive(arr, low, pi - 1, comp);
            quickSortRecursive(arr, pi + 1, high, comp);
        }
    }

    private int partition(Student[] students, int low, int high, Comparator<Student> comp) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comp.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }

        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }
    //Сортировка слиянием
    public void mergeSort(Comparator<Student> comp) {
        if (students.length < 2) {
            return;
        }
        mergeSortRecursive(students, comp);
    }

    private void mergeSortRecursive(Student[] arr, Comparator<Student> comp) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        mergeSortRecursive(left, comp);
        mergeSortRecursive(right, comp);
        merge(arr, left, right, comp);
    }

    private void merge(Student[] result, Student[] left, Student[] right, Comparator<Student> comp) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comp.compare(left[i], right[j]) >= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    //Быстрая сортировка для внешних массивов
    public void quickSort(Student[] externalArray, Comparator<Student> comp) {
        quickSortRecursive(externalArray, 0, externalArray.length - 1, comp);
    }
    // Метод для слияния двух уже отсортированных массивов в один
    public static Student[] mergeTwoArrays(Student[] arr1, Student[] arr2, Comparator<Student> comp) {
        Student[] result = new Student[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (comp.compare(arr1[i], arr2[j]) >= 0) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }
}


