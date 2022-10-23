package br.com.datastructures.set;

public class SetTest {

    public static void main(String[] args) {

        System.out.println("Initializing a set: ");
        Set set = new Set();
        System.out.println(set);

        System.out.println("\nAdding an element: ");
        set.add("Aa");
        System.out.println(set);

        System.out.println("\nTrying to add the same element as before: ");
        set.add("Aa");
        System.out.println(set);
        System.out.println("(No changes are made at all.)");

        System.out.println("\nAdding other elements: ");
        set.add("Bb");
        set.add("Cc");
        set.add("Ab");
        set.add("Ii");
        set.add("Xy");
        set.add("Xz");
        System.out.println(set);

        System.out.println("\nRemoving an element (for example, 'Xy'): ");
        set.remove("Xy");
        System.out.println(set);

        /*
        Set is an interface present in java.util package, and we can use HashSet class to implement it:
        java.util.Set<String> javaSet = new HashSet<String>();
        hashCode() method provides hashCode values for a given instance of a Set.
        */

    }

}
