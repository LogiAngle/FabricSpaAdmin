package com.fabricadmin.logiangle.fabricspaadmin.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fabricadmin.logiangle.fabricspaadmin.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        System.out.println("Hello Sujit");
    }
}
