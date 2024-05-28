package com.kaushlendraprajapati.loginsignupuiintenrshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.kaushlendraprajapati.loginsignupuiintenrshala.other.Constants;

public class Quiz_Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_option);

        CardView cvMath = findViewById(R.id.cvMath);
        CardView cvGeography = findViewById(R.id.cvGeography);
        CardView cvLiterature = findViewById(R.id.cvLiterature);

        findViewById(R.id.imageViewQuizOption).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cvMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz_Option.this, MathQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.math));
                startActivity(intent);
            }
        });

        cvGeography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz_Option.this, GeographyOrLiteratureQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.geography));
                startActivity(intent);
            }
        });

        cvLiterature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz_Option.this, GeographyOrLiteratureQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.literature));
                startActivity(intent);
            }
        });

    }
}