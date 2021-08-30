package com.bridgelabz.hash;

public class HashMap<K, V> {
    NewLinkList<K> NewLinkList;

    public HashMap() {
        this.NewLinkList = new NewLinkList<>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.NewLinkList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void addVal(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.NewLinkList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.NewLinkList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString(){
        return "MyHashMapNodes{"+NewLinkList+'}';
    }
}
