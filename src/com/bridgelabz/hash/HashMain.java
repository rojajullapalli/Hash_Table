package com.bridgelabz.hash;

public class HashMain {
    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves deliberately into paranoid avoidable situations";
        HashMap<String, Integer> linkedHashMap = new HashMap<>();
        String[] sentenceToWords = sentence.toLowerCase().split(" ");
        for (String word : sentenceToWords) {
            Integer value = linkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            linkedHashMap.add(word, value);
        }
        System.out.println(linkedHashMap);
    }
}
