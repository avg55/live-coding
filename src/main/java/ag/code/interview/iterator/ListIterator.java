package ag.code.interview.iterator;

/**
 * Написать метод print, выводящий все элементы связного списка в прямом порядке
 */

public class ListIterator {

    public void print(Node head) {
        if (head == null) {
            System.out.println("Node is null");
            return;
        }
        Node current = head;
        do {
            System.out.println(current.value);
            current = current.next;
        } while (current != null);
    }

    static class Node {
        Node next;
        int value;
    }

    public static void main(String[] args) {

        ListIterator iter = new ListIterator();

        Node oneAndTwo = new Node();
        oneAndTwo.value = 1;
        oneAndTwo.next = new Node();
        oneAndTwo.next.value = 2;

        iter.print(oneAndTwo);

        iter.print(null);

        Node one = new Node();
        one.value = 1;

        iter.print(one);

    }
}

