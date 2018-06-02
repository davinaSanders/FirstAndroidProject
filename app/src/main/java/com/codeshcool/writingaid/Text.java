package com.codeshcool.writingaid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by davinasanders on 31/05/2018.
 */

public abstract class Text {
    private String title;
    private String date;
    protected int wordCount;
    protected HashMap<String, Integer> myWords;

    public Text(String title, String date) {
        this.title = title;
        this.date = date;
        this.wordCount = 0;
        this.myWords = new HashMap<>();

    }

    public int getWordCount() {
        return this.wordCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

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
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        for (String word : userInput) {
//            System.out.println(word.toString());
            String[] letters = word.split("");
            for (int i = 0; i < letters.length; i++) {
                for (String letter : letters) {
//                    System.out.println(letter.toString());
//                    for (String vowel : vowels){
//                        System.out.println(vowel.toString());
                    if ((Arrays.asList(vowels).contains(letter))) {
                        if (!(((i == letters.length)) && (letter.equals("e")))) {
                            syllableCounter++;
                            if (Arrays.asList(vowels).contains(letters[i + 1])) {
                                i++;
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
        int number = 0;
        for (String word : userInput) {
            number += 1;
            myWords.put(word, number);
        }
    }

    // record all the words and their frequency in a hashmap

}
