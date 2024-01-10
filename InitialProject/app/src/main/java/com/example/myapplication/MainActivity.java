package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

//public class MainActivity extends AppCompatActivity {
//
//    private TextView resultText;
//    private RadioButton maleButton;
//    private RadioButton femaleButton;
//    private EditText ageEditText;
//    private EditText feetEditText;
//    private EditText inchesEditText;
//    private EditText weightEditText;
//    private Button calculateButton;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
//        setContentView(R.layout.bmi_design);
////        Toast.makeText(this,"This is my first popup in android",Toast.LENGTH_LONG).show();
//        findViews();
//        setupButtonClickListener();
//    }
//
//    private void findViews() {
//        resultText = findViewById(R.id.text_view_result);
////        resultText.setText("Hahahaahahah");
//        maleButton = findViewById(R.id.radio_button_male);
//        femaleButton = findViewById(R.id.radio_button_female);
//        ageEditText = findViewById(R.id.edit_text_age);
//        feetEditText = findViewById(R.id.edit_text_feet);
//        inchesEditText = findViewById(R.id.edit_text_inches);
//        weightEditText = findViewById(R.id.edit_text_weight);
//        calculateButton = findViewById(R.id.button_calculate);
//    }
//
//    private void setupButtonClickListener() {
//        calculateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double bmiResult = calculateBmi();
//
//                String ageText = ageEditText.getText().toString();
//                int age = Integer.parseInt(ageText);
//
//                if (age > 18) {
//                    displayResult(bmiResult);
//                } else {
//                    displayGuidance(bmiResult);
//                }
//
//            }
//        });
//    }
//
//
//    private double calculateBmi() {
//
//        String feetText = feetEditText.getText().toString();
//        String inchesText = inchesEditText.getText().toString();
//        String weightText = weightEditText.getText().toString();
//
//        resultText.setText("Age : " + ageText + ", Feet : " + feetText + ", Inches : " + inchesText + ", Weight : " + weightText);
//
//
//        int feet = Integer.parseInt(feetText);
//        int inches = Integer.parseInt(inchesText);
//        int weight = Integer.parseInt(weightText);
//
//        int totalInches = (feet * 12) + inches;
//        double heightInMeters = totalInches * 0.0254;
//        return weight / (heightInMeters * heightInMeters);
//    }
//
//    private void displayResult(double bmi) {
//        DecimalFormat myDecimalFormatter = new DecimalFormat(0.00);
//        String bmiTextResult = myDecimalFormatter.format(bmi);
//
//        String fullResutString;
//        if (bmi < 18.5) {
//            fullResutString = bmiTextResult + " - You are a under weight.";
//        } else if (bmi > 25) {
//            fullResutString = bmiTextResult + " - You are a over weight.";
//        } else {
//            fullResutString = bmiTextResult + " - You are a healthy weight.";
//        }
//
////        String bmiTextResult = String.valueOf(bmi);
//        resultText.setText(fullResutString);
//    }
//
//    private void displayGuidance(double bmi) {
//        DecimalFormat myDecimalFormatter = new DecimalFormat(0.00);
//        String bmiTextResult = myDecimalFormatter.format(bmi);
//        String fullResutString;
//
//        if (maleButton.isChecked()) {
//            fullResutString = bmiTextResult + " - You are a under 18. please consult your doctor for healthy range for boys";
//        } else if (femaleButton.isChecked()) {
//            fullResutString = bmiTextResult + " - You are a under 18. please consult your doctor for healthy range for girls";
//
//        } else {
//            fullResutString = bmiTextResult + " - You are a under 18. please consult your doctor for healthy range for boys";
//
//        }
//        resultText.setText(fullResutString);
//    }
//
//}


// *************************************************** INCHES TO CONVERTER ******************************************************

public class MainActivity extends AppCompatActivity {

    EditText inchesEditText;
    Button calculateButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inches_to_meter);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                String inchesString = inchesEditText.getText().toString();
                if (inchesString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter inches.", Toast.LENGTH_SHORT).show();
                } else {
                    double meter = Integer.parseInt(inchesString) * 0.0254;
                    DecimalFormat deciFor = new DecimalFormat("0.000");
                    String formattedMeter = deciFor.format(meter);
                    resultTextView.setText("You inches in mtere is " + formattedMeter);
                }
            }
        });
    }

    private void findViews() {
        inchesEditText = findViewById(R.id.edit_text_inches);
        calculateButton = findViewById(R.id.button_calculate);
        resultTextView = findViewById(R.id.text_view_result);
    }
}