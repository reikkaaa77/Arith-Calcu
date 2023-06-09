package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        add = (Button) findViewById(R.id.btnAdd);
        result = (TextView) findViewById(R.id.txtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get value from Activity
                int mynumber1 = Integer.parseInt(num1.getText().toString());
                int mynumber2 = Integer.parseInt(num2.getText().toString());

                //add operation
                int sum = mynumber1 + mynumber2;

                result.setText("answer is: "+sum);

            }
        });
    }
}