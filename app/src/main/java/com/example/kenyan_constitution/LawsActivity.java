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
    private String[] content = new String[] {"the supremacy of the Almighty God of all creation", "those who heroically struggled to bring freedom and justice to our land",
    "of our ethnic, cultural and religious diversity, and determined to live in peace and unity as one indivisible sovereign nation",
    "of the environment, which is our heritage, and determined to sustain it for the benefit of future generations",
    "to nurturing and protecting the well-being of the individual, the family, communities and the nation",
"the aspirations of all Kenyans for a government based on the essential values of human rights, equality, freedom, democracy, social justice and the rule of law",
    "our sovereign and inalienable right to determine the form of governance of our country and having participated fully in the making of this Constitution",
    "and give this Constitution to ourselves and to our future generations"};

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
