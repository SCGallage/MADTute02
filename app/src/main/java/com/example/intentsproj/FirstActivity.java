package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button buttonOne;
    String number1;
    String number2;
    EditText editText;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        buttonOne = findViewById(R.id.buttonOne);
    }

    @Override
    protected void onResume() {
        super.onResume();

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                editText = (EditText)findViewById(R.id.editTextNumber3);
                editText2 = (EditText)findViewById(R.id.editTextNumber4);
                number1 = editText.getText().toString();
                number2 = editText2.getText().toString();
                intent.putExtra("NUM_1",number1);
                intent.putExtra("NUM_2",number2);
                startActivity(intent);
            }
        });
    }
}