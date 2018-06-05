package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class CreativeActivity extends AppCompatActivity {
    Creative creative;
    TextView analysis;
    EditText insert;
    EditText lexicalField;
    String currentDateTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative);
        currentDateTime = DateFormat.getDateTimeInstance().format(new Date());
        creative = new Creative(1, this.currentDateTime);
        insert = findViewById(R.id.creativeAnalysis);
        lexicalField = findViewById(R.id.lexicalField);
        analysis = findViewById(R.id.creativeTextViewID);




        Intent intent = getIntent();
//        Creative creative = (Creative)intent.getSerializableExtra("creative");

//        Log.d("Essay Activity: ", creative.getDate());


    }

    public void onButtonCreativeAnalysisClick(View view){
        String userInput = insert.getText().toString();

        String userField = lexicalField.getText().toString();
        creative.addLexicalField(userField);

        double specialWords = creative.specialWordsCount(userInput);
        String stringSpecialWords = String.valueOf(specialWords);

        double wordCount = creative.countWords(userInput);
        String stringWordCount = String.valueOf(wordCount);

        double uniqueWords = creative.uniqueWordsCount(userInput);
        String stringUniqueWords = String.valueOf(uniqueWords);

        double uniqueWordsPercentage = creative.uniqueWordsPercentage(userInput);
        String stringUniquePercentage = String.valueOf(uniqueWordsPercentage);

        double wordLength = creative.averageSentenceLength(userInput);
        String stringWordLength = String.valueOf(wordLength);

        double sentenceLength = creative.averageWordLength(userInput);
        String stringSentenceLength = String.valueOf(sentenceLength);

        analysis.setText("Lexical Field Matches: " + stringSpecialWords
                + "\nWord Count: " + stringWordCount
//                + "\nUnique words: " + stringUniqueWords
//                + "\nPrcentage of Unique words: " + stringUniquePercentage
                + "\nAverage Characters per word: " + stringWordLength
                + "\nAverage Words per sentence : " + stringSentenceLength);

    }



}
