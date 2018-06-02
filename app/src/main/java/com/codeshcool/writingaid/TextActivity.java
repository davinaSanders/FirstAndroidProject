package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextActivity extends AppCompatActivity {
    Button creativeButton;
    Button diaryButton;
    Button academicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        creativeButton = findViewById(R.id.creativeButtonID);
        diaryButton = findViewById(R.id.diaryButtonID);
        academicButton = findViewById(R.id.essayButtonID);

    }

    public void onButtonCreativeClick(View view){
        Creative creative = new Creative("test", "02/06/2018");
        Intent intent = new Intent(this, InsertActivity.class);
        intent.putExtra("creative", creative);
        startActivity(intent);
    }

    public void onButtonDiaryClick(View view){
        Diary diary = new Diary("test", "02/06/2018");
        Intent intent = new Intent(this, InsertActivity.class);
        intent.putExtra("diary", diary);
        startActivity(intent);

    }

    public void onButtonEssayClick(View view){
        Essay essay = new Essay("test", "02/06/2018");
        Intent intent = new Intent(this, InsertActivity.class);
        intent.putExtra("essay", essay);
        startActivity(intent);

    }
}
