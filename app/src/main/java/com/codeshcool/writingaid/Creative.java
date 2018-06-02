package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.ICount;
import com.codeshcool.writingaid.Behaviours.IRead;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by davinasanders on 01/06/2018.
 */

public class Creative extends Text implements IRead, ICount {
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

    public int uniqueWords(String string){
        return (this.uniqueWordsCount(string)/this.wordCount) * 100;

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

    public double countSyllables(String string){
        String[] vowels = new String[]{"a", "e", "i", "o", "u", "y"};
        double syllableCounter = 0;
        ArrayList<String> userInput = new ArrayList<>(Arrays.asList(string.split(" ")));
        for (String word : userInput) {
            String[] letters = word.split("");
            for (int i=0; i<letters.length; i++){
                for (String letter : letters){
                    for (String vowel : vowels){
                        if ((letter.equals(vowel) && (i>letters.length-1)){
                            if (!letters[i+1].equals(vowel)){
                                syllableCounter ++;

                            }
                        }
                    }

                }

            }

        }
        return syllableCounter;
    }

    public double readabilityScore(String string){
        return (0.39 * (countWords(string)/countSentences(string))) + (11.8 * (countSyllables(string)/countWords(string))) - 15.59;

    }

}
