package com.example.personal.radiantchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SaintMartin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saint_martin);
        getSupportActionBar().setTitle("Saint Martin");
    }

    public void History(View v){
        Intent intent1 = new Intent(this,SaintmartinHistory.class);
        startActivity(intent1);
    }

    public void hotels(View v){
        Intent intent1 = new Intent(this,SaintMartinHotels.class);
        startActivity(intent1);

    }
    public void placeTogo(View v){
        Intent intent1 = new Intent(this,SaintMartinPlaces.class);
        startActivity(intent1);

    }

    public void shops(View v){
        Intent intent1 = new Intent(this,SaintMartinShops.class);
        startActivity(intent1);

    }
    public void transport(View v){
        Intent intent1 = new Intent(this,SaintMartinTransport.class);
        startActivity(intent1);

    }

}
