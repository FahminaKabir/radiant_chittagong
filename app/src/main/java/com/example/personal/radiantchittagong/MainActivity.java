package com.example.personal.radiantchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void coxBazar(View v){
        Intent intent1 = new Intent(this,CoxBazar_mainpage.class);
        startActivity(intent1);

    }
    public void Rangamati(View v){
        Intent intent1 = new Intent(this,Rangamati.class);
        startActivity(intent1);
    }
    public void Bandarban(View v){
        Intent intent1 = new Intent(this,Bandarban.class);
        startActivity(intent1);
    }
    public void SaintMartin(View v){
        Intent intent1 = new Intent(this,SaintMartin.class);
        startActivity(intent1);
    }

    public  void visit(View v){
        Intent i = new Intent(this, Visited.class);
        startActivity(i);
    }



}
