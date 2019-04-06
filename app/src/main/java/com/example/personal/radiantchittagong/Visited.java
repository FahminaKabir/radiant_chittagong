package com.example.personal.radiantchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Visited extends AppCompatActivity {
    DatabaseVisitedHandler db;
    EditText et1,et2;
    TextView textView;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visited);
        db = new DatabaseVisitedHandler(this);
        textView = (TextView) findViewById(R.id.text1);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        l1 = (LinearLayout) findViewById(R.id.l1);
        getSupportActionBar().setTitle("Make your list");

    }

    public void insertItem(View v) {
        String name = et1.getText().toString();
        String text = et2.getText().toString();
        if (name.equals("") || text.equals("")) {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        } else {
            db.insertItem(new Item(name, text));
            Toast.makeText(getApplicationContext(), "Insert Successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void showAllItems(View v) {
        List<Item> items = db.getAllItems();
        if (items.size() == 0) {
            Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
        } else {
            l1.removeAllViews();
            for (Item item : items) {

                textView = new TextView(this);
                textView.setText(item.getName() + "\t\t\t\t\t\t" + item.getNotes());
                l1.addView(textView);
            }
        }
    }
}
