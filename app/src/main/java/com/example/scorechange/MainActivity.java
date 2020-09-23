package com.example.scorechange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    Animation scale_up, scale_down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      button1 = findViewById(R.id.button1);
      button2 = findViewById(R.id.button2);
      scale_up = AnimationUtils.loadAnimation(this,R.anim.scale_up);
      scale_down = AnimationUtils.loadAnimation(this,R.anim.scale_down);


    button1.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                button1.startAnimation(scale_up);
            }
            else if(event.getAction() == MotionEvent.ACTION_UP){
                button1.startAnimation(scale_down);
            }
            return false;
        }
    });


        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button2.startAnimation(scale_up);
                }
                else if(event.getAction() == MotionEvent.ACTION_UP){
                    button2.startAnimation(scale_down);
                }
                return false;
            }
        });

    }

    public void butOneInc(View view) {
        Button a =findViewById(R.id.button1);
        String text = a.getText().toString();
        int number = Integer.parseInt(text);
        number++;
        String newText = Integer.toString(number);
        a.setText(newText);

    }

    public void butTwoInc(View view) {

        Button b =findViewById(R.id.button2);
        String text = b.getText().toString();
        int number = Integer.parseInt(text);
        number++;
        String newText = Integer.toString(number);
        b.setText(newText);
    }
    public void reset(View view) {
        Button a =findViewById(R.id.button1);
        a.setText("0");
        Button b =findViewById(R.id.button2);
        b.setText("0");
    }



}