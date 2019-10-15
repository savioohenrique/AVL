package br.com.imd;

public class Node<T extends Indexable> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void setValue(T value) {
        this.value = value;
    }

//    public void accessInOrder(NodeVisitor v) {
//        if (this.left != null) {
//            this.left.accessInOrder(v);
//        }
//
//        v.visit(this);
//
//        if (this.right != null) {
//            this.right.accessInOrder(v);
//        }
//    }

    public T getValue() {
        return value;
    }
}

