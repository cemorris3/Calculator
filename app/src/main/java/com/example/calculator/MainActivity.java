package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    public void goToActivity2(String s) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }

    public void getInput() {
        e1 = (EditText) findViewById(R.id.integer1);
        e2 = (EditText) findViewById(R.id.integer2);
        //t1 = (TextView) findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);

    }

    public void add(View v) {
        getInput();
        int sum = num1 + num2;
        String str = (Integer.toString(sum));
        goToActivity2(str);

    }

    public void subtract(View v) {
        getInput();
        int sub = num1 - num2;
        String str = (Integer.toString(sub));
        goToActivity2(str);

    }

    public void multiply(View v) {
        getInput();
        int multi = num1 * num2;
        String str = (Integer.toString(multi));
        goToActivity2(str);

    }

    public void divide(View v) {
        getInput();
        int div = num1 / num2;
        String str = (Integer.toString(div));
        goToActivity2(str);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}