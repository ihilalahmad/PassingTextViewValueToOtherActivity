package com.example.passingtextviewvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    Bundle intentExtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        intentExtras = getIntent().getExtras();

        if (intentExtras != null) {
            String myText = intentExtras.getString("myText");
            textView.setText(myText);
        }
    }
}