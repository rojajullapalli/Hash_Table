package com.bridgelabz.hash;

public class HashMain {
    public static void main(String[] args) {
        String sentence = "to be or not to be";
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = hashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.addVal(word , value);
        }
        System.out.println(hashMap);

    }
}
