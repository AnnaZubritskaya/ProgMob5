package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=((Button)findViewById(R.id.btn));
        ValueAnimator xmlAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(this, R.animator.my_val_animator);
        xmlAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator updateAnimation) {
                float animatedValue = (float) updateAnimation.getAnimatedValue();
                btn.setTranslationX(animatedValue);
            }
        });
        xmlAnimator.start();
    }
}