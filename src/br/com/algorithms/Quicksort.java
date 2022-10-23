package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quicksort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        sort(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<? super T>> void sort(List<T> list, int start, int end) {
        int left = start, right = end;
        T pivot = list.get((left + right) / 2);

        do {
            while (list.get(left).compareTo(pivot) < 0) {
                left++;
            }
            while (list.get(right).compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right) {
                T temp = list.get(left);
                list.set(left++, list.get(right));
                list.set(right--, temp);
            }
        } while (left <= right);

        if (start < right) {
            sort(list, start, right);
        }
        if (left < end) {
            sort(list, left, end);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < Math.random() * 10 + 10; ++i) {
            myList.add(random.nextInt(100));
        }

        System.out.println("Unsorted: ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }

        sort(myList);

        System.out.println("\nSorted (via Quicksort): ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }
    }

}