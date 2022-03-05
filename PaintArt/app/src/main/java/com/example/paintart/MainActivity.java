package com.example.paintart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vista vista = new Vista(this);
        setContentView(vista);
    }

    class Vista extends View {

        float x = 50;
        float y = 50;
        String accion = "accion";
        Path path = new Path();

        public Vista(Context context){
            super(context);
        }

        public void onDraw(Canvas canvas){
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(6);
            paint.setColor(Color.RED);

            int heigth = canvas.getWidth();

            if (accion == "bajo"){
                path.moveTo(x,y);
            }

            if (accion == "se movio"){
                path.lineTo(x,y);
            }

            canvas.drawPath(path,paint);
        }

        public boolean onTouchEvent(MotionEvent e){
            x = e.getX();
            y = e.getY();

            if (e.getAction() == MotionEvent.ACTION_DOWN){
                accion ="bajo";
            }

            if (e.getAction() == MotionEvent.ACTION_MOVE){
                accion ="se movio";
            }

            invalidate();
            return true;
        }
    }
}