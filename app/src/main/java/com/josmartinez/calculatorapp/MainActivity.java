package com.josmartinez.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private String currentOperator = "";
    private String screenResult = "";

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
        if(!screenResult.equals("")){
            clear();
            updateScreen();
        }
        Button b = (Button) view;
        display += b.getText();
        updateScreen();
    }


    private boolean isOperator(char op){
        switch (op){
            case '+':
            case '-':
            case 'x':
            case '÷':return true;
            default: return false;
        }
    }


    public void onClickOperator(View view){
        if(display.equals("")) return;

        Button b = (Button)view;

        if(!screenResult.equals("")){
            String _display = screenResult;
            clear();
            display = _display;
        }

        if(!currentOperator.equals("")){
            Log.d("CalcX", ""+display.charAt(display.length()-1));
            if(isOperator(display.charAt(display.length()-1))){
                display = display.replace(display.charAt(display.length()-1), b.getText().charAt(0));
                updateScreen();
                return;
            }else{
                getResult();
                display = screenResult;
                screenResult = "";
            }
            currentOperator = b.getText().toString();
        }
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();
    }

    private void clear(){
        display = "";
        currentOperator = "";
        screenResult = "";
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

    private boolean getResult(){
        if(currentOperator.equals("")) return false;
        String[] operation = display.split(Pattern.quote(currentOperator));
        if(operation.length < 2) return false;
        screenResult = String.valueOf(operate(operation[0], operation[1], currentOperator));
        return true;
    }

    public void onClickEquals(View view){
        if(display.equals("")) return;
        if(!getResult()) return;
        screen.setText(String.format("%s\n%s", display, screenResult));
    }


}
