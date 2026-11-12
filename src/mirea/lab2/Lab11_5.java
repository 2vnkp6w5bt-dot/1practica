package mirea.lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab11_5 {
    private static final int N = 100000;

    public static void main(String[] args) {

        System.out.println("Количество элементов: " + N);

        testAdd("Добавление в конец", new ArrayList<>(), new LinkedList<>());

        testAddStart("Добавление в начало", new ArrayList<>(), new LinkedList<>());

        List<Integer> arrayListGet = createAndFill(new ArrayList<>());
        List<Integer> linkedListGet = createAndFill(new LinkedList<>());
        testGet("Поиск по индексу", arrayListGet, linkedListGet);

        List<Integer> arrayListRemove = createAndFill(new ArrayList<>());
        List<Integer> linkedListRemove = createAndFill(new LinkedList<>());
        testRemove("Удаление из середины", arrayListRemove, linkedListRemove);
    }

    // Метод для теста добавления в конец
    private static void testAdd(String testName, List<Integer> arrayList, List<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long end = System.nanoTime();
        long arrayListTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        end = System.nanoTime();
        long linkedListTime = end - start;

        printResult(testName, arrayListTime, linkedListTime);
    }

    // Метод для теста добавления в начало
    private static void testAddStart(String testName, List<Integer> arrayList, List<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(0, i);
        long end = System.nanoTime();
        long arrayListTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(0, i);
        end = System.nanoTime();
        long linkedListTime = end - start;

        printResult(testName, arrayListTime, linkedListTime);
    }

    // Метод для теста поиска
    private static void testGet(String testName, List<Integer> arrayList, List<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.get(i);
        long end = System.nanoTime();
        long arrayListTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.get(i);
        end = System.nanoTime();
        long linkedListTime = end - start;

        printResult(testName, arrayListTime, linkedListTime);
    }

    // Метод для теста удаления из середины
    private static void testRemove(String testName, List<Integer> arrayList, List<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < N / 2; i++) arrayList.remove(arrayList.size() / 2);
        long end = System.nanoTime();
        long arrayListTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < N / 2; i++) linkedList.remove(linkedList.size() / 2);
        end = System.nanoTime();
        long linkedListTime = end - start;

        printResult(testName, arrayListTime, linkedListTime);
    }

    private static List<Integer> createAndFill(List<Integer> list) {
        for (int i = 0; i < N; i++) list.add(i);
        return list;
    }

    private static void printResult(String testName, long arrayTime, long linkedTime) {
        System.out.printf("%s | ArrayList: %.2f мс | LinkedList: %.2f мс%n",
                testName, arrayTime / 1_000_000.0, linkedTime / 1_000_000.0);
    }
}