package com.example.personal.radiantchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rangamati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati);
    }
    public void History(View v){
        Intent intent1 = new Intent(this,RangamatiHistory.class);
        startActivity(intent1);
    }

    public void Hotels(View v){
        Intent intent1 = new Intent(this,RangamatiHotels.class);
        startActivity(intent1);

    }
    public void placetogo(View v){
        Intent intent1 = new Intent(this,RangamatiPlaces.class);
        startActivity(intent1);

    }

    public void shop(View v){
        Intent intent1 = new Intent(this,RangamatiShops.class);
        startActivity(intent1);

    }
    public void transport(View v){
        Intent intent1 = new Intent(this,RangamatiTransportation.class);
        startActivity(intent1);
    }

}
