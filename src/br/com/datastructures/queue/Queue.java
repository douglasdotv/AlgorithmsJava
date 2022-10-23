package br.com.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    /*
    FIFO - First In, First Out
    */

    private List<String> names = new LinkedList<>();

    public void add(String name) {
        names.add(name);
    }

    public String poll() {
        return names.remove(0);
    }

    public boolean isEmpty() {
        if (names.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return names.toString();
    }

}
