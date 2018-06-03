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

public class DiaryActivity extends AppCompatActivity {
    TextView analysis;
    EditText insert;
    Diary diary;
    String currentDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        analysis = findViewById(R.id.diaryTextViewID);
        insert = findViewById(R.id.diaryAnalysis);
        currentDateTime = DateFormat.getDateTimeInstance().format(new Date());
        diary = new Diary(1, this.currentDateTime);


        Intent intent = getIntent();
//        Diary diary = (Diary)intent.getSerializableExtra("diary");
//
//        Log.d("Essay Activity: ", diary.getDate());
    }

    public void onButtonDiaryAnalysisClick(View view){
        String userInput = insert.getText().toString();

        int specialWords = diary.specialWordsCount(userInput);
        String stringSpecialWords = String.valueOf(specialWords);

        int wordCount = diary.countWords(userInput);
        String stringWordCount = String.valueOf(wordCount);

        int uniqueWords = diary.uniqueWordsCount(userInput);
        String stringUniqueWords = String.valueOf(uniqueWords);

        int wordLength = diary.averageSentenceLength(userInput);
        String stringWordLength = String.valueOf(wordLength);

        int sentenceLength = diary.averageWordLength(userInput);
        String stringSentenceLength = String.valueOf(sentenceLength);

        analysis.setText("Number of words used from Lexical Field: " + stringSpecialWords
                + "\nWord Count: " + stringWordCount
                + "\nUnique words: " + stringUniqueWords
                + "\nAverage Characters per word: " + stringWordLength
                + "\nAverage Words per sentence : " + stringSentenceLength);

    }
}
