package br.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxMinValue {

    public static <T extends Comparable<? super T>> ArrayList<T> getMinMaxArrayList(List<T> list) {
        T max = list.get(0), min = list.get(0);
        for (T t : list) {
            if (t.compareTo(max) < 0) {
                max = t;
            } else if (t.compareTo(min) > 0) {
                min = t;
            }
        }
        ArrayList<T> minMaxArrayList = new ArrayList<>();
        minMaxArrayList.add(max);
        minMaxArrayList.add(min);
        return minMaxArrayList;
    }

    public static <T extends Comparable<? super T>> T getMaxValueRecursively(List<T> list) {
        return getMaxValueRecursively(list, 0, list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T getMaxValueRecursively(List<T> list, int start, int end) {
        if (end - start <= 1) {
            return list.get(start).compareTo(list.get(end)) > 0 ? list.get(start) : list.get(end);
        }
        int mid = (start + end) / 2;
        T ml = getMaxValueRecursively(list, start, mid);
        T mr = getMaxValueRecursively(list, mid + 1, end);
        return ml.compareTo(mr) > 0 ? ml : mr;
    }

    public static <T extends Comparable<? super T>> T getMinValueRecursively(List<T> list) {
        return getMinValueRecursively(list, 0, list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T getMinValueRecursively(List<T> list, int start, int end) {
        if (end - start <= 1) {
            return list.get(start).compareTo(list.get(end)) < 0 ? list.get(start) : list.get(end);
        }
        int mid = (start + end) / 2;
        T ml = getMinValueRecursively(list, start, mid);
        T mr = getMinValueRecursively(list, mid + 1, end);
        return ml.compareTo(mr) < 0 ? ml : mr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < Math.random() * 10 + 10; ++i) {
            myList.add(random.nextInt(100));
        }

        System.out.println("myList: ");
        for (Integer x : myList) {
            System.out.print(x + " ");
        }

        System.out.println("\nminValue: " + getMinMaxArrayList(myList).get(0)
                + "\nmaxValue: " + getMinMaxArrayList(myList).get(1));

        System.out.println("minValue: " + getMinValueRecursively(myList)
                + "\nmaxValue: " + getMaxValueRecursively(myList));
    }

}

