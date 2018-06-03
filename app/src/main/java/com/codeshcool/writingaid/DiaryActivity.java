package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

public class DiaryActivity extends AppCompatActivity {
    TextView insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        insert = findViewById(R.id.diaryTextViewID);

        insert.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
//        Diary diary = (Diary)intent.getSerializableExtra("diary");
//
//        Log.d("Essay Activity: ", diary.getDate());
    }
}
