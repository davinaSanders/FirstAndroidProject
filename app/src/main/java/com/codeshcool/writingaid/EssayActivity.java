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

public class EssayActivity extends AppCompatActivity {
    TextView analysis;
    Essay essay;
    EditText insert;
    String currentDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);

        insert = findViewById(R.id.essayAnalysis);
        analysis = findViewById(R.id.essayTextViewID);
        currentDateTime = DateFormat.getDateTimeInstance().format(new Date());


        insert.setMovementMethod(new ScrollingMovementMethod());

        essay = new Essay (1, this.currentDateTime);

        Intent intent = getIntent();
//        Essay essay = (Essay)intent.getSerializableExtra("essay");
//
//        Log.d("Essay Activity: ", essay.getDate());
    }


    public void onButtonEssayAnalysisClick(View view){
        String userInput = insert.getText().toString();
        double result = essay.readabilityScore(userInput);
        String resultString = Double.toString(result);
        analysis.setText(resultString);

    }


}
