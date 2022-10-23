package br.com.datastructures.linkedlist;

public class LinkedList {

    private Node firstNode = null;
    private Node lastNode = null;
    private int totalElements = 0;

    public void addAtTheBeginning(Object element) {
        if (this.totalElements == 0) {
            Node newNode = new Node(element);
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            Node newNode = new Node(element, this.firstNode);
            this.firstNode.setPreviousNode(newNode);
            this.firstNode = newNode;
        }
        this.totalElements++;
    }

    public void addAtTheEnd(Object element) {
        if (this.totalElements == 0) {
            addAtTheBeginning(element);
        } else {
            Node newNode = new Node(element);
            this.lastNode.setNextNode(newNode);
            newNode.setPreviousNode(this.lastNode);
            this.lastNode = newNode;
            this.totalElements++;
        }
    }

    private boolean isValidPosition(int index) {
        return (index >= 0 && index < this.totalElements);
    }

    private Node getNode(int index) {
        if (!isValidPosition(index)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        Node currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void add(Object element, int index) {
        if (index == 0) {
            addAtTheBeginning(element);
        } else if (index == this.totalElements) {
            addAtTheEnd(element);
        } else {
            Node previousNode = this.getNode(index - 1);
            Node nextNode = previousNode.getNextNode();
            Node newNode = new Node(element, nextNode);
            newNode.setPreviousNode(previousNode);
            previousNode.setNextNode(newNode);
            nextNode.setPreviousNode(newNode);
            this.totalElements++;
        }
    }

    public void removeFirstElement() {
        if (this.totalElements == 0) {
            throw new IllegalArgumentException("How are you going to remove stuff from an empty list?");
        }
        this.firstNode = this.firstNode.getNextNode();
        this.totalElements--;
        if (this.totalElements == 0) {
            this.lastNode = null;
        }
    }

    public void removeLastElement() {
        if (this.totalElements == 0) {
            throw new IllegalArgumentException("How are you going to remove stuff from an empty list?");
        } else if (this.totalElements == 1) {
            removeFirstElement();
        } else {
            Node secondToLastNode = this.lastNode.getPreviousNode();
            this.lastNode = secondToLastNode;
            secondToLastNode.setNextNode(null);
            this.totalElements--;
        }
    }

    public void removeElement(int index) {
        if (index == 0) {
            removeFirstElement();
        } else if (index == this.totalElements - 1) {
            removeLastElement();
        } else {
            Node previousNode = this.getNode(index - 1);
            Node currentNode = previousNode.getNextNode();
            Node nextNode = currentNode.getNextNode();
            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
            this.totalElements--;
        }
    }

    public Object getNodeElement(int index) {
        return this.getNode(index).getElement();
    }

    public int getLinkedListSize() {
        return this.totalElements;
    }

    public boolean isInLinkedList(Object element) {
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            if (currentNode.getElement().equals(element)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.totalElements == 0) {
            return "[]";
        }
        Node currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getElement() + ", ");
            currentNode = currentNode.getNextNode();
        }

        builder.append("]");
        return builder.toString();
    }

}
