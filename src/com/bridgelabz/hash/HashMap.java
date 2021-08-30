package com.bridgelabz.hash;

import java.util.ArrayList;

public class HashMap<K, V> {
    private final int numBuckets;
    ArrayList<NewLinkList<K>> bucketArray;

    public HashMap() {
        this.numBuckets =10;
        this.bucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++){
            this.bucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        NewLinkList<K> linkedList = this.bucketArray.get(index);
        if(linkedList == null) {
            return null;
        }
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex (key);
        NewLinkList<K> linkedList = this.bucketArray.get(index);
        if(linkedList == null) {
            linkedList = new NewLinkList<> ();
            this.bucketArray.set(index, linkedList);
        }
        MapNode<K, V> mapNode = (MapNode<K,V>) linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }
    @Override
    public String toString() {
        return "MyLinkedHashMap List" + bucketArray + '}';
    }
}

