package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }

    public void calcular(View v){
        EditText edt = findViewById(R.id.lado);
        EditText resul = findViewById(R.id.resultado);

        float lado = Float.valueOf(edt.getText().toString());
        float perimetro = lado*6;
        resul.setText(String.valueOf(perimetro));

    }
}