package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actividad1(View view) {
       Intent actividad1 = new Intent(this,actividad1.class);
       startActivity(actividad1);
    }

    public void actividad2(View view) {
        Intent actividad2 = new Intent(this,actividad2.class);
        startActivity(actividad2);
    }

    public void actividad3(View view) {
        Toast.makeText(this,"hola actividad 3", Toast.LENGTH_LONG).show();
    }

    public void actividad4(View view) {
        Toast.makeText(this,"hola actividad 4", Toast.LENGTH_LONG).show();
    }

    public void actividad5(View view) {
        Toast.makeText(this,"hola actividad 5", Toast.LENGTH_LONG).show();
    }

    public void actividad6(View view) {
        Toast.makeText(this,"hola actividad 6", Toast.LENGTH_LONG).show();
    }

    public void actividad7(View view) {
        Toast.makeText(this,"hola actividad 7", Toast.LENGTH_LONG).show();
    }

    public void actividad8(View view) {
        Toast.makeText(this,"hola actividad 8", Toast.LENGTH_LONG).show();
    }
}