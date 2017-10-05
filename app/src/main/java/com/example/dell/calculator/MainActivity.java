package com.example.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.dell.calculator.R.id.add;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText subtotal, itbms, people;
    Button diez, quince, veinte, split;

    float result_num;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);

        subtotal = (EditText) findViewById(R.id.subtotal);
        itbms = (EditText) findViewById(R.id.itbms);

        diez = (Button) findViewById(R.id.diez);
        quince = (Button) findViewById(R.id.quince);
        veinte = (Button) findViewById(R.id.veinte);

        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(subtotal.getText().toString());
                num2 = Integer.parseInt(itbms.getText().toString());
                result_num = (float) ((num1 + num2) * 1.10);
                result.setText(String.valueOf(result_num));
            }
        });

        quince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(subtotal.getText().toString());
                num2 = Integer.parseInt(itbms.getText().toString());
                result_num = (float) ((num1 + num2) * 1.15);
                result.setText(String.valueOf(result_num));
            }

        });

        veinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(subtotal.getText().toString());
                num2 = Integer.parseInt(itbms.getText().toString());
                result_num = (float) ((num1 + num2) * 1.20);
                result.setText(String.valueOf(result_num));
            }

        });

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(subtotal.getText().toString());
                num2 = Integer.parseInt(itbms.getText().toString());
                result_num = (float) ((num1 + num2) * 1.20);
                result.setText(String.valueOf(result_num));
            }

        });


    }
}

