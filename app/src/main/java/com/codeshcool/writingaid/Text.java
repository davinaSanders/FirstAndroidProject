package com.codeshcool.writingaid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by davinasanders on 31/05/2018.
 */

public abstract class Text {
    private int entry;
    private String date;
    protected int wordCount;
    protected HashMap<String, Integer> myWords;

    public Text(int entry, String date) {
        this.entry = entry;
        this.date = date;
        this.wordCount = 0;
        this.myWords = new HashMap<>();

    }

    public int getWordCount() {
        return this.wordCount;
    }

    public int getEntry() {
        return this.entry;
    }

    public String getDate() {
        return this.date;
    }

    public HashMap<String, Integer> getMyWords() { return this.myWords;}

    public int getMyWordsCount(){
        return this.myWords.size();
    }

    //getters


    public int countSentences(String string) {
        return string.split("\\.").length;
    }

    public int countWords(String string) {
        return string.split(" ").length;
    }

    public int countCharacters(String string) {
        return string.split("").length;
    }

    public int countSyllables(String string) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u", "y"};
        int syllableCounter = 0;
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.replace(".", "").toLowerCase().split(" ")));
        System.out.println(userInput);
        for (String word : userInput) {
            String[] letters = word.split("");
            System.out.println(letters);
            for (int i = 0; i < letters.length; i++) {
                System.out.println(letters.length);
                    if ((Arrays.asList(vowels).contains(letters[i]))) {
                        if (!(((i == letters.length-1)) && (letters[i].equals("e")))) {
                            syllableCounter++;
                            System.out.println(syllableCounter);
                            System.out.println(letters[i]);
                            System.out.println(letters.length);
                            if (i < letters.length-1){
                                if (Arrays.asList(vowels).contains(letters[i + 1])) {
                                    i ++;
                                }
                            }
                        }
                    }
                }
            }
            return syllableCounter;
        }



    // Counters

    public int averageWordLength(String string) {
        int totalLetters = 0;
        int average = 0;
        String[] words = string.split(" ");
            for (String word : words) {
                totalLetters += this.countCharacters(word);
            }
             average = totalLetters / words.length;
        return average;
    }

    public int averageSentenceLength(String string) {
        int totalWords = 0;
        int average = 0;
        String[] sentences = string.split("\\.");

            for (String sentence : sentences) {
                totalWords += this.countWords(sentence);
            }
            average = totalWords/sentences.length;
        return average;
    }

    // averages


    public void addToMap(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 1;
        for (String word : userInput) {
            if(!(myWords.containsKey(word))) {
                myWords.put(word, number);
            } else {
                myWords.put(word, myWords.get(word) + 1);

                }
        }
    }

    // record all the words and their frequency in a hashmap

}
