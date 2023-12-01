package com.example.btl_quanlychitieu.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.btl_quanlychitieu.ThemKhoanThu;
import com.example.btl_quanlychitieu.R;
import com.example.btl_quanlychitieu.model.KhoanThu;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class adapterKhoanThu extends BaseAdapter {

        // KHAI BÁO

    public static final int VERSION = 1;
    private static final String TABLE_LOAITHU = "loaithu";
    private static final String ID_TENLOAITHU = "idtenloaithu";
    private static final String TABLE_KHOANTHU = "khoanthu";
    private static final String ID_KHOANTHU = "idtenkhoanthu";

    private EditText edttenKhoanthu, edtsoThunhap;
    private Button btnThemThunhap, btnThemphanloai, btnluong, btnthuong;
    private ImageButton imgtrangchu, imgthuchi, imgcaidat;
    private ThemKhoanThu context;
    private ArrayList<KhoanThu> ArrayListKhoanThu;

    public adapterKhoanThu(ThemKhoanThu context, ArrayList<KhoanThu> arrayListKhoanThu) {
        this.context= context;
        ArrayListKhoanThu= arrayListKhoanThu;
    }

    @Override
    public int getCount() {
        return ArrayListKhoanThu.size();
    }

    @Override
    public Object getItem(int position) {
        return ArrayListKhoanThu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(R.layout.listkhoanthu, null);

        edttenKhoanthu= convertView.findViewById(R.id.edtnhapthu);
        edtsoThunhap= convertView.findViewById(R.id.edtsothu);
        btnThemThunhap= convertView.findViewById(R.id.btnChiTieu);
        btnThemphanloai= convertView.findViewById(R.id.btnploai1);
        btnluong= convertView.findViewById(R.id.btnan);
        btnthuong= convertView.findViewById(R.id.btnmua);
        imgtrangchu= convertView.findViewById(R.id.imgtrang);
        imgthuchi= convertView.findViewById(R.id.imgthuchi);
        imgcaidat= convertView.findViewById(R.id.imgcaidat);

        return null;
    }
    //@Override
    //public View getView (int position, View convertView, ViewGroup viewGroup){
      //  LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //convertView= inflater.inflate(R.layout.listkhoanthu, null);


        //return convertView;/

}
