package com.example.btl_quanlychitieu.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "USER";

    public database(@Nullable Context context) {
        super(context, "USER", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER(tennguoidung TEXT PRIMARY KEY, matkhau TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists USER");
    }

    public boolean themNguoidung(String tennguoidung, String matkhau) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("tennguoidung", tennguoidung);
        values.put("matkhau", matkhau);

        long result = db.insert("USER", null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean kiemtraNguoidung(String tennguoidung) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from USER where tennguoidung=?", new String[]{tennguoidung});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }
    public boolean kiemtraNguoiMatkhau(String tennguoidung, String matkhau) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from USER where tennguoidung=? and matkhau=?", new String[]{tennguoidung, matkhau});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }
}
    /*public static final int VERSION = 1;
    private static final String TABLE_LOAITHU = "loaithu";
    private static final String ID_TENLOAITHU = "idtenloaithu";
    private static final String TABLE_LOAICHI = "loaichi";
    private static final String ID_TENLOAICHI = "idtenloaichi";
    private static final String TABLE_KHOANTHU = "khoanthu";
    private static final String ID_KHOANTHU = "idtenkhoanthu";
    private static final String TABLE_KHOANCHI = "khoanchi";
    private static final String ID_KHOANCHI = "idtenkhoanchi";

    //  BẢNG LOẠI THU
    String ten_LoaiThu = null;
    String sql_loaithu= "CREATE TABLE " + TABLE_LOAITHU+"("+ID_TENLOAITHU+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ten_LoaiThu +"TEXT,";

    //  BẢNG LOẠI CHI
    String ten_LoaiChi = null;
    String sql_loaichi= "CREATE TABLE " + TABLE_LOAICHI+"("+ID_TENLOAICHI+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            +ten_LoaiChi+"TEXT,";

    // BẢNG KHOẢN THU
    String ten_khoanthu = null;
    private float so_tien;
    String sql_khoanthu= "CREATE TABLE " + TABLE_KHOANTHU+"("+ID_KHOANTHU+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            +ID_TENLOAITHU+" INTEGER, FOREIGN KEY ("+ID_TENLOAITHU+" ) REFERENCES "
            +ten_khoanthu+"TEXT,"
            +so_tien+"FLOAT,";

    //  BẢNG KHOẢN CHI
    String ten_khoanchi = null;
    String sql_khoanchi= "CREATE TABLE " + TABLE_KHOANCHI+"("+ID_KHOANCHI+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            +ID_TENLOAICHI+" INTEGER, FOREIGN KEY ("+ID_TENLOAICHI+" ) REFERENCES "
            +ten_khoanchi+"TEXT,";

    public database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql_loaithu);
        db.execSQL(sql_loaichi);
        db.execSQL(sql_khoanthu);
        db.execSQL(sql_khoanchi);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

        //  THÊM KHOẢN THU
    public long ThemKhoanThu(KhoanThu khoanThu){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(KhoanThu.loaithu, khoanThu.gettenloaithu(ten_LoaiThu));
        values.put(KhoanThu.khoanthu, khoanThu.gettenkhoanthu(ten_khoanthu));
        values.put(String.valueOf(KhoanThu.tien), khoanThu.getsotien(so_tien));
        long result= db.insert(TABLE_KHOANTHU, null, values);
        db.close();
        return result;
    }

        // LẤY DỮ LIỆU
    public Cursor getDataKhoanThu(){
        SQLiteDatabase db= this.getReadableDatabase();
        ArrayList<KhoanThu> khoanThuArrayList = new ArrayList<>();
        Cursor cursor= db.rawQuery("SELECT * FROM "+TABLE_KHOANTHU, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String tenkhoanthu= cursor.getString(0);
            String tenloaithu= cursor.getString(1);
            float sotien= cursor.getFloat(2);
            KhoanThu khoanThu= new KhoanThu(tenkhoanthu, tenloaithu, sotien);
            khoanThuArrayList.add(khoanThu);
            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return (Cursor) khoanThuArrayList;
    }*/
    // NGƯỜI DÙNG, MẬT KHẨU

