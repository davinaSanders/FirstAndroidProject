package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.ICount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class Diary extends Text implements ICount {
    private ArrayList<String> intensifiers;

    public Diary(String title, String date) {
        super(title, date);
        this.intensifiers = new ArrayList<>(Arrays.asList("really", "very", "extremely", "overwhelmingly", "incredibly"));

    }

    public ArrayList<String> getIntensifiers() {
        return this.intensifiers;
    }

    //getter


    public int specialWordsCount(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 0;
        for (String word : userInput) {
            for (String lexeme : intensifiers){
                if(word.equals(lexeme)){
                    number += 1;
                    myWords.put(word, number);

                }

            }

        }
            return myWords.size();
    }

    public int uniqueWordsCount(String string){
        ArrayList<String> uniques = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getKey())<=1){
                uniques.add(me.getKey().toString());
            }

        }
        return uniques.size();

    }

    public int repeatedWordsCount(String string){
        ArrayList<String> repeats = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getKey())>1){
                repeats.add(me.getKey().toString());
            }

        }
        return repeats.size();
    }


    //ICount methods


    public ArrayList<String> repeatedWords(String string){
        ArrayList<String> repeats = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getKey())>1){
                repeats.add(me.getKey().toString());
            }

        }
        return repeats;
    }
}
