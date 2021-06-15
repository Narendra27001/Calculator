package com.narendra.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView resultView;
    EditText number1,number2;
    char operator;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView=findViewById(R.id.res);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        number2.setShowSoftInputOnFocus(false);
        number1.setShowSoftInputOnFocus(false);
    }

    public void zero(View v){
        if(number1.hasFocus()) number1.append("0");
        else if(number2.hasFocus()) number2.append("0");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void one(View v){
        if(number1.hasFocus()) number1.append("1");
        else if(number2.hasFocus()) number2.append("1");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void two(View v){
        if(number1.hasFocus()) number1.append("2");
        else if(number2.hasFocus()) number2.append("2");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void three(View v){
        if(number1.hasFocus()) number1.append("3");
        else if(number2.hasFocus()) number2.append("3");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void four(View v){
        if(number1.hasFocus()) number1.append("4");
        else if(number2.hasFocus()) number2.append("4");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();

    }
    public void five(View v){
        if(number1.hasFocus()) number1.append("5");
        else if(number2.hasFocus()) number2.append("5");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void six(View v){
        if(number1.hasFocus()) number1.append("6");
        else if(number2.hasFocus()) number2.append("6");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void seven(View v){
        if(number1.hasFocus()) number1.append("7");
        else if(number2.hasFocus()) number2.append("7");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void eight(View v){
        if(number1.hasFocus()) number1.append("8");
        else if(number2.hasFocus()) number2.append("8");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void nine(View v){
        if(number1.hasFocus()) number1.append("9");
        else if(number2.hasFocus()) number2.append("9");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }
    public void dot(View v){
        if(number1.hasFocus()) number1.append(".");
        else if(number2.hasFocus()) number2.append(".");
        else Toast.makeText(this, "Select Number1 or Number2", Toast.LENGTH_LONG).show();
    }

    public void plus(View v){
        operator='+';
    }
    public void sub(View v){
        operator='-';
    }
    public void div(View v){
        operator='/';
    }
    public void mul(View v){
        operator='*';
    }
    public void eq(View v){
        float num1,num2;
        float res;
        String s1=number1.getText().toString(),s2=number2.getText().toString();
        if(!s1.equals("") && !s2.equals("")) {
            num1 = Float.parseFloat(s1);
            num2 = Float.parseFloat(s2);
            switch (operator) {
                case '+':
                    res = num1 + num2;
                    resultView.setText("" + res);
                    break;
                case '-':
                    res = num1 - num2;
                    resultView.setText("" + res);
                    break;
                case '*':
                    res = num1 * num2;
                    resultView.setText("" + res);
                    break;
                case '/':
                    if (num2 == 0) {
                        Toast.makeText(this, "Provide a non-zero denominator", Toast.LENGTH_LONG).show();
                        break;
                    }
                    res = num1 / num2;
                    resultView.setText("" + res);
                    break;

            }
        }else Toast.makeText(this, "Enter both Numbers", Toast.LENGTH_LONG).show();
    }



    public void clear(View v){
        if(number1.hasFocus()) number1.setText("");
        else if(number2.hasFocus()) number2.setText("");
        resultView.setText("");
    }
    public void clearAll(View v){
        number1.setText("");
        number2.setText("");
        resultView.setText("");
    }

    public void ce(View v){

        if(number1.hasFocus()){
            String s=number1.getText().toString();
            s=s.substring(0,s.length()-1);
            number1.setText(s);
        }
        if(number2.hasFocus()){
            String s=number2.getText().toString();
            s=s.substring(0,s.length()-1);
            number2.setText(s);
        }
    }


}