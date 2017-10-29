package com.example.amirafwan.androidsqlitecrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by amirafwan on 10/29/17.
 */

public class DataHelper extends SQLiteOpenHelper {
    //DB name
    private static final String DATABASE_NAME = "personalbiodata.db";
    //DB version
    private static final int DATABASE_VERSION = 1;

    //Constructor
    public DataHelper(Context context){

        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create table
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE biodata (no integer primary key, name text null, dob text null, gender text null, address text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    //if db exist
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
