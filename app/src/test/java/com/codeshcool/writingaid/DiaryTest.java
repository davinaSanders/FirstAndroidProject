package com.codeshcool.writingaid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class DiaryTest {
    Diary diary;


    @Before
    public void before() {
        diary = new Diary(1, "01/06/2018");
    }

    @Test
    public void hasWordCount() {
        assertEquals(0, diary.getWordCount());
    }

    @Test
    public void hasEntry() {
        assertEquals(1, diary.getEntry());
    }

    @Test
    public void hasDate() {
        assertEquals("01/06/2018", diary.getDate());
    }

    @Test
    public void hasMyWords() {
        diary.addToMap("there this that that this there when");
        assertEquals(4, diary.getMyWordsCount());
    }

    @Test
    public void hasIntensfiers() {
        assertEquals(5, diary.getIntensifiers().size());
    }

    // getters

    @Test
    public void canCountSentences() {
        assertEquals(5, diary.countSentences("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."));

    }

    @Test
    public void canCountWords() {
        assertEquals(11, diary.countWords("this has never been more fun. I will do this again."));
    }

    @Test
    public void canCountCharacters() {
        assertEquals(29, diary.countCharacters("this has never been more fun."));
    }

    @Test
    public void canCountSyllables() {
        assertEquals(13, diary.countSyllables("this has never been more fun. I will do this again."));
    }

        // counters


        @Test
        public void canGetAverageWordLength () {
            assertEquals(3, diary.averageWordLength("this and then why how what green this and then why how how how"));
        }

        @Test
        public void canGetAverageSentenceLength () {
            assertEquals(5, diary.averageSentenceLength("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."));
        }

        //averages

        @Test
        public void canAddToMap () {
            diary.addToMap("this and then why how what green this and then why how how how");
            assertEquals(7, diary.getMyWords().size());
        }


        @Test
        public void hasSpecialWordsCount() {
            assertEquals(3, diary.specialWordsCount("this is really very extremely overwhelming"));
        }

        @Test
        public void hasUniqueWordsCount () {
            assertEquals(2, diary.uniqueWordsCount("this and then why how what green this and then why how how how"));
        }

        @Test
        public void hasRepeatedWordsCount () {
            assertEquals(5, diary.repeatedWordsCount("this and then why how what green this and then why how how how"));
        }

}
