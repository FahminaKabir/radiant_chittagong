package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BandarbanShops extends AppCompatActivity {

    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban_shops);
        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        getSupportActionBar().setTitle("Shops and Restaurant");

    }
    public void bbb(View v){
        String str = "There is an abundance of Burmese, Thai and Chinese trinkets, textile and other stuff in the town. But, the best buy is definitely the products of local handloom - cloth fabric, shawls, blankets and more - as well as products of bamboo, cane and wood - buskets, flutes, hats, mask and more. Prices are amazingly low, and textile qualities are amazingly high. The designs are refreshingly exotic and extremely geometric.";
        tv1.setText(str);
    }

    public void bb1(View v){
        String str = "Green Prairie Restaurant\n" +
                "Rating : 4.0\n" +
                "\n" +
                "choruivati restaurant\n" +
                "Rating : 4.2\n" +
                "\n" +
                "Ruposhi Bangla Hotel Bandarban\n" +
                "Rating : 4.0\n" +
                "\n" +
                "Tohzah Restaurant\n" +
                "Rating : 4.2";
        tv2.setText(str);
    }


}
