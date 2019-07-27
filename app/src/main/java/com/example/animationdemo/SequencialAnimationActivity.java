package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class SequencialAnimationActivity extends AppCompatActivity implements Animation.AnimationListener{
TextView textView;
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencial_animation);
        textView = findViewById(R.id.text);
        animation = AnimationUtils.loadAnimation(SequencialAnimationActivity.this, R.anim.sequencial);
        textView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(SequencialAnimationActivity.this, "Animation in Sequencial manner starts", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
