package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); ++j) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
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

        System.out.println("\nSorted (via SelectionSort): ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }
    }

}