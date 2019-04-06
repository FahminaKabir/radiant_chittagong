package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SaintMartinShops extends AppCompatActivity {

    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saint_martin_shops);
        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);

        getSupportActionBar().setTitle("Shops and Restaurant");
    }
    public void marshop(View v){
        String str = "There are many small shops near the dock/port and along the main road selling very basic necessities and the odd souvenir t-shirts, hats, dry fish, shoe, sandals, dry foods, cosmetics & toiletries and sunglasses and many more. These are relatively cheap from the main town.\n" +
                "Sea shells and things made from them are sold by little children around the island, but it's illegal and leads to the depletion of sea life. If any one go there, please not to buy those and encourage others not to buy those.";
        tv1.setText(str);
    }
    public void bb1(View v){
        String str = "Narikel Jinjira Restaurant\n" +
                "Address: Jetty Ghat, Saint Martin's Island, 4762\n" +
                "Phone: 01761-775155\n" +
                "\n" +
                "Euro Bangla Restaurant  \n" +
                "Address: Saint Martin's Islands,Upozila District Cox's Bazaar,Division, Teknaf\n" +
                "Hours: Open · Closes 10PM\n" +
                "Phone: 01818-740363\n" +
                "\n" +
                "Appayan  \n" +
                "Hours: Open · Closes 10PM\n" +
                "Phone: 01716-789634\n" +
                "\n" +
                "Ocean View  \n" +
                "Address: Saintmartin\n" +
                "Hours: Open · Closes 10PM";
        tv2.setText(str);
    }

}
