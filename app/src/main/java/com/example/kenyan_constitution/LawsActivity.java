package com.example.kenyan_constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LawsActivity extends AppCompatActivity {
    private TextView mLawsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        mLawsTextView = (TextView) findViewById(R.id.lawsTextView);
        Intent intent = getIntent();
        String laws = intent.getStringExtra("laws");
        mLawsTextView.setText("Kenyan laws click to get elaborate details: " + laws);
    }
}
