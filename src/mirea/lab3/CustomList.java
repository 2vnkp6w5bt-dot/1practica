package mirea.lab3;

public interface CustomList {
    void add(Student student);
    void remove(String name);
    void print();
    void printElement(String name);
    void clear();
    boolean isEmpty();
}