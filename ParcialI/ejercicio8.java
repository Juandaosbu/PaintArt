package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
    }

    public void calcular(View v){

        EditText numero = findViewById(R.id.numero);
        EditText numeroin = findViewById(R.id.numeroin);

        String num = numero.getText().toString();
        String numiv = new StringBuilder(num).reverse().toString();

        numeroin.setText(numiv);
    }
}