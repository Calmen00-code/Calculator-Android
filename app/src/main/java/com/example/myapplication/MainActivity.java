package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputOne;
    EditText inputTwo;
    Button additionButton;
    Button subtractionButton;
    Button multiplyButton;
    Button divisionButton;
    TextView result;
    private static double numOne;
    private static double numTwo;
    private static double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization of fields from UI
        inputOne = findViewById(R.id.inputOne);
        inputTwo = findViewById(R.id.inputTwo);
        additionButton = findViewById(R.id.addButton);
        subtractionButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divisionButton = findViewById(R.id.divideButton);
        result = findViewById(R.id.result);

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(inputOne, inputTwo);
                answer = numOne + numTwo;
                result.setText(String.valueOf(answer));
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(inputOne, inputTwo);
                answer = numOne - numTwo;
                result.setText(String.valueOf(answer));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(inputOne, inputTwo);
                answer = numOne * numTwo;
                result.setText(String.valueOf(answer));
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(inputOne, inputTwo);
                answer = numOne / numTwo;
                result.setText(String.valueOf(answer));
            }
        });
    }

    /**
     *
     * @param inputOne is retrieved from the text field and convert to double type
     * @param inputTwo is retrieved from the text field and convert to double type
     */
    public static void setNumber(EditText inputOne, EditText inputTwo) {
        // Making both the input fields editable so that
        // Mathematical operation can be performed
        Editable editableInputOne = inputOne.getText();
        Editable editableInputTwo = inputTwo.getText();
        String strOne = editableInputOne.toString();
        String strTwo = editableInputTwo.toString();

        // Getting the numerical value
        numOne = Double.parseDouble(strOne);
        numTwo = Double.parseDouble(strTwo);
    }
}