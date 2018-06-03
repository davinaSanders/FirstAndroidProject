package com.codeshcool.writingaid;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class CreativeTest {

    Creative creative;


    @Before
    public void before() {
        creative = new Creative(1, "01/06/2018");
    }

    @Test
    public void hasWordCount() {
        assertEquals(0, creative.getWordCount());
    }

    @Test
    public void hasEntry() {
        assertEquals(1, creative.getEntry());
    }

    @Test
    public void hasDate() {
        assertEquals("01/06/2018", creative.getDate());
    }

    @Test
    public void hasMyWords() {
        creative.addToMap("there this that that this there when");
        assertEquals(4, creative.getMyWordsCount());
    }

    @Test
    public void canAddToLexicalField(){
        creative.addLexicalField("blue green orange purple");
        assertEquals(4, creative.getlexicalField().size());
    }

    @Test
    public void hasLexicalField() {
        creative.addLexicalField("blue green orange purple");
        assertEquals(4, creative.getlexicalField().size());
    }

    // getters

    @Test
    public void canCountSentences() {
        assertEquals(5, creative.countSentences("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."));

    }

    @Test
    public void canCountWords() {
        assertEquals(11, creative.countWords("this has never been more fun. I will do this again."));
    }

    @Test
    public void canCountCharacters() {
        assertEquals(29, creative.countCharacters("this has never been more fun."));
    }

    @Test
    public void canCountSyllables() {
        assertEquals(13, creative.countSyllables("this has never been more fun. I will do this again."));
    }

    // counters


    @Test
    public void canGetAverageWordLength () {
        assertEquals(3, creative.averageWordLength("this and then why how what green this and then why how how how"));
    }

    @Test
    public void canGetAverageSentenceLength () {
        assertEquals(5, creative.averageSentenceLength("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."));
    }

    //averages

    @Test
    public void canAddToMap () {
        creative.addToMap("this and then why how what green this and then why how how how");
        assertEquals(7, creative.getMyWords().size());
    }


    @Test
    public void hasSpecialWordsCount() {
        creative.addLexicalField("blue green orange purple");
        assertEquals(4, creative.specialWordsCount("this is blue purple and green orange"));
    }

    @Test
    public void hasUniqueWordsCount () {
        assertEquals(2, creative.uniqueWordsCount("this and then why how what green this and then why how how how"));
    }

    @Test
    public void hasRepeatedWordsCount () {
        assertEquals(5, creative.repeatedWordsCount("this and then why how what green this and then why how how how"));
    }
}
