package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button addition,subtraction,multiplication,division,button1,button2,button3,button4
            ,button5,button6,button7,button8,button9,button0,buttonEquals,buttonDot,buttonCancel;
    EditText resultBar;
    float LValue,RValue;
    boolean enableAddition,enableSubtraction,enableMultiplication,enableDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultBar=findViewById(R.id.Result);
        addition=findViewById(R.id.addition);
        subtraction=findViewById(R.id.substraction);
        multiplication=findViewById(R.id.multiplication);
        division=findViewById(R.id.division);
        button0=findViewById(R.id.zero);
        button1=findViewById(R.id.one);
        button2=findViewById(R.id.two);
        button3=findViewById(R.id.three);
        button4=findViewById(R.id.four);
        button5=findViewById(R.id.five);
        button6=findViewById(R.id.six);
        button7=findViewById(R.id.seven);
        button8=findViewById(R.id.eight);
        button9=findViewById(R.id.nine);
        buttonEquals=findViewById(R.id.equals);
        buttonDot=findViewById(R.id.dot);
        buttonCancel=findViewById(R.id.cancel);
        ///////////////////////////////////////////////
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=null;
                if((resultBar.getText()!=null) && resultBar.getText().length()>0)
                    str = (resultBar.getText().toString()).substring(0, resultBar.getText().length() - 1);
                resultBar.setText(str);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + ".");
                buttonDot.setEnabled(false);
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                resultBar.setText(resultBar.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resultBar.setText(resultBar.getText() + "9");
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LValue=Float.parseFloat(resultBar.getText()+"");
                enableAddition=true;
                resultBar.setText(null);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LValue=Float.parseFloat(resultBar.getText()+"");
                enableSubtraction=true;
                resultBar.setText(null);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LValue=Float.parseFloat(resultBar.getText()+"");
                enableMultiplication=true;
                resultBar.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LValue=Float.parseFloat(resultBar.getText()+"");
                enableDivision=true;
                resultBar.setText(null);
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RValue=Float.parseFloat(resultBar.getText()+"");
                if(enableAddition){
                    enableAddition=false;
                    resultBar.setText(LValue+RValue+"");
                }
                if(enableSubtraction){
                    enableSubtraction=false;
                    resultBar.setText(LValue-RValue+"");
                }
                if(enableMultiplication){
                    enableMultiplication=false;
                    resultBar.setText(LValue*RValue+"");
                }
                if(enableDivision){
                    enableDivision=false;
                    resultBar.setText(LValue/RValue+"");
                }
            }
        });

    }
}