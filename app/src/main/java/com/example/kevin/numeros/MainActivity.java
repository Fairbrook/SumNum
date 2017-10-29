package com.example.kevin.numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private  EditText valor2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText) findViewById(R.id.valor1);
        valor2=(EditText) findViewById(R.id.valor2);
        textView=(TextView) findViewById(R.id.textView);
    }

    public void sumar(View a){
        String v1 = valor1.getText().toString();
        String v2 = valor2.getText().toString();
        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);
        int suma = num1+num2;
        String resultado = String.valueOf(suma);
        textView.setText(resultado);
    }
}
