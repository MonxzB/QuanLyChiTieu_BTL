package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ThemKhoanThu extends AppCompatActivity {

    EditText edtkhoanthu, edtthunhap;
    ImageButton imgback, imgluong, imgthuong, imgtrang, imgthuchi, imgcaidat;
    Button btnphanloai, btnthunhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khoan_thu);

        edtkhoanthu= findViewById(R.id.edtnhapthu);
        edtthunhap= findViewById(R.id.edtsothu);
        imgback= findViewById(R.id.imgback);
        imgluong= findViewById(R.id.imgluong1);
        imgthuong= findViewById(R.id.imgthuong1);
        imgtrang= findViewById(R.id.imgtrangchu);
        imgthuchi= findViewById(R.id.imgthuchi);
        imgcaidat= findViewById(R.id.imgcaidat);
        btnphanloai= findViewById(R.id.btnploai1);
        btnthunhap= findViewById(R.id.btnChiTieu);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(ThemKhoanThu.this, TrangChu.class);
                startActivity(back);
            }
        });

        btnthunhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent them= new Intent(ThemKhoanThu.this, ThemKhoanThu.class);
                startActivity(them);
            }
        });

        btnphanloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phanloai= new Intent(ThemKhoanThu.this, ThemKhoanThu.class);
                startActivity(phanloai);
            }
        });

        imgtrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trang= new Intent(ThemKhoanThu.this, TrangChu.class);
                startActivity(trang);
            }
        });

        imgthuchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thuchi= new Intent(ThemKhoanThu.this, ThuChi.class);
                startActivity(thuchi);
            }
        });

        imgcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caidat= new Intent(ThemKhoanThu.this, CaiDat.class);
                startActivity(caidat);
            }
        });


    }
}