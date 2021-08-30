package com.bridgelabz.hash;

public class Node<K> implements INode<K> {
    private Node<K> next;
    private K key;

    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setkey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (Node<K>)next;
    }
}
