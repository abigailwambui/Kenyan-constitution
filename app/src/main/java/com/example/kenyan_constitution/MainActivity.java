package com.example.kenyan_constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Button mButtonMain;
        private TextView mTextViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewMain = (TextView) findViewById(R.id.textViewMain);
        Typeface walkWayFont = Typeface.createFromAsset(getAssets(), "fonts/Walkway_Bold.ttf");
        mTextViewMain.setTypeface(walkWayFont);
        mButtonMain = (Button) findViewById(R.id.buttonMain);
        mButtonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KenyanConstitutionActivity.class);
                startActivity(intent);
            }
        });

    }
}
