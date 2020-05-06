package com.josmartinez.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isOperationPressed = false;

    private double firstNumber = 0;

    private int secondNumberIndex = 0;

    private char currentOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlayout);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button percent = findViewById(R.id.percent);
        final Button exponent = findViewById(R.id.exponent);
        final Button squareRoot = findViewById(R.id.square_root);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button divide = findViewById(R.id.divide);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button multiply = findViewById(R.id.multiply);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button subtract = findViewById(R.id.subtract);
        final Button n0 = findViewById(R.id.n0);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.equals);
        final Button add = findViewById(R.id.add);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.percent:

                        break;
                    case R.id.exponent:

                        break;
                    case R.id.square_root:

                        break;

                    case R.id.n7:
                        calculatorScreen.append("7");
                        break;
                    case R.id.n8:
                        calculatorScreen.append("8");
                        break;
                    case R.id.n9:
                        calculatorScreen.append("9");
                        break;
                    case R.id.divide:

                        break;
                    case R.id.n4:
                        calculatorScreen.append("4");
                        break;
                    case R.id.n5:
                        calculatorScreen.append("5");
                        break;
                    case R.id.n6:
                        calculatorScreen.append("6");
                        break;
                    case R.id.multiply:

                        break;
                    case R.id.n1:
                        calculatorScreen.append("1");
                        break;
                    case R.id.n2:
                        calculatorScreen.append("2");
                        break;
                    case R.id.n3:
                        calculatorScreen.append("3");
                        break;
                    case R.id.subtract:

                        break;
                    case R.id.n0:
                        calculatorScreen.append("0");
                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");
                        break;
                    case R.id.equals:
                        if(isOperationPressed){
                           if(currentOperation=='+'){
                               String screenContent = calculatorScreen.getText().toString();
//                               String secondNumberString = screenContent.substring(secondNumberIndex,screenContent.length());
                               double secondNumber = Double.parseDouble(screenContent.substring(secondNumberIndex,screenContent.length()));
                               secondNumber+=firstNumber;
                               calculatorScreen.setText(String.valueOf(secondNumber));
                           }
                        }
                        break;
                    case R.id.add:
                        String screenContent = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent.length() + 1;
                        firstNumber = Double.parseDouble(screenContent);
                        calculatorScreen.append("+");
                        isOperationPressed = true;
                        currentOperation = '+';
                        break;
                }
            }
        };
        percent.setOnClickListener(calculatorListener);
        exponent.setOnClickListener(calculatorListener);
        squareRoot.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        divide.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        multiply.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        subtract.setOnClickListener(calculatorListener);
        n0.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        add.setOnClickListener(calculatorListener);

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
            }
        });

    }
}
