package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreativeActivity extends AppCompatActivity {
    Creative creative;
    TextView analysis;
    EditText insert;
    EditText lexicalField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative);

        analysis = findViewById(R.id.creativeTextViewID);




        Intent intent = getIntent();
//        Creative creative = (Creative)intent.getSerializableExtra("creative");

//        Log.d("Essay Activity: ", creative.getDate());


    }

    public void onButtonCreativeAnalysisClick(View view){
        String userInput = insert.getText().toString();

        String userField = lexicalField.getText().toString();
        creative.addLexicalField(userInput);

        int specialWords = creative.specialWordsCount(userInput);
        String stringSpecialWords = String.valueOf(specialWords);

        int wordCount = creative.countWords(userInput);
        String stringWordCount = String.valueOf(wordCount);

        int uniqueWords = creative.uniqueWordsCount(userInput);
        String stringUniqueWords = String.valueOf(uniqueWords);

        int wordLength = creative.averageSentenceLength(userInput);
        String stringWordLength = String.valueOf(wordLength);

        int sentenceLength = creative.averageWordLength(userInput);
        String stringSentenceLength = String.valueOf(sentenceLength);

        analysis.setText("Number of words used from Lexical Field: " + stringSpecialWords
                + "\nWord Count: " + stringWordCount
                + "\nNumber of unique words: " + stringUniqueWords
                + "\nAverage Number of characters per word: " + stringWordLength
                + "\nAverage Number of words per sentence : " + stringSentenceLength);

    }



}
