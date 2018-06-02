package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TextActivity extends AppCompatActivity {
    Button creativeButton;
    Button diaryButton;
    Button academicButton;
    TextView dateView;
    String currentDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        creativeButton = findViewById(R.id.creativeButtonID);
        diaryButton = findViewById(R.id.diaryButtonID);
        academicButton = findViewById(R.id.essayButtonID);
        dateView = findViewById(R.id.dateViewID);
        currentDateTime = DateFormat.getDateTimeInstance().format(new Date());

        getCurrentDate(dateView);

    }

    public void getCurrentDate(View view) {
        dateView.setText(this.currentDateTime);
    }

    public void onButtonCreativeClick(View view){
        Creative creative = new Creative(1, this.currentDateTime);
        Intent intent = new Intent(this, CreativeActivity.class);
        intent.putExtra("creative", creative);
        startActivity(intent);
    }

    public void onButtonDiaryClick(View view){
        Diary diary = new Diary(1, this.currentDateTime);
        Intent intent = new Intent(this, DiaryActivity.class);
        intent.putExtra("diary", diary);
        startActivity(intent);

    }

    public void onButtonEssayClick(View view){
        Essay essay = new Essay(1, this.currentDateTime);
        Intent intent = new Intent(this, EssayActivity.class);
        intent.putExtra("essay", essay);
        startActivity(intent);

    }
}
