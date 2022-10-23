package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 0; i < list.size(); ++i) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; ++j) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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

        System.out.println("\nSorted (via BubbleSort): ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }
    }

}