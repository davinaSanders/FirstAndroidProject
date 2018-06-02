package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CreativeActivity extends AppCompatActivity {

    TextView insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

//        insert = findViewById();

        Intent intent = getIntent();
        Creative creative = (Creative)intent.getSerializableExtra("creative");

        Log.d("Essay Activity: ", creative.getDate());


    }

}
