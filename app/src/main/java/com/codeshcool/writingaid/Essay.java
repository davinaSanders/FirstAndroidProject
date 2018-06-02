package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.IRead;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class Essay extends Text implements IRead {
    private Integer score;
    private Integer sentenceLength;
    private Integer wordLength;

    public Essay(String title, String date, Integer sentenceLength, Integer wordLength){
        super(title, date);
        this.score = 0;
        this.sentenceLength = 0;
        this.wordLength = 0;
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
