package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DiaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);


        Intent intent = getIntent();
        Diary diary = (Diary)intent.getSerializableExtra("diary");

        Log.d("Essay Activity: ", diary.getDate());
    }
}
