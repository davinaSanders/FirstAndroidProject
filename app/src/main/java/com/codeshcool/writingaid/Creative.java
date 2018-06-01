package com.codeshcool.writingaid;

/**
 * Created by davinasanders on 01/06/2018.
 */

public class Creative extends Text{
    private Integer score;
    private Integer sentenceLength;
    private Integer wordLength;

    public Creative(String title, String date){
        super(title, date);
        this.score = 0;
        this.sentenceLength = 0;
        this.wordLength = 0;
    }

    
}
