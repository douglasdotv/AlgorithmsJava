package br.com.datastructures.linkedlist;

public class Node {

    private Object element;
    private Node previousNode;
    private Node nextNode;

    public Node(Object element) {
        this(element, null);
    }

    public Node(Object element, Node nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Object getElement() {
        return element;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

}
