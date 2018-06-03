package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

public class EssayActivity extends AppCompatActivity {
    TextView insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);

        insert = findViewById(R.id.essayTextViewID);

        insert.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
//        Essay essay = (Essay)intent.getSerializableExtra("essay");
//
//        Log.d("Essay Activity: ", essay.getDate());
    }
}
