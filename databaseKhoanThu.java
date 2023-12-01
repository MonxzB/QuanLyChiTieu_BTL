package com.example.btl_quanlychitieu.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databaseKhoanThu extends SQLiteOpenHelper {


    // THÊM KHOẢN THU
    public  static final String DB= "KHOANTHU";

    public databaseKhoanThu (@Nullable Context context) {
        super(context, "KHOANTHU", null, 1);
    }

    public databaseKhoanThu(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE KHOANTHU(tenKhoanthu TEXT PRIMARY KEY, loaiKhoanthu TEXT, soThunhap FLOAT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists KHOANTHU");
    }

    public boolean themKhoanThu (String tenKhoanthu, String loaiKhoanthu, float soThunhap){
        SQLiteDatabase dbthu = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("tenkhoanthu", tenKhoanthu);
        values.put("loaikhoanthu", loaiKhoanthu);
        values.put("sothunhap", soThunhap);

        long result = dbthu.insert("KHOANTHU", null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
}
