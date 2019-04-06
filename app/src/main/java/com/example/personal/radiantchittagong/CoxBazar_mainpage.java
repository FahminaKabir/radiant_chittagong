package com.example.personal.radiantchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoxBazar_mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cox_bazar_mainpage);
        getSupportActionBar().setTitle("Cox's Bazar");
    }


    public void History(View v){
        Intent intent1 = new Intent(this,CoxsbazarHistory.class);
        startActivity(intent1);
    }

    public void Hotels(View v){
        Intent intent1 = new Intent(this,CoxsbazarHotels.class);
        startActivity(intent1);

    }
    public void placeTogo(View v){
        Intent intent1 = new Intent(this, CoxbazarPlaces.class);
        startActivity(intent1);

    }

    public void shops(View v){
        Intent intent1 = new Intent(this,CoxbazarShops.class);
        startActivity(intent1);

    }
    public void transport(View v){
        Intent intent1 = new Intent(this,CoxbazarTransport.class);
        startActivity(intent1);

    }


}
