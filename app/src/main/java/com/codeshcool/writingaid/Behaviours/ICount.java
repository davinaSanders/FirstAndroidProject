package com.codeshcool.writingaid.Behaviours;

import java.util.ArrayList;

/**
 * Created by davinasanders on 01/06/2018.
 */

public interface ICount {

    void specialWordsCount(String string);

    ArrayList<String> repeatedWords(String string);

    int uniqueWords(String string);

    // this will be a percentage of unique words
    // for the Creative and the list of unique words for the diary.
    //justification for this is that the user was more interested in
    // keeping variation in the words when it was a creative piece
    // where as for the diary they were curious to know when they deviated
    // from those words most common to their written idiolect.

}
