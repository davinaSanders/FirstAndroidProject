package com.codeshcool.writingaid.Behaviours;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by davinasanders on 01/06/2018.
 */

public interface ICount {

    HashMap<String, Integer> specialWords (String string);

    ArrayList<String> repeatedWords (String string);

    ArrayList<String>  uniqueWords (String string);


}
