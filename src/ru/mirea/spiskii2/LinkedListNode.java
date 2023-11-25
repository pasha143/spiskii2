package ru.mirea.spiskii2;

class LinkedListNode {
    String data;
    LinkedListNode prev;
    LinkedListNode next;

    public LinkedListNode(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}