package com.fju.empassport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DiseaseActivity extends AppCompatActivity {

    private Button bWhere;
    private Button bWhat;
    private Button bWhy;
    private Button bSymptom;
    private Button bDiagnose;
    private Button bRecovery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        bWhere = findViewById(R.id.b_where);
        bWhat = findViewById(R.id.b_what);
        bWhy = findViewById(R.id.b_why);
        bSymptom = findViewById(R.id.b_symptom);
        bDiagnose = findViewById(R.id.b_diagnose);
        bRecovery = findViewById(R.id.b_recovery);
    }
}