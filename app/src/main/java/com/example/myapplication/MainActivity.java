package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.bmi_design);
//        Toast.makeText(this,"This is my first popup in android",Toast.LENGTH_LONG).show();

        TextView resultText = findViewById(R.id.text_view_result);

        resultText.setText("Hahahaahahah");

        RadioButton maleButton = findViewById(R.id.radio_button_male);

        RadioButton femaleButton = findViewById(R.id.radio_button_female);

        EditText ageEditText = findViewById(R.id.edit_text_age);

        EditText feetEditText = findViewById(R.id.edit_text_feet);

        EditText inchesEditText = findViewById(R.id.edit_text_inches);

        EditText weightEditText = findViewById(R.id.edit_text_weight);

        Button calculateButton = findViewById(R.id.button_calculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You have clicked on button.", Toast.LENGTH_LONG).show();
            }
        });
    }
}