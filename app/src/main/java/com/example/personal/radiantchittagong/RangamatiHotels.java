package com.example.personal.radiantchittagong;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RangamatiHotels extends AppCompatActivity {

    TextView tv1, tv2, tv3;
    String str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati_hotels);


        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        getSupportActionBar().setTitle("Hotels");

        //db = new DatabaseHotelHandler(this);

    }
    public void hotelhill(View v){
        String str = "Reserve Bazar, Rangamati 4500, Bangladesh\n" +
                "price: 2000.00 BDT";
        tv1.setText(str);
    }
    public void Plaza(View v){
        String str = "no 106 Kathaltali, Rangamati 4500, Bangladesh" +
                "\nPrice: 1500 BDT";
        tv2.setText(str);
    }
    public void greenpeak(View v){
        String str = "Alif market,Bonorupa,Rangamati, Chittagong, Bangladesh \n" +
                "price: 2500.00 BDT(triple bed)";
        tv3.setText(str);
    }



}

