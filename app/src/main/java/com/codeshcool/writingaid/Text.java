package com.codeshcool.writingaid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by davinasanders on 31/05/2018.
 */

public abstract class Text {
    private String title;
    private String date;
    protected Integer wordCount;
    protected HashMap<String, Integer> myWords;

    public Text(String title, String date) {
        this.title = title;
        this.date = date;
        this.wordCount = 0;
        this.myWords = new HashMap<>();

    }

    public Integer getWordCount() {
        return this.wordCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

    public int getMyWords() {
        return this.myWords.size();
    }

    //getters

//    public Integer countWords(){
//
//    }


    //
//    public int CountWords(String string){
//        return string.split(" ").length;
//    }
//
//    public String CountWordsMessage(String string){
//        return  CountWords(string) + " words entered";
//    }
//
//    public HashMap<String, Integer> getHashMap(){
//        return this.myWords;
//    }
//
    public void addToMap(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 0;
        for (String word : userInput) {
            number += 1;
            myWords.put(word, number);
        }
    }
}
