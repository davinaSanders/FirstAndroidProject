package com.codeshcool.writingaid;

import com.codeshcool.writingaid.Behaviours.IRead;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class Essay extends Text implements IRead, Serializable {


    public Essay(int entry, String date){
        super(entry, date);

    }

    public String hello(){
        return "hello";
    }


    public double readabilityScore(String string){
        double WordCount = countWords(string);
        double SentenceCount =  countSentences(string);
        double SyllableCount = countSyllables(string);
        System.out.println(WordCount);
        System.out.println(SentenceCount);
        System.out.println(SyllableCount);
        return (0.39 * (WordCount/SentenceCount)) + (11.8 * (SyllableCount/WordCount)) - 15.59;
    }





}
