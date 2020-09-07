package com.josmartinez.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private String currentOperator = "";
    private Double screenResult = (double) 0;


//    private boolean isOperationPressed = false;

//    private double firstNumber = 0;
//
//    private int secondNumber = 0;
//
//    private char currentOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        // Calculator Screen
        screen = findViewById(R.id.screen);
        screen.setText(display);


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

    private void clear(){
        display = "";
        currentOperator = "";
    }

    public void onClickClear(View view){
        clear();
        updateScreen();
    }

    private double operate(String a, String b, String op){
        switch (op){
            case "+":
                return Double.parseDouble(a) + Double.parseDouble(b);
            case "-":
                return Double.parseDouble(a) - Double.parseDouble(b);
            case "x":
                return Double.parseDouble(a) * Double.parseDouble(b);
            case "÷":
                return Double.parseDouble(a) / Double.parseDouble(b);
            default: return -1;
        }
    }

    public void onClickEquals(View view){
        String[] operation = display.split(Pattern.quote(currentOperator));
        if (operation.length < 2) return;

        double result = operate(operation[0], operation[1], currentOperator );
        screen.setText(String.valueOf(result));

    }


}
