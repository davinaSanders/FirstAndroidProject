package com.codeshcool.writingaid;

import java.util.ArrayList;
import java.util.Arrays;

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




}
