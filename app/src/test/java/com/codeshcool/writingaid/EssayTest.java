package com.codeshcool.writingaid;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davinasanders on 31/05/2018.
 */

public class EssayTest {

    Essay essay;

    @Before
    public void before(){
        essay = new Essay(1, "02/06/2018" );
    }

    @Test
    public void hasReadabilityScore(){
        assertEquals(7.0, essay.readabilityScore("The void keyword indicates that no value should be returned by the method after it executes all the logic in the method. If we do want the method to return a value after it finishes running then we can specify the return type. We can use data keywords to achieve this eg int, char etc to specify that a method should return a value of that type. When you use an in, for example, you would also use the return method and return a number. "), 0.01);

    }
}
