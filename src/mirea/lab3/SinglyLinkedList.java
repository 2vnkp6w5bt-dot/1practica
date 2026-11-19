package mirea.lab3;

public class SinglyLinkedList implements CustomList {
    private class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public void remove(String name) {
        if (head == null) return;

        if (head.data.toString().contains(name)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.toString().contains(name)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    @Override
    public void printElement(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.data.toString().contains(name)) {
                System.out.println("Найден элемент: " + current.data);
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) System.out.println("Элемент с именем '" + name + "' не найден.");
    }

    @Override
    public void clear() {
        head = null;
        System.out.println("Список очищен.");
    }
}