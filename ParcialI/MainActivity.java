package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejercicio2(View view) {
        Intent ejercicio2 = new Intent(this,ejercicio2.class);
        startActivity(ejercicio2);
    }

    public void ejercicio6(View view) {
        Intent ejercicio6 = new Intent(this,ejercicio6.class);
        startActivity(ejercicio6);
    }

    public void ejercicio7(View view) {
        Intent ejercicio7 = new Intent(this,ejercicio7.class);
        startActivity(ejercicio7);
    }

    public void ejercicio8(View view) {
        Intent ejercicio8 = new Intent(this,ejercicio8.class);
        startActivity(ejercicio8);
    }

    public void ejercicio9(View view) {
        Intent ejercicio9 = new Intent(this,ejercicio9.class);
        startActivity(ejercicio9);
    }
}