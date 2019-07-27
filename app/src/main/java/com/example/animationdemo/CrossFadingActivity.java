package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class CrossFadingActivity extends AppCompatActivity {
TextView textView,textView2;
Animation animation,animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fading);
        textView = findViewById(R.id.text);
        textView2 = findViewById(R.id.text2);
        animation = AnimationUtils.loadAnimation(CrossFadingActivity.this, R.anim.fade_in);
        animation2 = AnimationUtils.loadAnimation(CrossFadingActivity.this, R.anim.fade_out);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(CrossFadingActivity.this, "Animation fadein starts", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(CrossFadingActivity.this, "Animation fadein ends", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animation2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(CrossFadingActivity.this, "Animation fadeout starts", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(CrossFadingActivity.this, "Animation fadedout", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        textView.setVisibility(View.VISIBLE);
        textView.setAnimation(animation);
        textView2.setAnimation(animation2);
    }
}
