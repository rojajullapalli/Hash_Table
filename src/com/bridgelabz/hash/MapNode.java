package com.bridgelabz.hash;

public class MapNode<K, V> implements INode<K> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
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

    public V getValue() {
        return this.value;
    }

    public void setValue (V value) {
        this.value = value;
    }

    public void setNext(INode<K> next) {
        this.next = (MapNode<K, V>) next;
    }
    @Override
    public String toString() {
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MapNode{" + "K=").append(key)
                .append(" V=").append(value).append('}');
        if (next != null) {
            mapNodeString.append("->").append(next);
        }
        return mapNodeString.toString();
    }

}

