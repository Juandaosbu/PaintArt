package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
    }

    double numRandom = Math.floor(Math.random() * (1000-1+1)) + 1;
    int contador = 0;

    public void calcular(View v){
        EditText numero = findViewById(R.id.numero);
        double num = Double.parseDouble(numero.getText().toString());
        contador++;

        if (num > numRandom) {
            Toast.makeText(this, "El numero ingresado debe ser MENOR!", Toast.LENGTH_SHORT).show();
        }else if (num < numRandom) {
            Toast.makeText(this, "El numero ingresado debe ser MAYOR!", Toast.LENGTH_SHORT).show();
        }else if (num == numRandom) {
            Toast.makeText(this, "GANASTE!!!!", Toast.LENGTH_SHORT).show();

            if (contador >= 1 && contador <= 3) {
                Toast.makeText(this, "SUERTUDO!", Toast.LENGTH_LONG).show();
            }else if (contador >= 4 && contador <= 6) {
                Toast.makeText(this, "GENIO!", Toast.LENGTH_LONG).show();
            }else if (contador >= 7 && contador <= 8) {
                Toast.makeText(this, "SE PUEDE MEJORAR!", Toast.LENGTH_LONG).show();
            }else if (contador >= 9) {
                Toast.makeText(this, "NO ERES MUY INTELIGENTE!", Toast.LENGTH_LONG).show();
            }
        }

    }
}