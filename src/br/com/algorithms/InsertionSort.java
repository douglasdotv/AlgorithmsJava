package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 1; i < list.size(); ++i) {
            T temp = list.get(i);
            int j = i - 1;
            while (j >= 0 && temp.compareTo(list.get(j)) < 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
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

        System.out.println("\nSorted (via InsertionSort): ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }
    }

}