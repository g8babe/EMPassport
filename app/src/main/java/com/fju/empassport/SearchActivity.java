package com.fju.empassport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    private Button bBlood;
    private Button bImage;
    private Button bRadiation;
    private Button bChemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bBlood = findViewById(R.id.b_blood);
        bImage = findViewById(R.id.b_image);
        bRadiation = findViewById(R.id.b_radiation);
        bChemistry = findViewById(R.id.b_chemistry);
    }
}