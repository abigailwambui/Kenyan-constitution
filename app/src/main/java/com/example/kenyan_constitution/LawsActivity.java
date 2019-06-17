package com.example.kenyan_constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LawsActivity extends AppCompatActivity {
    private TextView mLawsTextView;
    private ListView mListView;
    private String[] laws = new String[] {"We the people of Kenya-","ACKNOWLEDGING", "HONOURING",
            "PROUD", "RESPECTFUL", "COMMITTED", "RECOGNISING",
            "EXERCISING", "ADOPT, ENACT", "GOD BLESS KENYA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);

        mListView = (ListView) findViewById(R.id.listView1);
        mLawsTextView = (TextView) findViewById(R.id.lawsTextView);
        Typeface walkWayFont = Typeface.createFromAsset(getAssets(), "fonts/Walkway_Oblique_SemiBold.ttf");
        mLawsTextView.setTypeface(walkWayFont);
        mLawsTextView = (TextView) findViewById(R.id.lawsTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, laws);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(LawsActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String laws = intent.getStringExtra("laws");
        mLawsTextView.setText("PREAMBLE");
    }
}
