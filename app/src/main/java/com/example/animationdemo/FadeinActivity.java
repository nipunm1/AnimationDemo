package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class FadeinActivity extends AppCompatActivity implements Animation.AnimationListener {
Animation animation;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadein);
        textView = findViewById(R.id.text);
        animation = AnimationUtils.loadAnimation(FadeinActivity.this, R.anim.fade_in);
        animation.setAnimationListener(this);
        textView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(FadeinActivity.this, "Animation Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(FadeinActivity.this, "Animation Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
