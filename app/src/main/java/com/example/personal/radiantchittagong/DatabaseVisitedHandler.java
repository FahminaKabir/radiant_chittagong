package com.example.personal.radiantchittagong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Personal on 2/14/2018.
 */

public class DatabaseVisitedHandler extends SQLiteOpenHelper {
    private static final int databaseVersion = 1;
    private static final String databaseName = "visited.db";
    private static final String tableName = "item";
    private static final String keyId = "id";
    private static final String keyName = "names";
    private static final String keyNote = "notes";

    public DatabaseVisitedHandler(Context context) {
        super(context, databaseName, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + tableName
                + "("
                + keyId + " INTEGER PRIMARY KEY, "
                + keyName + " TEXT, "
                + keyNote + " TEXT"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion1) {
        String sql = "DROP TABLE IF EXISTS " + tableName;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insertItem(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(keyName, item.getName());
        values.put(keyNote, item.getNotes());

        db.insert(tableName, null, values);
        db.close();
    }


        public List<Item> getAllItems() {
        SQLiteDatabase db = this.getReadableDatabase();

        List<Item> itemList = new ArrayList<>();
        String sql = "SELECT * FROM " + tableName;
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                Item item = new Item(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2));
                itemList.add(item);
                Log.d(TAG, "Items: "+item);
            } while (cursor.moveToNext());
        }
        db.close();
        return itemList;
    }
/*
    public void deleteItem(int id) {
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(tableName, keyId + "=?", new String[]{String.valueOf(id)});
        db.close();
    }*/
}