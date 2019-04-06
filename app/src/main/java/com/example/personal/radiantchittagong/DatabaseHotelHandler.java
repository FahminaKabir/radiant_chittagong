package com.example.personal.radiantchittagong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;

//import static com.example.personal.radiantchittagong.HotelItems.getPictureByteOfArray;

/**
 * Created by Personal on 2/12/2018.
 */

public class DatabaseHotelHandler extends SQLiteOpenHelper {
    private static final int version = 1;
    private static final String databseName = "NewHotel.db";
    private static final String hotelsTable = "hotel";
    private static final String name = "name";
    private static final String details = "details";
    private static final String id = "id";


    public DatabaseHotelHandler(Context context) {
        super(context, databseName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+ hotelsTable
            +" ("
            +id+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +name+" TEXT,"
            +details+" TEXT"
            +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS "+hotelsTable;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insertHotel(HotelItems hotel){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(name, hotel.getName());
        values.put(details, hotel.getDetails());

        db.insert(hotelsTable, null, values);
        db.close();
        System.out.println("inserted");
    }

    public HotelItems select(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        HotelItems h = null;
        System.out.println("selected");
        String a = "";
        String b = "";
        boolean result = false;
        String sql = "SELECT * FROM "+hotelsTable;
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.getCount()==0) {
            System.out.println("Database is empty");
        }
        else{
            if(cursor.moveToFirst()){
                do{
                    a = cursor.getString(1);
                    b = cursor.getColumnName(2);
                    if(a.equals(name)) {
                        h = new HotelItems(a, b);
                        System.out.println("selected");
                        //result = true;
                        break;
                    }
                }while (cursor.moveToNext());
            }
        }
        db.close();
        return h;
    }

}
