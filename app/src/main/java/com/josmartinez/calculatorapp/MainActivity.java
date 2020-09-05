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
        setContentView(R.layout.layout_main);

        // Calculator Screen
        screen = findViewById(R.id.screen);
        screen.setText(display);

        // Signs
        final Button allClear = findViewById(R.id.all_clear);
        final Button clear = findViewById(R.id.clear);
        final Button dot = findViewById(R.id.dot);
        final Button plusMinus = findViewById(R.id.plus_minus);
        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button division = findViewById(R.id.division);
        final Button percent = findViewById(R.id.percent);
        final Button result = findViewById(R.id.equals);

        // Numbers
        final Button zero = findViewById(R.id.number_0);
        final Button one = findViewById(R.id.number_1);
        final Button two = findViewById(R.id.number_2);
        final Button three = findViewById(R.id.number_3);
        final Button four = findViewById(R.id.number_4);
        final Button five = findViewById(R.id.number_5);
        final Button six = findViewById(R.id.number_6);
        final Button seven = findViewById(R.id.number_7);
        final Button eight = findViewById(R.id.number_8);
        final Button nine = findViewById(R.id.number_9);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.number_0:
                        screen.append("0");
                        break;
                    case R.id.number_1:
                        screen.append("1");
                        break;
                    case R.id.number_2:
                        screen.append("2");
                        break;
                    case R.id.number_3:
                        screen.append("3");
                        break;
                    case R.id.number_4:
                        screen.append("4");
                        break;
                    case R.id.number_5:
                        screen.append("5");
                        break;
                    case R.id.number_6:
                        screen.append("6");
                        break;
                    case R.id.number_7:
                        screen.append("7");
                        break;
                    case R.id.number_8:
                        screen.append("8");
                        break;
                    case R.id.number_9:
                        screen.append("9");
                        break;

                    case R.id.all_clear:
                    case R.id.equals:
                        display = "";
                        break;
                    case R.id.clear:
                        display = "";
                        currentOperator = "";
                        break;
                    case R.id.dot:
                        screen.append(".");
                        break;
                    case R.id.plus_minus:
                        // change to minus
                        break;
                    case R.id.plus:
                        screen.append("+");
                        break;
                    case R.id.minus:
                        screen.append("-");
                        break;
                    case R.id.percent:
                        screen.append("%");
                        break;
                    case R.id.multiplication:
                        screen.append("x");
                        break;
                    case R.id.division:
                        screen.append("/");
                        break;
                }
            }
        };
        //  Signs
        allClear.setOnClickListener(calculatorListener);
        clear.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        plusMinus.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        percent.setOnClickListener(calculatorListener);
        result.setOnClickListener(calculatorListener);
        //  Numbers
        zero.setOnClickListener(calculatorListener);
        one.setOnClickListener(calculatorListener);
        two.setOnClickListener(calculatorListener);
        three.setOnClickListener(calculatorListener);
        four.setOnClickListener(calculatorListener);
        five.setOnClickListener(calculatorListener);
        six.setOnClickListener(calculatorListener);
        seven.setOnClickListener(calculatorListener);
        eight.setOnClickListener(calculatorListener);
        nine.setOnClickListener(calculatorListener);
    }


//    private void updateScreen() {
//        screen.setText(display);
//    }

//    public void onClickNumber(View view) {
//        Button b = (Button) view;
//        display += b.getText();
//        updateScreen();
//    }

//    public void onClickOperator(View view){
//        Button b = (Button) view;
//        display += b.getText();
//        currentOperator += b.getText().toString();
//        updateScreen();
//    }

//    public void clear(){
//        display = "";
//        currentOperator = "";
//    }

//    public void onClickClear(View view){
//        clear();
//        updateScreen();
//    }

//    public void onClickResult(View view){
//
//    }
}
