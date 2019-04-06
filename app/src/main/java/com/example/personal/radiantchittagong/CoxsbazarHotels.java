package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CoxsbazarHotels extends AppCompatActivity {

    RelativeLayout rl1, rl2, rl3, rl4;
    TextView tv1, tv2, tv3, tv4;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxsbazar_hotels);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        rl1 = (RelativeLayout) findViewById(R.id.info1);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        getSupportActionBar().setTitle("Hotels");

    }
    public void hotelhill(View v){
        String str = "loc : Plot #7, Road #2, Hotel Motel Zone | Kolatoli, Cox's Bazar, Bangladesh"
                + "\nprice : 6370 BDT( per day, 1room, 2 adults)";
        tv1.setText(str);
    }
    public void Plaza(View v){
        String str1 = "Kolatoli Road | Kolatoli Circle, Cox's Bazar 4700, Bangladesh\\n\" +\n" +
                "\n6632BDT(per day, 1room, 2 adults)";
        tv2.setText(str1);
    }
    public void greenpeak(View v){
        String str2 = "Plot # 30, Block # B, Sea beach Road R/A, Kolatoli, Cox's Bazar 4700, Bangladesh\\n\" +\n" +
                "\n6632BDT(per day, 1room, 2 adults) ";
        tv4.setText(str2);
    }
    public void got(View v){
        String str3 = "Bangladesh Navy Forward Base, Saint Martin's Island, Bangladesh\n" +
                "3880BDT(per day, 1room, 2 adults) ";
        tv3.setText(str3);
    }


}




