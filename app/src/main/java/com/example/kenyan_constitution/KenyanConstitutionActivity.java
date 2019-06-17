package com.example.kenyan_constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KenyanConstitutionActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitKenyanConstitution;
    private Button mButtonKenyanConstitution;
    private EditText mNameEditText;
    private EditText mEmailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution_kenyan);
        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mButtonKenyanConstitution = (Button) findViewById(R.id.buttonKenyanConstitution);
        mButtonKenyanConstitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KenyanConstitutionActivity.this, LawsActivity.class);
                startActivity(intent);
                String name = mNameEditText.getText().toString();
                Toast.makeText(KenyanConstitutionActivity.this, "Welcome "+name, Toast.LENGTH_LONG).show();
            }
        });
    }
}
