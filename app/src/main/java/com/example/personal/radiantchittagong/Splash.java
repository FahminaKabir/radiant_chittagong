package com.example.personal.radiantchittagong;

import android.app.Activity;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        notify("onCreate");
        splash();
        logo_anim();
    }

    private void splash() {
        final Intent intent = new Intent(this, Login.class);
        final Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }

    private void logo_anim() {
        ImageView logo = (ImageView) findViewById(R.id.logo);
        Animation logoanimation = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        logo.startAnimation(logoanimation);
        TextView ID = (TextView) findViewById(R.id.id);
        Animation IDanim = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        ID.startAnimation(IDanim);
    }

    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop");
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy");
    }

    private void notify(String methodName)
    {
        Log.d("MainActivity: ", methodName);
    }

}