package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class EssayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);

        Intent intent = getIntent();
        Essay essay = (Essay)intent.getSerializableExtra("essay");

        Log.d("Essay Activity: ", essay.getDate());
    }
}
