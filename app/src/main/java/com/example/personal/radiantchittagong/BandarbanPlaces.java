package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BandarbanPlaces extends AppCompatActivity {
    TextView tv1, tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban_places);

        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        getSupportActionBar().setTitle("Places to Visit");
    }

    public void hotelhill(View v){
        String str = "Bus Station Main Road,Bandarban, Chittagong, Bangladesh \n" +
                "three Single bed room Connecting- AC \n" +
                "price from: 8855.00 BDT";
        tv1.setText(str);
    }
    public void Plaza(View v){
        String str = "Ward No-7,Army Para,Bandarban, Chittagong, Bangladesh\n" +
                "Royal Suit \n" +
                "price from: 5692.50 BDT";
        tv2.setText(str);
    }
    public void greenpeak(View v){
        String str = "Richa (Near Meghla),Bandarban, Chittagong, Bangladesh\n" +
                "Premier \n" +
                "price from: 7500.00 BDT ";
        tv3.setText(str);
    }


}
