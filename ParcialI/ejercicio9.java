package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);
    }

    public void calcular(View v) {

        EditText numero = findViewById(R.id.numero);
        EditText resultado = findViewById(R.id.resultado);

        int num = Integer.parseInt(numero.getText().toString());

        int sumar = 0, cantidad = 0, contador = 0;

        while (cantidad < num) {
            if ((contador % 2) != 0) {
                sumar = sumar + contador;
                cantidad++;
            }
            contador++;
        }

        resultado.setText(String.valueOf(sumar));
    }
}