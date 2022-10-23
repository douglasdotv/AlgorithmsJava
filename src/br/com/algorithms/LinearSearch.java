package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static <T extends Comparable<? super T>> int search(List<T> list, T value) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> int searchRecursively(List<T> list, T value) {
        return searchRecursively(list, value, 0, list.size() - 1);
    }

    public static <T extends Comparable<? super T>> int searchRecursively(List<T> list, T value, int start, int end) {
        if (end < start) {
            return -1;
        }
        if (list.get(end) == value) {
            return end;
        }
        if (list.get(start) == value) {
            return start;
        }
        return searchRecursively(list, value, start + 1, end - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            myList.add(2 * i);
        }

        System.out.println("myList: ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }

        System.out.println("\nSearching for values inside myList: ");
        for (int i = 0; i < 10; ++i) {
            if (search(myList, i) != -1) {
                System.out.println(i + " was found at index " + searchRecursively(myList, i));
            } else {
                System.out.println(i + " was not found.");
            }
        }
        System.out.println("etc.");
    }

}
