package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CoxbazarShops extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxbazar_shops);
        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text);

        getSupportActionBar().setTitle("Shops and Restaurant");
    }

    public void hotelmotel(View v) {
        String str = "The Hotel Motel zone is the main shopping district of Cox’s Bazar. This shopping area is the most touristy, given that the main industry of the town is tourism. This is the best place to pick up little souvenirs that are customary for any tourist.";
        tv1.setText(str);
    }

    public void burmese(View v) {
        String str = "The Burmese Market, as its name suggests, caters to the rather sizable Burmese population living in the area surrounding Cox’s Bazar. The place is run by locals, mostly, or Burmese who have been living around the place for generations and have assimilated entirely into the local way of life.";
        tv2.setText(str);
    }

    public void ramu(View v) {
        String str = "The village of Ramu is located about 10 kilometers away from Cox’s Bazar, a mere 10 minute drive away from the resort and beach haven that the town is. The village of Ramu is famous for its monasteries and Buddhist relics, having a large Buddhist population living in the village. It is also famous for its homemade cigars.";
        tv3.setText(str);
    }
    public void bb1(View v) {
        String str ="\n" +
                "Mermaid Café  \n" +
                "Address: Cox's Bazar\n" +
                "Hours: Open · Closes 11:30PM\n" +
                "Phone: 01841-416461\n" +
                "\n" +
                "Poushee Restaurant  \n" +
                "Address: Hotel Sayeman Road, Jhauta, Coxs Bazar 4700\n" +
                "Hours: Open · Closes 11PM\n" +
                "Phone: 0341-62343\n" +
                "\n" +
                "EFC Live Fish Restaurant  \n" +
                "Address: Cox's Bazar\n" +
                "Hours: Open · Closes 11:30PM\n" +
                "Phone: 01747-394802\n" +
                "\n" +
                "Jhaubon Restaurant\n" +
                "Address: New Beach Rd, Cox's Bazar\n" +
                "Hours: Open 24 hours\n" +
                "Phone: 01989-112944";
        tv4.setText(str);
    }

}
