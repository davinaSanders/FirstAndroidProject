package com.codeshcool.writingaid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by davinasanders on 01/06/2018.
 */

public class Creative extends Text{
    private Integer score;
    private Integer sentenceLength;
    private Integer wordLength;
    private ArrayList<String> lexicalField;

    public Creative(String title, String date){
        super(title, date);
        this.lexicalField = new ArrayList<>();
        this.score = 0;
        this.sentenceLength = 0;
        this.wordLength = 0;
    }


    public ArrayList<String> getlexicalField(){
        return this.lexicalField;

    }


    public int getScore(){
        return this.score;
    }

    public int getSentenceLength(){
        return this.sentenceLength;
    }


    public int getWordLength(){
        return this.wordLength;
    }

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

    public int uniqueWords(String string){
        ArrayList<String> uniques = new ArrayList<>();
        this.addToMap(string);
        for (Map.Entry me : myWords.entrySet()) {
            if(Integer.valueOf((int)me.getKey())<=1){
                uniques.add(me.getKey().toString());
            }

        }
        return uniques.size();

    }

    public void addLexicalField(String string){
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        for (String word : userInput) {
            this.lexicalField.add(word);
        }
    }



    public void specialWordsCount(String string) {
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

    }



}
