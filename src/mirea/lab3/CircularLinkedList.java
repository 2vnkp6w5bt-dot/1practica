package mirea.lab3;

public class CircularLinkedList implements CustomList {
    private class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;

    public CircularLinkedList() {
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
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    @Override
    public void remove(String name) {
        if (isEmpty()) return;

        Node current = head;
        Node prev = null;

        if (head.data.toString().contains(name)) {
            if (head.next == head) {
                head = null;
            } else {
                Node last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            }
            return;
        }

        do {
            prev = current;
            current = current.next;
        } while (current != head && !current.data.toString().contains(name));

        if (current != head) {
            prev.next = current.next;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    @Override
    public void printElement(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        boolean found = false;
        do {
            if (current.data.toString().contains(name)) {
                System.out.println("Найден элемент: " + current.data);
                found = true;
                break;
            }
            current = current.next;
        } while (current != head);
        if (!found) System.out.println("Элемент с именем '" + name + "' не найден.");
    }

    @Override
    public void clear() {
        head = null;
        System.out.println("Список очищен.");
    }
}