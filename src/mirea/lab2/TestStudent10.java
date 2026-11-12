package mirea.lab2;

public class TestStudent10 {
    public static void main(String[] args) {

        SortingStudentByGPA sorter = new SortingStudentByGPA();
        sorter.setArray();

        System.out.println("\nИсходный массив:");
        sorter.outArray();

        System.out.println("\nQuick Sort по GPA");
        sorter.quickSort(sorter);
        sorter.outArray();

        System.out.println("\nQuick Sort по ID");
        sorter.quickSort(new IdComparator());
        sorter.outArray();

        System.out.println("\nMerge Sort по GPA");
        sorter.mergeSort(sorter);
        sorter.outArray();
    }
}