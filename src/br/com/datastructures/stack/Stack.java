package br.com.datastructures.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    /*
    LIFO – Last In, First Out
    */

    private List<String> names = new LinkedList<String>();

    public void push(String name) {
        names.add(name);
    }

    public String pop() {
        return names.remove(names.size() - 1);
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
