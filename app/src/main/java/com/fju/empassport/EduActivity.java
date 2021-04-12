package com.fju.empassport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EduActivity extends AppCompatActivity {

    private Button bDisease;
    private Button bMeal;
    private Button bContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        bDisease = findViewById(R.id.b_disease);
        bMeal = findViewById(R.id.b_meal);
        bContact = findViewById(R.id.b_contact);

        bDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EduActivity.this, DiseaseActivity.class));
            }
        });
        bMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EduActivity.this, MealActivity.class));
            }
        });
        bContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EduActivity.this, ContactActivity.class));
            }
        });
    }
}