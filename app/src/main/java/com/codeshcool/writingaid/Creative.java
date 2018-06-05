package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.ICount;
import com.codeshcool.writingaid.Behaviours.IRead;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davinasanders on 01/06/2018.
 */

public class Creative extends Text implements IRead, ICount, Serializable {
    private ArrayList<String> lexicalField;

    public Creative(int entry, String date){
        super(entry, date);
        this.lexicalField = new ArrayList<>();

    }


    public ArrayList<String> getlexicalField(){
        return this.lexicalField;

    }

    //getter

    public void addLexicalField(String string){
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        for (String word : userInput) {
            this.lexicalField.add(word);
        }
    }

    // allow user to create the lexical field

    public int uniqueWordsCount(String string){
        ArrayList<String> uniques = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getValue())==1){
                uniques.add(me.getKey().toString());
            }

        }
        return uniques.size();

    }


    // number of unrepeated words

    public ArrayList<String> repeatedWords(String string){
        ArrayList<String> repeats = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getValue())>1){
                repeats.add(me.getKey().toString());
            }

        }
        return repeats;
    }

    // list of repeated words

    public int repeatedWordsCount(String string){
        ArrayList<String> repeats = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getValue())>1){
                repeats.add(me.getKey().toString());
            }

        }
        return repeats.size();
    }

    public ArrayList<String> uniqueWords(String string){
        ArrayList<String> uniques = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getValue())==1){
                uniques.add(me.getKey().toString());
            }

        }
        return uniques;

    }


    public double uniqueWordsPercentage(String string){
        double unrepeated = this.uniqueWordsCount(string);
        double wordCount = this.countWords(string);
        System.out.println(unrepeated);
        System.out.println(wordCount);
        return (unrepeated/wordCount) * 100;


    }


    public int specialWordsCount(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 0;
        for (String word : userInput) {
            for (String lexeme : lexicalField){
                if(word.equals(lexeme)){
                    number += 1;
                    myWords.put(word, number);

                }

            }

        }
        return myWords.size();
    }

    public HashMap<String, Integer> specialWords(String string) {
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        int number = 0;
        for (String word : userInput) {
            for (String lexeme : lexicalField){
                if(word.equals(lexeme)){
                    number += 1;
                    myWords.put(word, number);

                }

            }

        }
        return myWords;
    }


    // ICount methods


    public double readabilityScore(String string){
        return (0.39 * (countWords(string)/countSentences(string))) + (11.8 * (countSyllables(string)/countWords(string))) - 15.59;

    }

    // IRead method

}
