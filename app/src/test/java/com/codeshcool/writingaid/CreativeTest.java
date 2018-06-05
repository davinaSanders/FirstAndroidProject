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
        assertEquals(5.0, creative.countSentences("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."), 0.01);

    }

    @Test
    public void canCountWords() {
        assertEquals(11.0, creative.countWords("this has never been more fun. I will do this again."), 0.01);
    }

    @Test
    public void canCountCharacters() {
        assertEquals(29.0, creative.countCharacters("this has never been more fun."), 0.01);
    }

    @Test
    public void canCountSyllables() {
        assertEquals(13.0, creative.countSyllables("this has never been more fun. I will do this again."), 0.01);
    }

    @Test
    public void canCountSyllables__whenWordsEndinE(){
        assertEquals(5.0, creative.countSyllables("I have a note yes"), 0.01);

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


    @Test
    public void hasUniqueWordsPercentage(){
        assertEquals(25.0, creative.uniqueWordsPercentage("this this this this hello never always paper paper paper paper paper"), 0.01);
    }


    @Test
    public void hasUniqueWordsPercentage__one(){
        assertEquals(6.25, creative.uniqueWordsPercentage("this paper paper this this this hello never always paper paper never hello paper paper paper"), 0.01);
    }

    @Test
    public void hasReadabilityScore(){
        assertEquals(7.0, creative.readabilityScore("The void keyword indicates that no value should be returned by the method after it executes all the logic in the method. If we do want the method to return a value after it finishes running then we can specify the return type. We can use data keywords to achieve this eg int, char etc to specify that a method should return a value of that type. When you use an in, for example, you would also use the return method and return a number. "), 0.01);

    }
}
