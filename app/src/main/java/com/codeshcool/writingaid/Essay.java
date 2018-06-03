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
        return (0.39 * (countWords(string)/countSentences(string))) + (11.8 * (countSyllables(string)/countWords(string))) - 15.59;

    }





}
