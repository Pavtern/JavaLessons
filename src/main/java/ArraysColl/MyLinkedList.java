package ArraysColl;


import org.w3c.dom.Node;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    /**
     * head == null we add an int value = 1. head it's a Node with int value = 1 and Node next = null.  was [null] -> [null] and is [1] -> [null].
     * we add and a value 2 we create a Node temp = head (value = 1 and next = null)) and we see that temp.getNext() == null, we go forward and setNext as a Node with our value 2.
     * This way we created a new Node with int value = 2 and Node next = null. was [1] -> [null] and is [1] -> [2] -> [null].
     **/
    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                if (temp.getNext() != null) {
                    temp = temp.getNext();
                } else {
                    throw new IllegalArgumentException();
                }
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index == 0){
            this.head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {

                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
