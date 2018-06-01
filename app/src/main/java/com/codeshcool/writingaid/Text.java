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

    //getters


    public int countSentences(String string){
    return string.split("\\.").length;
    }

    public int countWords(String string){
        return string.split(" ").length;
    }

    public int countLetters(String string){
        return string.split("").length;
    }

    public int averageWordLength(String string){
        int totalLetters = 0;
         String[] words = string.split(" ");
         for (word : words){
             totalLetters += this.countLetters(word);
         }
    }

    public int getMyWords(){
        return this.myWords.size();
    }

    public void addToMap(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 0;
        for (String word : userInput) {
            number += 1;
            myWords.put(word, number);
        }
    }
}
