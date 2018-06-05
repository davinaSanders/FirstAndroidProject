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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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

        HashMap<String, Integer> specialWords = diary.specialWords(userInput);
        String stringSpecialWords = specialWords.keySet().toString();
//         stringSpecialWords = String.valueOf(specialWords.keySet());

        double wordCount = diary.countWords(userInput);
        String stringWordCount = String.valueOf(wordCount);

        ArrayList<String> uniqueWords = diary.uniqueWords(userInput);
        String stringUniqueWords = String.valueOf(uniqueWords);

        double sentenceLength = diary.averageSentenceLength(userInput);
        String stringSentenceLength = String.valueOf(sentenceLength);

        double wordLength = diary.averageWordLength(userInput);
        String stringWordLength = String.valueOf(wordLength);

        analysis.setText("Intensifiers: " + stringSpecialWords
                + "\nUnique words: " + stringUniqueWords
//                + "\n Most popular: " + stringPopularWord
                + "\nWord Count: " + stringWordCount
                + "\nAverage Characters pw: " + stringWordLength
                + "\nAverage Words ps : " + stringSentenceLength);

    }
}
