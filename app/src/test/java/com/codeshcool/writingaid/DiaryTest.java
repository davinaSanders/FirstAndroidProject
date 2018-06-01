package com.codeshcool.writingaid;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class DiaryTest {
    Diary diary;


    @Before
    public void before(){
        diary = new Diary("Text1", "01/06/2018");
    }

    @Test
    public void hasDate(){
        assertEquals("01/06/2018", diary.getDate());
    }

    @Test
    public void hasIntensfiers(){
        assertEquals(5, diary.getIntensifiers().size());
    }


    @Test
    public void hasTitle(){
        assertEquals("Text1", diary.getTitle());
    }

    @Test
    public void hasWordCount(){
        assertEquals(0, diary.getWordCount());
    }

    @Test
    public void hasMyWords(){
        diary.addToMap("there this that");
        assertEquals(3, diary.getMyWords());
    }

    @Test
    public void canCountSentences(){
        assertEquals(5, diary.countSentences("this has never been more fun. I will do this again. I love to type. Another sentence now. Even though it is not."));

    }

    @Test
    public void canCountWords(){
        assertEquals(11, diary.countWords("this has never been more fun. I will do this again."));
    }
}
