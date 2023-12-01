package com.example.btl_quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TrangChu extends AppCompatActivity {

    Button btnThemThu, btnThemChi;
    ImageButton imgtrang, imgthuchi, imgcaidat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        btnThemThu= findViewById(R.id.Btn_addThuNhap);
        btnThemChi= findViewById(R.id.Btn_addChiTieu);
        imgtrang= findViewById(R.id.imgtrangchu);
        imgthuchi= findViewById(R.id.imgthuChi);
        imgcaidat= findViewById(R.id.imgcaidat);

        btnThemThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnThemChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imgtrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trang= new Intent(TrangChu.this, TrangChu.class);
                startActivity(trang);
            }
        });

        imgthuchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thuchi= new Intent(TrangChu.this, ThuChi.class);
                startActivity(thuchi);
            }
        });

        imgcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caidat= new Intent(TrangChu.this, CaiDat.class);
                startActivity(caidat);
            }
        });
    }
}