package com.example.passingtextviewvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etText;
    TextView textView;
    Button btnGetText, btnPassText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        textView = findViewById(R.id.textView);
        btnGetText = findViewById(R.id.btnGetText);
        btnPassText = findViewById(R.id.btnPassText);

        btnGetText.setOnClickListener(view -> {
            String ourInput = etText.getText().toString();
            textView.setText(ourInput);
        });

        btnPassText.setOnClickListener(view -> {
            String outPut = textView.getText().toString();
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("myText", outPut);
            startActivity(intent);
        });
    }
}