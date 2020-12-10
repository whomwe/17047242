package com.example.a17047242mobilecomputingassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Apple1 = (ImageView) findViewById(R.id.Apple1);
        Apple1.setOnTouchListener(handleTouch);
        ImageView Apple2 = (ImageView) findViewById(R.id.Apple2);
        Apple2.setOnTouchListener(handleTouch);
        ImageView Apple3 = (ImageView) findViewById(R.id.Apple3);
        Apple3.setOnTouchListener(handleTouch);
        ImageView Apple4 = (ImageView) findViewById(R.id.Apple4);
        Apple4.setOnTouchListener(handleTouch);
        ImageView Apple5 = (ImageView) findViewById(R.id.Apple5);
        Apple5.setOnTouchListener(handleTouch);
        ImageView Apple6 = (ImageView) findViewById(R.id.Apple6);
        Apple6.setOnTouchListener(handleTouch);
        ImageView Apple7 = (ImageView) findViewById(R.id.Apple7);
        Apple7.setOnTouchListener(handleTouch);
        ImageView Apple8 = (ImageView) findViewById(R.id.Apple8);
        Apple8.setOnTouchListener(handleTouch);
        ImageView Apple9 = (ImageView) findViewById(R.id.Apple9);
        Apple9.setOnTouchListener(handleTouch);

    }

    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0)
                            .start();
                    break;
                default:
                    return false;
            }
            return true;
        }
    };
    

}