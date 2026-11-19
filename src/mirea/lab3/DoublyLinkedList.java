package mirea.lab3;

public class DoublyLinkedList implements CustomList {
    private class Node {
        Student data;
        Node next;
        Node prev;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
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
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public void remove(String name) {
        if (isEmpty()) return;

        Node current = head;
        while (current != null && !current.data.toString().contains(name)) {
            current = current.next;
        }

        if (current == null) return;

        if (current == head) head = current.next;
        if (current == tail) tail = current.prev;
        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
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
        tail = null;
        System.out.println("Список очищен.");
    }
}