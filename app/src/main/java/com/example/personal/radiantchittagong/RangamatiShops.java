package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RangamatiShops extends AppCompatActivity {

    TextView tv1 ,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati_shops);
        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        getSupportActionBar().setTitle("Shops and Restaurant");


    }
    public void rangshop(View v){
        String str = "All the local food and textile products, as well as wet grocery vendors selling fresh hill produces. look for nappi, a local delicacy, to take home here. but, don't forget to pack it tight when carrying. this market bustles with activity in the earl morning, with tribes-people coming down the hills to sell vegetables of every color, as well as roots, tubers, fruits, berries and nuts.Flutes, hats, pitchers and other stuff made by the bawm people are sold in little shop crammed full with exotic and wonderful products. bargaining while sipping on a cup of tea is a wonderful activity here.";
        tv1.setText(str);
    }
    public void bb1(View v){
        String str = "Peda Ting Ting  \n" +
                "Address: Balukhali Bazar\n" +
                "Hours: Closed · Opens 8AM Fri\n" +
                "Phone: 0351-62082\n" +
                "\n" +
                "Spice Restaurant  \n" +
                "Address: N 106, Rangamati\n" +
                "Hours: Open · Closes 10PM\n" +
                "Phone: 01775-196752\n" +
                "\n" +
                "Chang Pang Restaurant  \n" +
                "Address: Lake, Kaptai\n" +
                "Hours: Closed · Opens 9AM Fri\n" +
                "Phone: 01820-549703\n" +
                "\n" +
                "Berannye Lake Shore Cafe\n" +
                "Rangamati\n" +
                "Reservations required · Cash only · Outdoor seating\n" +
                "Closed · Opens 10AM Fri";
        tv2.setText(str);
    }

}
