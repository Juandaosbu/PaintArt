package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ejercicio7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
    }

    public void calcular(View v){

        EditText dividendo = findViewById(R.id.dividendo);
        double divid = Double.parseDouble(dividendo.toString());
        EditText divisor = findViewById(R.id.divisor);
        double divis = Double.parseDouble(divisor.toString());
        EditText cociente= findViewById(R.id.cociente);
        EditText residuo = findViewById(R.id.residuo);

        double resul = divid;
        int contador = 0;

        while (true) {
            resul = resul - divis;
            contador++;
            if (resul < divis) {
                break;
            }
        }

        String resi = String.valueOf(resul);
        String coci = String.valueOf(contador);

        cociente.setText(coci);
        residuo.setText(resi);
    }
}