package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    /*
    A sorted array is required when performing a binary search.
    */

    public static <T extends Comparable<? super T>> int search(List<T> list, T value) {
        int start = 0, end = list.size() - 1;

        do {
            int mid = start + (end - start) / 2;
            if (list.get(mid).compareTo(value) == 0) {
                return mid;
            } else if (list.get(mid).compareTo(value) > 0) {
                end = mid;
            } else {
                start = mid + 1;
            }
        } while (start < end);

        return -1;
    }

    public static <T extends Comparable<? super T>> int searchRecursively(List<T> list, T value) {
        return searchRecursively(list, value, 0, list.size() - 1);
    }

    public static <T extends Comparable<? super T>> int searchRecursively(List<T> list, T value, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (list.get(mid).compareTo(value) == 0) {
            return mid;
        }
        if (list.get(mid).compareTo(value) > 0) {
            return searchRecursively(list, value, start, mid - 1);
        }
        return searchRecursively(list, value, mid + 1, end);
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
