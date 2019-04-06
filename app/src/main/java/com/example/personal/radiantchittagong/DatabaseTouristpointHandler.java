package com.example.personal.radiantchittagong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Personal on 2/14/2018.
 */

public class DatabaseTouristpointHandler extends SQLiteOpenHelper {
    private static final int version = 1;
    private static final String databaseName = "places.db";
    private static final String tableName = "place";
    private static final String name = "name";
    private static final String details = "details";
    private static final String ID = "id";

    public DatabaseTouristpointHandler(Context context) {
        super(context, databaseName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+tableName
                +"("
                +ID+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                +name+" TEXT, "
                +details+" TEXT"
                +")";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS "+tableName;
        db.execSQL(sql);
        onCreate(db);

    }
    public void insert(Place place){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(name, place.getName());
        values.put(details, place.getDetails());
        db.insert(tableName, null, values);
        db.close();
    }

    public Place select(String name){
        SQLiteDatabase db = this.getReadableDatabase();

        String sql = "SELECT * FROM "+tableName;
        Cursor cursor = db.rawQuery(sql, null);
        String a = "";
        String b= "";
        a = cursor.getString(1);
        b = cursor.getString(2);
        if(cursor.getCount()==0) {
            System.out.println("lol");
        }
        else{
            if(cursor.moveToFirst()){
                do{
                    if(a.equals(name)){
                        break;
                    }
                }while (cursor.moveToNext());
            }
        }

        Place result = new Place(a, b);
        db.close();
        return result;
    }





}
