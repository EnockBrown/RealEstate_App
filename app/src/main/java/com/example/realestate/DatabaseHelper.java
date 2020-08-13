package com.example.realestate;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public  class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="realestate.db";
    public  static final String TABLE_NAME="realestate_table";
    public static final String COL_1="id";
    public static final String COL_2="name";
    public static final String COL_3="location";
    public static final String COL_4="price";
    public static final String COL_5="details";
    public static final String COL_6="available_rooms";

    public DatabaseHelper(@Nullable Context context) {
        //whenever the constructor is called the database realestate.db will be created
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //execute the query
        db.execSQL("create table " + TABLE_NAME + "(id integer primary key autoincrement,name text,location text,price integer,details text,available_rooms integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
