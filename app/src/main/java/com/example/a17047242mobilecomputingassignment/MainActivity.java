package com.example.a17047242mobilecomputingassignment;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int leftSide, rightSide;
    int sumation = leftSide + rightSide;


    public void equations(int total){
        int num = total;

            if (num == sumation){
                TextView myTextView;
                myTextView = findViewById(R.id.equation);
                myTextView.setText("" + leftSide + "+" + rightSide + "=" + num);

            }else{
                TextView myTextView;
                myTextView = findViewById(R.id.equation);
                myTextView.setText(""+ leftSide + "" + rightSide + "= ?" );
            };
    };


    public void correctPage(){

        Button butt0 = (Button) findViewById(R.id.Number0);
        butt0.setVisibility(View.INVISIBLE);
        Button butt1 = (Button) findViewById(R.id.Number1);
        butt1.setVisibility(View.INVISIBLE);
        Button butt2 = (Button) findViewById(R.id.Number2);
        butt2.setVisibility(View.INVISIBLE);
        Button butt3 = (Button) findViewById(R.id.Number3);
        butt3.setVisibility(View.INVISIBLE);
        Button butt4 = (Button) findViewById(R.id.Number4);
        butt4.setVisibility(View.INVISIBLE);
        Button butt5 = (Button) findViewById(R.id.Number5);
        butt5.setVisibility(View.INVISIBLE);
        Button butt6 = (Button) findViewById(R.id.Number6);
        butt6.setVisibility(View.INVISIBLE);
        Button butt7 = (Button) findViewById(R.id.Number7);
        butt7.setVisibility(View.INVISIBLE);
        Button butt8 = (Button) findViewById(R.id.Number8);
        butt8.setVisibility(View.INVISIBLE);
        Button butt9 = (Button) findViewById(R.id.Number9);
        butt9.setVisibility(View.INVISIBLE);

        ImageView apple1 = findViewById(R.id.Apple1);
        apple1.setVisibility(View.INVISIBLE);
        ImageView apple2 = findViewById(R.id.Apple2);
        apple2.setVisibility(View.INVISIBLE);
        ImageView apple3 = findViewById(R.id.Apple3);
        apple3.setVisibility(View.INVISIBLE);
        ImageView apple4 = findViewById(R.id.Apple);
        apple4.setVisibility(View.INVISIBLE);
        ImageView apple5 = findViewById(R.id.Apple5);
        apple5.setVisibility(View.INVISIBLE);
        ImageView apple6 = findViewById(R.id.Apple6);
        apple6.setVisibility(View.INVISIBLE);
        ImageView apple7 = findViewById(R.id.Apple7);
        apple7.setVisibility(View.INVISIBLE);
        ImageView apple8 = findViewById(R.id.Apple8);
        apple8.setVisibility(View.INVISIBLE);
        ImageView apple9 = findViewById(R.id.Apple9);
        apple9.setVisibility(View.INVISIBLE);
        ImageView plate = findViewById(R.id.plate);
        plate.setVisibility(View.INVISIBLE);

        Button replayButton = (Button) findViewById(R.id.ReplayButt);
        replayButton.setVisibility(View.VISIBLE);
        View greenBG = (View) findViewById(R.id.correctScrn);
        greenBG.setVisibility(View.VISIBLE);
        ImageView s1 = findViewById(R.id.Star1);
        s1.setVisibility(View.VISIBLE);
        ImageView s2 = findViewById(R.id.Star2);
        s2.setVisibility(View.VISIBLE);
        View text = (View) findViewById(R.id.Correct);
        text.setVisibility(View.VISIBLE);
        ImageView thumb = findViewById(R.id.thumbsup);
        thumb.setVisibility(View.VISIBLE);


    };

    public void incorrectPage(){};

    public void onButtonClick(View v){
            Button pressed = (Button)v;
            int answer = Integer.parseInt (pressed.getText().toString() );

            if ( answer == sumation  ) {
                correctPage();
                equations(sumation);
            } else{
                AlphaAnimation alpha;
                alpha }
            }

        };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equations( -1);

        ImageView Apple1 = (ImageView) findViewById(R.id.Apple1);
        Apple1.setOnTouchListener(handleTouch);
        ImageView Apple2 = (ImageView) findViewById(R.id.Apple2);
        Apple2.setOnTouchListener(handleTouch);
        ImageView Apple3 = (ImageView) findViewById(R.id.Apple3);
        Apple3.setOnTouchListener(handleTouch);
        ImageView Apple4 = (ImageView) findViewById(R.id.Apple);
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

    public void equals0 (){

    };
    

}