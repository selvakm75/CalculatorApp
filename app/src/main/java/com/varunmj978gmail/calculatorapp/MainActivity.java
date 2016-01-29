package com.varunmj978gmail.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd,btnSub,btnDiv,btnMul;
    private TextView tvres;
    private EditText etFirst,etSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();
    }

    private void init() {
        btnAdd=(Button)findViewById(R.id.btnAddition);
        btnSub=(Button)findViewById(R.id.btnSubtract);
        btnDiv=(Button)findViewById(R.id.btnDivide);
        btnMul=(Button)findViewById(R.id.btnMultiply);
        etFirst=(EditText)findViewById(R.id.etFirstNumber);
        etSecond=(EditText)findViewById(R.id.etSecondNumber);
        tvres=(TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        String num1 = etFirst.getText().toString();
        String num2 = etSecond.getText().toString();
        switch (view.getId()) {
            case R.id.btnAddition:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvres.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvres.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvres.setText(String.valueOf(division));

                } catch (Exception e) {
                    tvres.setText("Cannot DIVIDE!!");
                }
                break;
            case R.id.btnMultiply:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvres.setText(String.valueOf(multiplication));
                break;
        }
    }

}
