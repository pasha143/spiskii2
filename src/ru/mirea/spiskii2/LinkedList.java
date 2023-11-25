package ru.mirea.spiskii2;
//v15(4) 4.Элемент двусвязного списка содержит ссылку на строку в динамической памяти.
// Написать методы просмотра списка и включения очередной строки
// с сохранением упорядоченности по длине строки и алфавиту//
class LinkedList {
    private LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(String data) {
        LinkedListNode newNode = new LinkedListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode current = head;

            while (current != null && (current.data.length() < newNode.data.length() ||
                    (current.data.length() == newNode.data.length() && current.data.compareTo(newNode.data) < 0))) {
                current = current.next;
            }

            if (current == null) {
                LinkedListNode tail = head;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = newNode;
                newNode.prev = tail;
            } else {
                newNode.next = current;
                newNode.prev = current.prev;

                if (current.prev != null) {
                    current.prev.next = newNode;
                } else {
                    head = newNode;
                }

                current.prev = newNode;
            }
        }
    }

    public void display() {
        LinkedListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

