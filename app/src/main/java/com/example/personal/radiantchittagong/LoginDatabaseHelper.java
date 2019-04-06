package com.example.personal.radiantchittagong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Personal on 2/5/2018.
 */
public class LoginDatabaseHelper extends SQLiteOpenHelper {
    private static final int databaseVersion = 1;
    private static final String databaseName = "userlogin.db";
    private static final String tableName = "userLogin";
    private static final String UserName = "userName";
    private static final String Password = "password";
    private static final String ID = "id";
    //SQLiteDatabase db;

    public LoginDatabaseHelper(Context context) {
            super(context, databaseName, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+tableName
                +"("
                +ID+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                +UserName+" TEXT, "
                +Password+" TEXT"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion1) {
        String sql = "DROP TABLE IF EXISTS "+tableName;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insertItem(LoginItems login){
        SQLiteDatabase db = this.getWritableDatabase();

        //String sql = "INSERT INTO user ("+UserName +","+ Password + ") VALUES ('"+login.getUsername()+"','"+login.getPassword()+"')";
        //db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put(UserName, login.getUsername());
        values.put(Password, login.getPassword());

        db.insert(tableName, null, values);
        db.close();

    }
    public boolean select(String Name, String Pass){
        SQLiteDatabase db = this.getReadableDatabase();

        String sql = "SELECT * FROM "+tableName;
        Cursor cursor = db.rawQuery(sql, null);
        boolean result = false;
        if(cursor.getCount()==0) {
            System.out.println("Database is empty");
        }
        else{
            if(cursor.moveToFirst()){
                do{
                    String a = cursor.getString(1);
                    String b = cursor.getString(2);
                    if(a.equals(Name) && b.equals(Pass)){
                        result = true;
                        break;
                    }
                }while (cursor.moveToNext());
            }
        }
        db.close();
        return result;
    }

    public boolean updatePass(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserName,username);
        contentValues.put(Password,password);
        db.update(tableName,contentValues," Password = ?", new String[]{username});
        return true;
    }
}



