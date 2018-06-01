package com.codeshcool.writingaid;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class Diary extends Text {
    private ArrayList<String> intensifiers;

    public Diary(String title, String date) {
        super(title, date);
        this.intensifiers = new ArrayList<>(Arrays.asList("really", "very", "extremely", "overwhelmingly", "incredibly"));

    }

    public ArrayList<String> getIntensifiers() {
        return this.intensifiers;
    }

    public ArrayList<>
}
