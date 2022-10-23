package br.com.datastructures.stack;

public class StackTest {

    public static void main(String[] args) {

        System.out.println("Initializing a stack: ");
        Stack stack = new Stack();
        System.out.println(stack);

        System.out.println("\nAdding an element to the stack via push() method: ");
        stack.push("A");
        System.out.println(stack);

        System.out.println("\nAdding an element to the stack via push() method: ");
        stack.push("B");
        System.out.println(stack);

        System.out.println("\nRemoving elements via pop() method and printing the resulting stack: ");
        String n1 = stack.pop();
        String n2 = stack.pop();
        System.out.println(stack);
        System.out.println(n1);
        System.out.println(n2);

        System.out.println("\nChecking if the stack is empty: \nIs the stack " + stack + " empty?");
        if (stack.isEmpty()) {
            System.out.println("Yes, it's empty.");
        } else {
            System.out.println("No, it's not empty.");
        }

        /*
        Stack is a class present in java.util package.
        */

    }

}
