package com.example.kenyan_constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class KenyanConstitutionActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitKenyanConstitution;
    private Button mButtonKenyanConstitution;
    private EditText mNameEditText;
    private EditText mEmailEditText;
    private TextView mTextViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution_kenyan);
        mTextViewMain = (TextView) findViewById(R.id.textViewMain);
        Typeface walkWayFont = Typeface.createFromAsset(getAssets(), "fonts/Walkway_Oblique.ttf");
        mTextViewMain.setTypeface(walkWayFont);
        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mButtonKenyanConstitution = (Button) findViewById(R.id.buttonKenyanConstitution);
        mButtonKenyanConstitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {if(mNameEditText.getText().toString().isEmpty() || mEmailEditText.getText().toString().isEmpty() ) {

                Toast.makeText(KenyanConstitutionActivity.this, "Please fill in all the fields in the form", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(KenyanConstitutionActivity.this, LawsActivity.class);
                startActivity(intent);
                String name = mNameEditText.getText().toString();
                Toast.makeText(KenyanConstitutionActivity.this, "Welcome " + name, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
