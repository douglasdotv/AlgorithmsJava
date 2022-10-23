package br.com.datastructures.dynamicarray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        Person m1 = new Person("A");
        Person m2 = new Person("B");
        Person m3 = new Person("C");

        System.out.println("Adding two elements to the dynamic array: ");
        dynamicArray.addMember(m1);
        dynamicArray.addMember(m2);
        System.out.println(dynamicArray);

        System.out.println("\nGetting the total amount of elements: ");
        System.out.println(dynamicArray.getArraySize());

        System.out.println("\nGetting a specific element (for example, an element at index = 1): ");
        System.out.println(dynamicArray.getMember(1));

        System.out.println("\nChecking if an element is included in the vector: ");
        System.out.println("Is " + m1.getName() + " in the array? " + dynamicArray.isInArray(m1));
        System.out.println("Is " + m3.getName() + " in the array? " + dynamicArray.isInArray(m3));

        System.out.println("\nAdding something at a specific index (for example, at index 1): ");
        dynamicArray.addMember(m3, 1);
        System.out.println(dynamicArray);

        /*
        Notes:
        1) System.out.println(dynamicArray.getMember(99)) would return 'null' (index exists, but points to null)
        2) System.out.println(dynamicArray.getMember(171)) would throw an exception (there isn't such a index)
        3) dynamicArray.addMember(new Member("X"), 60) would throw an exception (index must be lower than totalMembers)
        */

        System.out.println("\nRemoving a specific element (for example, an element at index 1): ");
        dynamicArray.removeMember(1);
        System.out.println(dynamicArray);

        System.out.println("\nTesting secureSpace() method — dynamically changing structure size: ");
        for (int i = 0; i < 500; i++) {
            Person m = new Person("Name " + i);
            dynamicArray.addMember(m);
        }
        System.out.println(dynamicArray);

        /*
        ArrayList and Vector are both classes present in java.util package that
        can implement List interface and emulate a dynamically resizable array.
        */

    }

}