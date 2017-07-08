package com.androidprojects.calcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;
import static android.R.id.button1;
import static android.R.id.button2;
import static android.R.id.button3;
import static com.androidprojects.calcy.R.id.buttonDecimal;

public class MainActivity extends AppCompatActivity {

    EditText textArea;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonAdd, buttonSub, buttonDiv, buttonMul, buttonDec, buttonClear, buttonEqual;

    float numberOne, numberTwo, result;
    boolean add, subtract, multiply, divide, operationCompleted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operationCompleted = false;

        textArea = (EditText)findViewById(R.id.text_area);
        textArea.setInputType(InputType.TYPE_NULL);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDec = (Button) findViewById(buttonDecimal);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        button0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true)
                            textArea.setText("");
                        textArea.setText(textArea.getText() + "0");
                        operationCompleted = false;
                    }
                }
        );
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "1");

                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "2");

                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "3");
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "4");
                    }
                }
        );
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "5");
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "6");
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "7");

                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "8");
                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + "9");
                    }
                }
        );
        buttonDec.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(operationCompleted == true) {
                            operationCompleted = false;
                            textArea.setText("");
                        }
                        textArea.setText(textArea.getText() + ".");
                    }
                }
        );
        buttonClear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textArea.setText("");
                    }
                }
        );

        buttonAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (textArea == null){}
                        else{
                            numberOne = Float.parseFloat(textArea.getText().toString());
                            add = true;
                            textArea.setText("");
                        }

                    }
                }

        );
        buttonSub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (textArea == null){}
                        else{
                            numberOne = Float.parseFloat(textArea.getText().toString());
                            subtract = true;
                            textArea.setText("");
                        }
                    }
                }
        );
        buttonMul.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if(textArea == null){}
                        else{
                            numberOne = Float.parseFloat(textArea.getText().toString());
                            multiply = true;
                            textArea.setText("");
                        }
                    }
                }
        );
        buttonDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(textArea == null){}
                        else {
                            numberOne = Float.parseFloat(textArea.getText().toString());
                            divide = true;
                            textArea.setText("");
                        }
                    }
                }
        );
        buttonEqual.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberTwo = Float.parseFloat(textArea.getText().toString());

                        if(subtract == true){
                            result = numberOne - numberTwo;
                            subtract = false;
                        }
                        if(add == true){
                            result = numberOne + numberTwo;
                            add = false;
                        }
                        if(multiply == true) {
                            result = numberOne * numberTwo;
                            multiply = false;
                        }
                        if(divide == true){
                            result = numberOne / numberTwo;
                            divide = false;
                        }
                        textArea.setText(result + "");

                        operationCompleted = true;
                    }
                }

        );
        
    }

}
