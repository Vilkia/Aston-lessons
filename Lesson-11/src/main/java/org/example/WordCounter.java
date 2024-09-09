package org.example;

import java.util.*;

public class WordCounter {

    private Map<String, Integer> wordCount;

    public WordCounter() {
        this.wordCount = new HashMap<>();
    }
    public void addWords(String[] words) {
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
    public Map<String, Integer> getWordCount() {
        return wordCount;
    }
    public void printWordCount() {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();

        String[] words = {
                "apple", "banana", "cherry", "apple", "banana", "pear",
                "orange", "kiwi", "pear", "apple", "kiwi", "cherry",
                "grape", "orange", "banana", "kiwi", "mango", "grape",
                "peach", "plum", "cherry", "pear", "apple", "mango",
                "peach", "plum", "banana", "cherry", "grape"
        };

        wordCounter.addWords(words);

        System.out.println("Уникальные слова и количество их вхождений:");
        wordCounter.printWordCount();
    }
}
