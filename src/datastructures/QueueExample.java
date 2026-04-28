package datastructures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Demonstrates Java's Queue interface (backed by LinkedList).
 * Covers: add/offer (enqueue), remove/poll (dequeue), element/peek (inspect head).
 */
public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("After add(1,2,3): " + queue);

        queue.offer(4);
        System.out.println("After offer(4): " + queue);

        System.out.println("peek():    " + queue.peek());    // head, no removal
        System.out.println("element(): " + queue.element()); // head, throws if empty

        System.out.println("poll():    " + queue.poll());    // removes head
        System.out.println("remove():  " + queue.remove());  // removes head, throws if empty
        System.out.println("After two removals: " + queue);

        queue.clear();
        System.out.println("After clear(): " + queue);
        System.out.println("peek() on empty: " + queue.peek()); // null, no exception

        try {
            queue.element(); // throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("element() on empty throws: " + e.getClass().getSimpleName());
        }
        try {
            queue.remove(); // throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("remove() on empty throws: " + e.getClass().getSimpleName());
        }
    }
}
