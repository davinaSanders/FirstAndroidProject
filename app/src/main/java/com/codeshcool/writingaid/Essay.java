package com.codeshcool.writingaid;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class Essay extends Text{
    private Integer score;
    private Integer sentenceLength;
    private Integer wordLength;

    public Essay(String title, String date, Integer sentenceLength, Integer wordLength){
        super(title, date);
        this.score = 0;
        this.sentenceLength = 0;
        this.wordLength = 0;
    }

}
