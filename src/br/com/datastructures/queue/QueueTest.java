package br.com.datastructures.queue;

public class QueueTest {

    public static void main(String[] args) {

        System.out.println("Initializing a new queue: ");
        Queue queue = new Queue();
        System.out.println(queue);

        System.out.println("\nAdding an element to the queue via add() method: ");
        queue.add("A");
        System.out.println(queue);

        System.out.println("\nAdding an element to the queue via add() method: ");
        queue.add("B");
        System.out.println(queue);

        System.out.println("\nAdding an element to the queue via add() method: ");
        queue.add("C");
        System.out.println(queue);

        System.out.println("\nRemoving elements via poll() method.");
        String n1 = queue.poll();
        String n2 = queue.poll();
        System.out.println("Removed elements: ");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Updated queue: ");
        System.out.println(queue);

        System.out.println("\nChecking if the queue is empty: \nIs the queue " + queue + " empty?");
        if (queue.isEmpty()) {
            System.out.println("Yes, it's empty.");
        } else {
            System.out.println("No, it's not empty.");
        }

        /*
        Queue is an interface present in java.util package, and we can use LinkedList class to implement it:
        java.util.Queue<String> javaQueue = new LinkedList<>();
        */

    }
}