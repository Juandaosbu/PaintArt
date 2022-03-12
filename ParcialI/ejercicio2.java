package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ejercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
    }

    public void calcular(View v){
        EditText horas = findViewById(R.id.horas);
        EditText Valtotal = findViewById(R.id.Valtotal);

        int hrs = Integer.parseInt(horas.getText().toString());
        int plata = 0;

        for (int i=0; i<hrs; i++) {
            if (i < 35) {
                plata = plata + 15000;
            } else if (i >= 35){
                plata = plata + 27000;
            }
            Valtotal.setText(String.valueOf(plata));
        }
    }

    public void limpiar(View v){
        EditText horas = findViewById(R.id.horas);

        horas.setText("");
    }
}