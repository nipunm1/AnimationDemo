package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class FadeoutActivity extends AppCompatActivity implements Animation.AnimationListener {
Animation animation;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadeout);
        textView = findViewById(R.id.text);
        animation = AnimationUtils.loadAnimation(FadeoutActivity.this, R.anim.fade_out);
        animation.setAnimationListener(this);
        textView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(FadeoutActivity.this,"Animation starts to fading away",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(FadeoutActivity.this, "Animation fades away", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
