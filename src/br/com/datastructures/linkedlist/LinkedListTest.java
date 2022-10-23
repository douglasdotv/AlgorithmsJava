package br.com.datastructures.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("Empty LinkedList: ");
        System.out.println(list);

        System.out.println("\nAdding an element at the beginning of the LinkedList: ");
        list.addAtTheBeginning("A");
        System.out.println(list);

        System.out.println("\nAdding another element at the beginning of the LinkedList: ");
        list.addAtTheBeginning("B");
        System.out.println(list);

        System.out.println("\nAdding an element at the end of the LinkedList: ");
        list.addAtTheEnd("C");
        System.out.println(list);

        System.out.println("\nAdding an element at a specific index (for example, at index = 2): ");
        list.add("D", 2);
        System.out.println(list);

        System.out.println("\nGetting a specific element (for example, an element at index = 1): ");
        System.out.println(list.getNodeElement(1));

        System.out.println("\nGetting LinkedList size: ");
        System.out.println(list.getLinkedListSize());

        System.out.println("\nRemoving the first element: ");
        list.removeFirstElement();
        System.out.println(list);

        System.out.println("\nRemoving the last element: ");
        list.removeLastElement();
        System.out.println(list);

        System.out.println("\nRemoving an element at index i = 1: ");
        list.removeElement(1);
        System.out.println(list);

        System.out.println("\nChecking if an element is included in the LinkedList: ");
        System.out.println("Does it include A? " + list.isInLinkedList("A"));
        System.out.println("Does it include B? " + list.isInLinkedList("B"));

        /*
        LinkedList is a class present in java.util package.
        */

    }

}
