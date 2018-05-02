package com.example.pooja.calc_trig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static double memvalue, inputvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button btnadd = (Button) findViewById(R.id.btnadd);
        Button btnsub = (Button) findViewById(R.id.btnsub);
        Button btndiv = (Button) findViewById(R.id.btndiv);
        Button btnmul = (Button) findViewById(R.id.btnmul);
        Button btnsin = (Button) findViewById(R.id.btnsin);
        Button btncos = (Button) findViewById(R.id.btncos);
        Button btntan = (Button) findViewById(R.id.btntan);
        Button btnsqrt = (Button) findViewById(R.id.btnsqrt);
        Button btnclr = (Button) findViewById(R.id.btnclr);
        Button btnmem = (Button) findViewById(R.id.btnmem);
        Button btnms = (Button) findViewById(R.id.btnms);


        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnsqrt.setOnClickListener(this);
        btnclr.setOnClickListener(this);
        btnmem.setOnClickListener(this);
        btnms.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        EditText result = (EditText) findViewById(R.id.result);
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();

        switch (v.getId()) {
            case R.id.btnadd:
                double res = Double.parseDouble(num1) + Double.parseDouble(num2);
                result.setText(String.valueOf(res));
                break;
            case R.id.btnsub:
                double sub = Double.parseDouble(num1) - Double.parseDouble(num2);
                result.setText(String.valueOf(sub));
                break;
            case R.id.btndiv:
                double div = Double.parseDouble(num1) / Double.parseDouble(num2);
                result.setText(String.valueOf(div));
                break;
            case R.id.btnmul:
                double mul = Double.parseDouble(num1) * Double.parseDouble(num2);
                result.setText(String.valueOf(mul));
                break;
            case R.id.btnsin:
                double sin = Math.sin(Double.parseDouble(num1));
                result.setText(String.valueOf(sin));
                break;
            case R.id.btncos:
                double cos = Math.cos(Double.parseDouble(num1));
                result.setText(String.valueOf(cos));
                break;
            case R.id.btntan:
                double tan = Math.tan(Double.parseDouble(num1));
                result.setText(String.valueOf(tan));
                break;
            case R.id.btnsqrt:
                double sqrt = Math.sin(Double.parseDouble(num1));
                result.setText(String.valueOf(sqrt));
                break;
            case R.id.btnclr:
                memvalue = Double.NaN;
                result.setText(" Data Cleared ");
                break;
            case R.id.btnms:
                inputvalue = Double.parseDouble(number1.getText().toString());
                if (Double.isNaN(inputvalue)) {
                    result.setText("no data");
                } else {
                    memvalue = inputvalue;
                    result.setText(String.valueOf(memvalue));
                }
                break;
            case R.id.btnmem:
                if (Double.isNaN(memvalue)) {
                    result.setText("no data");
                } else
                    result.setText(String.valueOf((int) memvalue));
                break;


        }

    }
}







