package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        sort(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<? super T>> void sort(List<T> list, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            sort(list, start, mid);
            sort(list, mid + 1, end);
            merge(list, start, mid, end);
        }
    }

    private static <T extends Comparable<? super T>> void merge(List<T> list, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (list.get(i).compareTo(list.get(j)) < 0) {
                temp[k++] = list.get(i++);
            } else {
                temp[k++] = list.get(j++);
            }
        }

        while (i <= mid) {
            temp[k++] = list.get(i++);
        }
        while (j <= end) {
            temp[k++] = list.get(j++);
        }

        for (i = start; i <= end; i++) {
            list.remove(i);
            list.add(i, temp[i - start]);
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

        System.out.println("\nSorted (via MergeSort): ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }
    }

}
