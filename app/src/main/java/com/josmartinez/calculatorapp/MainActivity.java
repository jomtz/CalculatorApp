package com.josmartinez.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;

    private String display = "";

    private String currentOperator = "";
//    private boolean isOperationPressed = false;
//
//    private double firstNumber = 0;
//
//    private int secondNumberIndex = 0;
//
//    private char currentOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlayout);
        // Calculator Screen
        screen = findViewById(R.id.calculatorScreen);
        screen.setText(display);

//        // First row of buttons
//        final Button clear = findViewById(R.id.clear);
//        final Button plusMinus = findViewById(R.id.plus_minus);
//        final Button percent = findViewById(R.id.percent);
//        final Button division = findViewById(R.id.division);
//
//        // Second row of buttons
//        final Button seven = findViewById(R.id.number_7);
//        final Button eight = findViewById(R.id.number_8);
//        final Button nine = findViewById(R.id.number_9);
//        final Button multiplication = findViewById(R.id.multiplication);
//
//        // Third row of buttons
//        final Button four = findViewById(R.id.number_4);
//        final Button five = findViewById(R.id.number_5);
//        final Button six = findViewById(R.id.number_6);
//        final Button minus = findViewById(R.id.minus);
//
//        // Fourth row of buttons
//        final Button one = findViewById(R.id.number_1);
//        final Button two = findViewById(R.id.number_2);
//        final Button three = findViewById(R.id.number_3);
//        final Button plus = findViewById(R.id.plus);
//
//        // Fifth row of buttons
//        final Button zero = findViewById(R.id.number_0);
//        final Button dot = findViewById(R.id.dot);
//        final Button result = findViewById(R.id.result);
//
//        final View.OnClickListener calculatorListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final int id = v.getId();
//                switch (id){
//
//                        // row 1
//                    case R.id.clear:
//                        display = "";
//                        currentOperator = "";
//                        break;
//                    case R.id.plus_minus:
//                        // change to minus
//                        break;
//                    case R.id.percent:
//                        screen.append("%");
//                        break;
//                    case R.id.division:
//                        screen.append("/");
//                        break;
//
//                        // row 2
//                    case R.id.number_7:
//                        screen.append("7");
//                        break;
//                    case R.id.number_8:
//                        screen.append("8");
//                        break;
//                    case R.id.number_9:
//                        screen.append("9");
//                        break;
//                    case R.id.multiplication:
//                        screen.append("x");
//
//                        // row 3
//                    case R.id.number_4:
//                        screen.append("4");
//                        break;
//                    case R.id.number_5:
//                        screen.append("5");
//                        break;
//                    case R.id.number_6:
//                        screen.append("6");
//                        break;
//                    case R.id.minus:
//                        screen.append("-");
//
//                        // row 4
//                    case R.id.number_1:
//                        screen.append("1");
//                        break;
//                    case R.id.number_2:
//                        screen.append("2");
//                        break;
//                    case R.id.number_3:
//                        screen.append("3");
//                        break;
//                    case R.id.plus:
//                        screen.append("+");
//
//
//                        // row 3
//                    case R.id.number_0:
//                        screen.append("0");
//                        break;
//                    case R.id.dot:
//                        screen.append(".");
//                        break;
//                    case R.id.result:
//                        screen.append("6");
//                        break;
//
////                    case R.id.equals:
////                        if(isOperationPressed){
////                           if(currentOperation=='+'){
////                               String screenContent = calculatorScreen.getText().toString();
//////                               String secondNumberString = screenContent.substring(secondNumberIndex,screenContent.length());
////                               double secondNumber = Double.parseDouble(screenContent.substring(secondNumberIndex,screenContent.length()));
////                               secondNumber+=firstNumber;
////                               calculatorScreen.setText(String.valueOf(secondNumber));
////                           }
////                        }
////                        break;
////                    case R.id.add:
////                        String screenContent = calculatorScreen.getText().toString();
////                        secondNumberIndex = screenContent.length() + 1;
////                        firstNumber = Double.parseDouble(screenContent);
////                        calculatorScreen.append("+");
////                        isOperationPressed = true;
////                        currentOperation = '+';
////                        break;
//                }
//            }
//        };
//        // 1
//        clear.setOnClickListener(calculatorListener);
//        plusMinus.setOnClickListener(calculatorListener);
//        percent.setOnClickListener(calculatorListener);
//        division.setOnClickListener(calculatorListener);
//
//        // 2
//        seven.setOnClickListener(calculatorListener);
//        eight.setOnClickListener(calculatorListener);
//        nine.setOnClickListener(calculatorListener);
//        multiplication.setOnClickListener(calculatorListener);
//
//        // 3
//        four.setOnClickListener(calculatorListener);
//        five.setOnClickListener(calculatorListener);
//        six.setOnClickListener(calculatorListener);
//        minus.setOnClickListener(calculatorListener);
//
//        // 4
//        one.setOnClickListener(calculatorListener);
//        two.setOnClickListener(calculatorListener);
//        three.setOnClickListener(calculatorListener);
//        plus.setOnClickListener(calculatorListener);
//
//        // 5
//        zero.setOnClickListener(calculatorListener);
//        dot.setOnClickListener(calculatorListener);
//        result.setOnClickListener(calculatorListener);
    }

    private void updateScreen() {
        screen.setText(display);
    }

    public void onClickNumber(View view) {
        Button b = (Button) view;
        display += b.getText();
        updateScreen();
    }

    public void onClickOperator(View view){
        Button b = (Button) view;
        display += b.getText();
        currentOperator += b.getText().toString();
        updateScreen();
    }

    public void clear(){
        display = "";
        currentOperator = "";
    }

    public void onClickClear(View view){
        clear();
        updateScreen();
    }

    public void onClickResult(View view){

    }
}
