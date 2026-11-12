package mirea.lab2;

    public class Sorting {

        public static void StudentSort(Student[] students) {
            for (int i = 1; i < students.length; i++) {
                Student key = students[i];
                int j = i - 1;
                while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                    students[j + 1] = students[j];
                    j--;
                }
                students[j + 1] = key;
            }
        }
    }