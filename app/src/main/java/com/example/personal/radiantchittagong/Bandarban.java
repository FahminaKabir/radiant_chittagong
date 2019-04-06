package com.example.personal.radiantchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bandarban extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban);
        getSupportActionBar().setTitle("Bandarban");
    }

    public void History(View v){
        Intent intent1 = new Intent(this,BandarbanHistory.class);
        startActivity(intent1);
    }

    public void Hotels(View v){
        Intent intent1 = new Intent(this,BandarbanHotels.class);
        startActivity(intent1);

    }
    public void placeTogo(View v){
        Intent intent1 = new Intent(this,BandarbanPlaces.class);
        startActivity(intent1);

    }

    public void shops(View v){
        Intent intent1 = new Intent(this,BandarbanShops.class);
        startActivity(intent1);

    }
    public void transport(View v){
        Intent intent1 = new Intent(this,BandarbanTransport.class);
        startActivity(intent1);

    }


}
