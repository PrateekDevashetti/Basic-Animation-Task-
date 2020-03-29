package com.example.vibratemode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initilise the Button;

    Button vibrateButton;
    Vibrator vibrator;


    Animation rotateAnimation;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Assign the Variable

        textView = findViewById(R.id.textView);
        rotateAnimation();


        vibrateButton = findViewById(R.id.vibrateButton);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        // Perform the onClick Event

        vibrateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Vibrator Time In Millisecond

                vibrator.vibrate(1000);

            }
        });


    }
    private void rotateAnimation() {

        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate);

        // rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha);

        textView.startAnimation(rotateAnimation);

    }

}
