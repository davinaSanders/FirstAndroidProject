package com.codeshcool.writingaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreativeActivity extends AppCompatActivity {
    Creative creative;
    TextView analysis;
    EditText insert;
    EditText lexicalField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative);

        analysis = findViewById(R.id.creativeTextViewID);




        Intent intent = getIntent();
//        Creative creative = (Creative)intent.getSerializableExtra("creative");

//        Log.d("Essay Activity: ", creative.getDate());


    }

    public void onButtonCreativeAnalysisClick(View view){
        String userInput = insert.getText().toString();
        double result = essay.readabilityScore(userInput);
        String resultString = Double.toString(result);
        analysis.setText(resultString);

    }

    public void onButtonLexicalFieldClick(View view){
       String userInput = lexicalField.getText().toString();

    }



}
