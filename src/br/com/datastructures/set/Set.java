package br.com.datastructures.set;

import java.util.ArrayList;
import java.util.LinkedList;

public class Set {

    /*
    A collection that contains no duplicate elements.
    */

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>(); // (an ArrayList of LinkedLists)

    public Set() {
        for (int i = 0; i < 26; i++) {
            table.add(new LinkedList<String>()); // We have a LinkedList for each letter of the alphabet.
        }
    }

    public void add(String word) {
        if (!isInSet(word)) {
            int index = calculateWordIndex(word); // Getting word's first letter.
            table.get(index).add(word); // Working on a specific list inside the table.
        }
    }

    public void remove(String word) {
        if (isInSet(word)) {
            int index = calculateWordIndex(word);
            table.get(index).remove(word);
        }
    }

    private boolean isInSet(String word) {
        int index = calculateWordIndex(word); // Getting word's first letter.
        return table.get(index).contains(word); // Working on a specific list inside the table.
    }

    private int calculateWordIndex(String word) {
        return word.toLowerCase().charAt(0) % 26; // ASCII
    }

    @Override
    public String toString() {
        return table.toString();
    }

}
