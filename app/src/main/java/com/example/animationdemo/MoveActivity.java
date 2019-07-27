package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MoveActivity extends AppCompatActivity {
Animation animation,animation2;
TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        textView = findViewById(R.id.text);
        textView2 = findViewById(R.id.text2);
        animation2 = AnimationUtils.loadAnimation(MoveActivity.this, R.anim.move2);
        animation = AnimationUtils.loadAnimation(MoveActivity.this, R.anim.move);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(MoveActivity.this, "Animations starts moving", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        textView.startAnimation(animation);
        textView2.startAnimation(animation2);
    }
}
