package com.fabricadmin.logiangle.fabricspaadmin.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.fabricadmin.logiangle.fabricspaadmin.R;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = (ImageView) findViewById(R.id.text);
        Thread timer = new Thread() {
            public void run() {
                Thread timer = new Thread() {
                    public void run() {
                        try {
                            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                            imageView.startAnimation(animation);
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                            startActivity(i);

                        }
                    }
                };
                timer.start();
            }
        };
        timer.start();

    }
}
