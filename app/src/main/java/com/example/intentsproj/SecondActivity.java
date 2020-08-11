package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String number1;
    String number2;
    EditText editText;
    EditText editText2;
    TextView answer;
    Button plusbtn;
    Button minusbtn;
    Button multibtn;
    Button divbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        editText = (EditText)findViewById(R.id.editTextNumber);
        editText2 = (EditText)findViewById(R.id.editTextNumber2);
        plusbtn = findViewById(R.id.button);
        minusbtn = findViewById(R.id.button2);
        multibtn = findViewById(R.id.button3);
        divbtn = findViewById(R.id.button4);
        answer = findViewById(R.id.textView5);

        editText.setText(intent.getStringExtra("NUM_1"));
        editText2.setText(intent.getStringExtra("NUM_2"));

    }

    @Override
    protected void onResume() {
        super.onResume();

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = editText.getText().toString();
                number2 = editText2.getText().toString();
                int val = Integer.parseInt(number1)+Integer.parseInt(number2);
                answer.setText(number1+"+"+number2+"="+val);
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = editText.getText().toString();
                number2 = editText2.getText().toString();
                int val = Integer.parseInt(number1)-Integer.parseInt(number2);
                answer.setText(number1+"-"+number2+"="+val);
            }
        });

        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = editText.getText().toString();
                number2 = editText2.getText().toString();
                int val = Integer.parseInt(number1)*Integer.parseInt(number2);
                answer.setText(number1+"*"+number2+"="+val);
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = editText.getText().toString();
                number2 = editText2.getText().toString();
                int val = Integer.parseInt(number1)/Integer.parseInt(number2);
                answer.setText(number1+"/"+number2+"="+val);
            }
        });
    }
}