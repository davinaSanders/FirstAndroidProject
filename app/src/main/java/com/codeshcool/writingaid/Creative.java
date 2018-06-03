package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.ICount;
import com.codeshcool.writingaid.Behaviours.IRead;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
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

    public int uniqueWordsNumber(String string){
        ArrayList<String> uniques = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getKey())==1){
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
            if(Integer.valueOf((int)me.getKey())>1){
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
            if(Integer.valueOf((int)me.getKey())>1){
                repeats.add(me.getKey().toString());
            }

        }
        return repeats.size();
    }



    public int uniqueWordsCount(String string){
        return (this.uniqueWordsCount(string)/this.wordCount) * 100;

    }

    //returns a percentage of the unique words in relation to total words.
    //justification for this is that the user was more interested in
    // keeping variation in the words when it was a creative piece
    // where as for the diary they were curious to know when they deviated
    // from those words most common to their written idiolect.


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


    // ICount methods


    public double readabilityScore(String string){
        return (0.39 * (countWords(string)/countSentences(string))) + (11.8 * (countSyllables(string)/countWords(string))) - 15.59;

    }

    // IRead method

}
