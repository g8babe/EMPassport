package com.fju.empassport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static java.lang.Math.random;

public class HomeActivity extends AppCompatActivity {

    private TextView tvQuotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvQuotation = findViewById(R.id.textView);
        
    }
}